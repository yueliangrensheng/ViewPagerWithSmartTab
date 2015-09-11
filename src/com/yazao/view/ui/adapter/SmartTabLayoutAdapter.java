package com.yazao.view.ui.adapter;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yazao.view.bean.BaseEntity;

public class SmartTabLayoutAdapter extends FragmentPagerAdapter {
	private List<BaseEntity> datas = new ArrayList<BaseEntity>();
	private List<Fragment> fragments = new ArrayList<Fragment>();

	public SmartTabLayoutAdapter(FragmentManager supportFragmentManager,
			List<BaseEntity> datas, List<Fragment> fragments) {
		super(supportFragmentManager);
		this.fragments = fragments;
		this.datas = datas;
	}

	@Override
	public Fragment getItem(int arg0) {
		
		return fragments.get(arg0);
	}

	@Override
	public int getCount() {

		return datas.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return datas.get(position).getId();
	}

}
