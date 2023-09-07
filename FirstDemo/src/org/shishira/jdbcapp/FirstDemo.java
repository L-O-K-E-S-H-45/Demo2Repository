package org.shishira.jdbcapp;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class FirstDemo {
	public static void main(String[] args) {
		
		// First Method
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("mysql driver loaded successfully!!!!");
//		} catch (ClassNotFoundException e) {
//			System.out.println("mysql driver loading failed!!!");
//		}
		
		// Second Method
		try {
			Driver mysql = new Driver();
			DriverManager.registerDriver(mysql);
			System.out.println("Driver loaded successfully!!!!");
		} catch (SQLException e) {
			System.out.println("damaarrr......some exception!!!");
		}

	}
}
