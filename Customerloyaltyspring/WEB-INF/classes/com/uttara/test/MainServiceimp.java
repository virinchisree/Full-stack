package com.uttara.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceimp implements MainService {

	@Autowired
	private MainDAO dao;
	@Override
	public String register(RegBean bean) {
		
		System.out.println("in the service method"+bean);
		
		//calling dao method for insertion
		System.out.println("inserting data into db"+dao.register(bean));
		//returing success string
		return Constants.SUCCESS;
	}

}
