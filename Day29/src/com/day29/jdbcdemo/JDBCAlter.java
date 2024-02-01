package com.day29.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCAlter {


	public static void main(String[] args) {
		
		try {
			
			// Step 1: load or register the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded Sucessfully!");
			
			// Step 2: Create connection between java and db
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			System.out.println("Connection Sucessfully!");
			
			// Step 3: Create statement object
			Statement stmt = conn.createStatement();
			
			// Step 4: Write A Query
			// String query = "CREATE TABLE student(studid int, name varchar(20), subject varchar(30), duration double) ";
			
			String query ="ALTER TABLE student ADD PRIMARY KEY(studid)";
			
			int s = stmt.executeUpdate(query);
			
			System.out.println("Query Execute: " + s);
			

		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}
}
