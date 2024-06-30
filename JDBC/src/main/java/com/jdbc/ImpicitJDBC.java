package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImpicitJDBC {
	
	final static String mysqlurl = "com.mysql.jdbc.driver";
	final static String url = "jdbc:msql://localhost:3306/person";
	final static String password = "root";
	final static String username = "root";
	
	public static void main(String[] args) {
		try {
			
//			Step 1: load or register driver(implicitly)
			Class.forName(mysqlurl);    //throws classnotfoundException
			
//			Step 2: Create connection
			Connection conn = DriverManager.getConnection(url, username, password);
			
//			Step 3 & 4: Create and execute statements
					
			PreparedStatement ps= conn.prepareStatement("INSERT INTO employee VALUES (?,?,?)");
			ps.setInt(1, 01);
			ps.setString(2, "Natso");
			ps.setInt(3, 27);
			
			ps= conn.prepareStatement("UPDATE employee SET Name=? where Id=?");
			ps.setInt(2, 01);
			ps.setString(1, "Gojo");
					
			ps.executeUpdate();
			
			ps= conn.prepareStatement("SELECT * FROM employee");
			
			ResultSet set=ps.executeQuery();
			
			while(set.next()) {
				System.out.println("Id :"+set.getInt(1));
				System.out.println("Name :"+set.getString(2));
				System.out.println("Age :"+set.getInt(3));
				System.out.println("=====================================");
			}
			
//			step 5: close connection
			
			conn.close();
					
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
