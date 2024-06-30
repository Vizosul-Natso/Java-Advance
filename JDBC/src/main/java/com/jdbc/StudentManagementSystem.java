package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class StudentManagementSystem {

	public static void main(String[] args) {
		
		
		try {
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver is loaded: "+driver);
			
			String url="jdbc:mysql://localhost: 3306/student";
			String username="root";
			String password="root";
			
			Connection connection= DriverManager.getConnection(url, username, password);
			System.out.println("connection made: "+connection);
			
			Statement stmt=connection.createStatement();

			stmt.execute("INSERT INTO student_details  VALUES (10,'Gojo',8729893008)");
			
//			stmt.execute("update student_management set NAME='Hoto' where ID=10");
			
			
			
			connection.close();
			System.out.println("data inserted...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
