package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExplcitJDBC {
	
	final static String mysqlurl = "com.mysql.jdbc.driver";
	final static String url = "jdbc:msql://localhost:3306/person";
	final static String password = "root";
	final static String username = "root";
	
	public static void main(String[] args) {
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			Statement stmt = conn.createStatement();
			
			stmt.execute("Insert into person values (01,'Natso',27)");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
