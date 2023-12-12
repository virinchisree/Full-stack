package com.spring.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ImplDao implements MainDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String TicketBooking(BookingBean bean) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(bean);
		
		tx.commit();
		session.close();
		
		return Constants.SUCCESS;
	}

}
