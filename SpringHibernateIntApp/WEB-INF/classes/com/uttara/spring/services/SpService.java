package com.uttara.spring.services;

import java.util.List;

import com.uttara.spring.controllers.RegBean;

public interface SpService {

	public String register(RegBean bean);
	public List<RegBean> getAllRegisteredUsers();
}
