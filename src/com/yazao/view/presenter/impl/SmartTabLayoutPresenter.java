package com.yazao.view.presenter.impl;

import android.content.Context;

import com.yazao.view.interactor.impl.SmartTabLayoutInteractor;
import com.yazao.view.presenter.Presenter;
import com.yazao.view.view.SmartTabLayoutView;

public class SmartTabLayoutPresenter implements Presenter{
	
	private SmartTabLayoutView smartTabLayoutView;
	private SmartTabLayoutInteractor smartTabLayoutInteractor;

	public SmartTabLayoutPresenter(Context context,
			SmartTabLayoutView smartTabLayoutView) {
		this.smartTabLayoutView=smartTabLayoutView;
		smartTabLayoutInteractor =new SmartTabLayoutInteractor();
		
	}

	@Override
	public void initialized() {
		smartTabLayoutView.initializePagerViews(smartTabLayoutInteractor.getPagerDatas());
	}

}
