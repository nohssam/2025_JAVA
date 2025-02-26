package com.ict.repository;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
	private static String URL ;
	private static String USER ;
	private static String PASSWORD;
	
	// static 초기화
	static {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("resources/config.properties"));
			URL = properties.getProperty("db.url");
			USER = properties.getProperty("db.user");
			PASSWORD = properties.getProperty("db.password");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// DB와 실제 연결 하는 메서드 
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}








