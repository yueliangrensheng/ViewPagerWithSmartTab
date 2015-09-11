package com.yazao.view.ui.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.Bind;
import butterknife.ButterKnife;

import com.yazao.lib.smartlayout.SmartTabLayout;
import com.yazao.view.bean.BaseEntity;
import com.yazao.view.presenter.impl.SmartTabLayoutPresenter;
import com.yazao.view.ui.adapter.SmartTabLayoutAdapter;
import com.yazao.view.ui.fragment.MainFragment;
import com.yazao.view.view.SmartTabLayoutView;
import com.yazao.view.viewpagerwithsmarttab.R;

public class MainActivity extends AppCompatActivity implements
		SmartTabLayoutView, OnPageChangeListener {

	@Bind(R.id.smartTabLayout)
	SmartTabLayout smartTabLayout;
	@Bind(R.id.viewPager)
	ViewPager viewPager;

	private SmartTabLayoutPresenter presenter;
	private List<Fragment> fragments = new ArrayList<Fragment>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		smartTabLayout=(SmartTabLayout) findViewById(R.id.smartTabLayout);
		viewPager = (ViewPager) findViewById(R.id.viewPager);
		
		ButterKnife.bind(this);

		presenter = new SmartTabLayoutPresenter(this, this);
		presenter.initialized();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void initializePagerViews(List<BaseEntity> datas) {
		if (datas != null && !datas.isEmpty()) {
			initData(datas);
			viewPager.setCurrentItem(0);
			viewPager.setOffscreenPageLimit(2);
			viewPager.setAdapter(new SmartTabLayoutAdapter(
					getSupportFragmentManager(),datas, fragments));
			smartTabLayout.setViewPager(viewPager);
			smartTabLayout.setOnPageChangeListener(this);

		}
	}

	private void initData(List<BaseEntity> datas) {
		for (int j = 0; j < datas.size(); j++) {
			fragments.add(MainFragment.newInstantiate(MainActivity.this, datas
					.get(j).getName()));
		}
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {

	}

	@Override
	public void onPageSelected(int arg0) {

	}
}
