package com.uttara.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class MainDAOimp implements MainDAO {

	@Override
	public String register(RegBean bean) {
		
		Connection con = null;
		PreparedStatement ps1 = null;
		ResultSet rs = null;
		try {
			
			con = JDBCHelper.getConnection();
			ps1 = con.prepareStatement("insert into Register(firstname,lastname,emailid,dob,address,password) values(?,?,?,?,?,?)");
			ps1.setString(1, bean.getFirstname());
			ps1.setString(2, bean.getLastname());
			ps1.setString(3, bean.getEmailid());
			ps1.setDate(4, new java.sql.Date(bean.getDob().getTime()));
			ps1.setString(5, bean.getAddress());
			ps1.setString(6, bean.getPassword());
			ps1.execute();
			rs = ps1.getResultSet();
			
			return Constants.SUCCESS;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "there has been a error"+e.getMessage();
		}
		
		finally {
			
			JDBCHelper.close(ps1);
			JDBCHelper.close(con);
		}
	}

}
