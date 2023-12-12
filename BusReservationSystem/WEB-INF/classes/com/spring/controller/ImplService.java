package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplService implements MainService {

	@Autowired
	MainDao dao;
	
	
	@Override
	public String TicketBooking(BookingBean bean) {
	
		System.out.println("in the service method"+bean);
		
		System.out.println("inserting data into the database");
		
		return dao.TicketBooking(bean);
	}

}
