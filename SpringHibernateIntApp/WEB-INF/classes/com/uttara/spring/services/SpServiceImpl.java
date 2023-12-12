package com.uttara.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uttara.spring.controllers.RegBean;
import com.uttara.spring.dao.DAO;

@Service
public class SpServiceImpl implements SpService {

	@Autowired
	DAO dao;
	
	public String register(RegBean bean) {
		
		//give bean to dao and ask it to persist
		return dao.register(bean);
	}

	public List<RegBean> getAllRegisteredUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
