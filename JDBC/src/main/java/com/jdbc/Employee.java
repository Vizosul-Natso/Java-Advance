package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		int Id;
		String Name;
		int Age;
		double Sal;
		long Phno;
		String BloodGroup;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection= DriverManager.getConnection
					("jdbc:mysql://localhost:3306/employee?user=root&password=root");
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter The Number Requried From 1 To 5");
			System.out.println("1- Inserting Values");
			System.out.println("2- Fetching The Data");
			System.out.println("3- Updating The Values");
			System.out.println("4- Deleting The Data");
			System.out.println("5- Exit Application");
			System.out.print("=>");
			
			int number=sc.nextInt();
			
			switch(number) {
			
			case 1: 
			System.out.println("INSERT THE DATA");
			System.out.print("ID:");
			Id= sc.nextInt();
			System.out.print("NAME:");
			Name=sc.next();
			System.out.print("AGE:");
			Age= sc.nextInt();
			System.out.print("SALARY:");
			Sal= sc.nextDouble();
			System.out.print("PHONE-NUMBER:");
			Phno=sc.nextLong();
			System.out.print("BLOOD-GROUP:");
			BloodGroup= sc.next();
			
			PreparedStatement ps= connection.prepareStatement("INSERT INTO employee VALUES (?,?,?,?,?,?)");
			ps.setInt(1, Id);
			ps.setString(2, Name);
			ps.setInt(3, Age);
			ps.setDouble(4, Sal);
			ps.setLong(5, Phno);
			ps.setString(6, BloodGroup);
			
			
			ps.execute();
			System.out.println("Data inserted");
			break;
			
			case 2:
				System.out.println("Enter 1 or 2");
				System.out.println("1- Fetching all data");
				System.out.println("2- Fetching according to ID");
				System.out.print("=>");
				int a=sc.nextInt();
				if(a==1) {
					System.out.println("Fetching all data");
					System.out.println();
					System.out.println("**********************************");
					
				PreparedStatement ps1= connection.prepareStatement("SELECT * FROM employee");
				
				ResultSet set=ps1.executeQuery();
				
				while(set.next()) {
					System.out.println("Id :"+set.getInt(1));
					System.out.println("Name :"+set.getString(2));
					System.out.println("Age :"+set.getInt(3));
					System.out.println("Salary :"+set.getDouble(4));
					System.out.println("Phone-Number :"+set.getLong(5));
					System.out.println("Blood-Group :"+set.getString(6));
					System.out.println();
					System.out.println("=====================================");
				}
				
				}else if(a==2) {
					System.out.println("Fetching according to ID");
					System.out.println("Enter the ID Number");
					int num= sc.nextInt();
					 Id=0;
					if(num > Id) {
					PreparedStatement ps2= connection.prepareStatement("SELECT * FROM employee where Id=? ");
					
					ps2.setInt(1, num);
					
					ResultSet set= ps2.executeQuery();
					
					while(set.next()) {
						System.out.println(set.getInt(1));
					System.out.println(set.getString(2));
						System.out.println(set.getInt(3));
						System.out.println(set.getDouble(4));
					System.out.println(set.getLong(5));
						System.out.println(set.getString(6));
						System.out.println();
						System.out.println("=====================================");
					}
					
					
					}
				
				}else {
					System.out.println("Please Enter The Correct Value");
				}
				
			break;
			
			case 3:
				System.out.println("UPDATE THE DATA");
				System.out.println("Enter ID To Update The Name");
				System.out.print("ID :");
				Id= sc.nextInt();
				System.out.print("Enter new Name:");
				Name=sc.next();
//				Age= sc.nextInt();
//				Sal= sc.nextDouble();
//				Phno=sc.nextLong();
//				BloodGroup= sc.next();
				
				
				PreparedStatement ps3= connection.prepareStatement("UPDATE employee SET Name=? where Id=?");
				ps3.setInt(2, Id);
				ps3.setString(1, Name);
//				ps3.setInt(3, Age);
//				ps3.setDouble(4, Sal);
//				ps3.setLong(5, Phno);
//				ps3.setString(6, BloodGroup);
				
//				ps3.setInt(2, 4);
//				ps3.setString(1, "Conan");
//				ps3.setInt(3, Age);
//				ps3.setDouble(4, Sal);
//				ps3.setLong(5, Phno);
//				ps3.setString(6, BloodGroup);
				
				int flag= ps3.executeUpdate();
				System.out.println("Number of data updated: "+flag);
				
				break;
			
			case 4:
				
				
				System.out.println("DELETING THE DATA");
				System.out.println("Enter ID To Delete The Entire Row");
				Id= sc.nextInt();
				
				PreparedStatement ps4= connection.prepareStatement("DELETE FROM employee WHERE Id=?");
				ps4.setInt(1, Id);
				
				int flag1=ps4.executeUpdate();
				System.out.println("Number of rows deleted: "+flag1);
				
				break;
				
			case 5:
				
				System.out.println("Application Closed!!!");
				break;
				
			default:
				System.out.println("Please enter the correct value.");
			
						
			}
			
			connection.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
