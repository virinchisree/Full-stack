package com.uttara.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.uttara.test.Constants;

public class JDBCHelper {

	public static void close(Connection x)
	{
		if(x!=null)
			try {
				x.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void close(Statement x)
	{
		if(x!=null)
			try {
				x.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void close(ResultSet x)
	{
		if(x!=null)
			try {
				x.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static Connection getConnection()
	{
		try
		{
			//load driver
			Class.forName(Constants.DRIVER);
			//establish conn
			Connection con = DriverManager.getConnection(Constants.URL,Constants.UID,Constants.PWD);
			return con;
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
