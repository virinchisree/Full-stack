package com.uttara.spring.dao;

import java.util.List;

import com.uttara.spring.controllers.RegBean;

public interface DAO {

	public String register(RegBean bean);
	public List<RegBean> getAllRegisteredUsers();
}
