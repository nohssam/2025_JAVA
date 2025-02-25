package com.library.repository;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
	private static String URL ;
	private static String USER ;
	private static String PASSWORD;
	
	// static  초기화
	static {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("resources/config.properies"));
			URL = properties.getProperty("db.url");
			USER = properties.getProperty("db.user");
			PASSWORD = properties.getProperty("db.password");
			
			// 1.드라이버 연결 
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	// 2.접속하기 
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
}
