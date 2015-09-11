package com.yazao.view.ui.fragment;

import butterknife.Bind;
import butterknife.ButterKnife;

import com.yazao.view.viewpagerwithsmarttab.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainFragment extends Fragment{
	
	
	@Bind(R.id.fragemnt_tv)
	TextView fragemnt_tv;
	

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		System.out.println("onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		System.out.println("onAttach");
		super.onAttach(activity);
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		System.out.println("onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Bundle bundle = getArguments();
		String name = bundle.getString("name");
		
		System.out.println("onCreateView");
		View view = inflater.inflate(R.layout.fragemnt_main,container,false);
		ButterKnife.bind(this,view);
		fragemnt_tv=(TextView) view.findViewById(R.id.fragemnt_tv);
		fragemnt_tv.setText(name);
		
		return view;
	}

	@Override
	public void onDestroy() {
		System.out.println("onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		System.out.println("onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		System.out.println("onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		System.out.println("onPause");
		super.onPause();
	}

	@Override
	public void onResume() {
		System.out.println("onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		System.out.println("onStart");
		super.onStart();
	}

	@Override
	public void onStop() {
		System.out.println("onStop");
		super.onStop();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		System.out.println("onViewCreated");
		super.onViewCreated(view, savedInstanceState);
	}

	public static Fragment newInstantiate(Activity activity, String name) {
		MainFragment fragment =new MainFragment();
		Bundle bundle=new Bundle();
		bundle.putString("name", name);
		fragment.setArguments(bundle);
		
		return fragment;
	}
	
	

}
