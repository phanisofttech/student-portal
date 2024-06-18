package com.pst.sp.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

	public static Connection getDatabaseConnection() {
		Properties properties = readCredentials();
		String driverName = properties.getProperty("driver_class_name");
		String databaseName = properties.getProperty("database_name");
		String userName = properties.getProperty("database_user_name");
		String password = properties.getProperty("database_password");
		String mysqlDbHost = "jdbc:mysql://localhost:3306/"+databaseName;
		Connection con = null;
		
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(mysqlDbHost, userName, password);
		}catch(ClassNotFoundException cnfe) {
		 	System.out.println("Driver not found: "+cnfe);
		}catch(SQLException se) {
		 	System.out.println("Database connection error: "+se);
		}catch(Exception e) {
		 	System.out.println("Internal server error "+e);
		}
		
		return con;
	}
	
	public static Properties readCredentials() {
		Properties props = null;
		try {
		FileInputStream fis = new FileInputStream("F:\\Internship\\Batch_5\\basics\\eclipse_workspace\\student_portal\\src\\main\\webapp\\resources\\db_credentials.properties");
		props = new Properties();
		props.load(fis);
		
		} catch(Exception e) {
			System.out.println("Credentials file not available in specified location "+e);
		}
		return props;
	}
	
	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (Exception e) {e.printStackTrace();}
	}
}
