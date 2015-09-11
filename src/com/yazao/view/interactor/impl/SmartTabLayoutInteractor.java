package com.yazao.view.interactor.impl;

import java.util.ArrayList;
import java.util.List;

import com.yazao.view.bean.BaseEntity;
import com.yazao.view.interactor.Interactor;

public class SmartTabLayoutInteractor implements Interactor {

	@Override
	public List<BaseEntity> getPagerDatas() {
		List<BaseEntity> list = new ArrayList<BaseEntity>();
		
		list.add(new BaseEntity("Days", "星期"));
		list.add(new BaseEntity("Monday", "Mon"));
		list.add(new BaseEntity("Tuesday", "Tue"));
		list.add(new BaseEntity("Wednesday", "Wed"));
		list.add(new BaseEntity("Thursday", "Thu"));
		list.add(new BaseEntity("Friday", "Fri"));
		list.add(new BaseEntity("Saturday", "Sat"));
		list.add(new BaseEntity("Sunday", "Sun"));
		
		
		list.add(new BaseEntity("Month", "月份"));
		list.add(new BaseEntity("January", "Jan"));
		list.add(new BaseEntity("February", "Feb"));
		list.add(new BaseEntity("March", "Mar"));
		list.add(new BaseEntity("April", "Apr"));
		list.add(new BaseEntity("May", "May"));
		list.add(new BaseEntity("June", "Jun"));
		list.add(new BaseEntity("July", "Jul"));
		list.add(new BaseEntity("August", "Aug"));
		list.add(new BaseEntity("September", "Sept"));
		list.add(new BaseEntity("October", "Oct"));
		list.add(new BaseEntity("November", "Nov"));
		list.add(new BaseEntity("December", "Dec"));

		return list;
	}

}
