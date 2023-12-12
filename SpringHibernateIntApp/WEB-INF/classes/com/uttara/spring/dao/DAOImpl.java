package com.uttara.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uttara.spring.controllers.RegBean;
import com.uttara.spring.util.Constants;

@Repository
public class DAOImpl implements DAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public String register(RegBean bean) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(bean);
		
		tx.commit();
		session.close();
		
		return Constants.SUCCESS;
		
	}

	public List<RegBean> getAllRegisteredUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
