package com.mphasis.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static Connection conn;
	public static Connection getConnection() {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		conn=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:xe", "shwe", "123");
		}catch(SQLException |ClassNotFoundException s) {
			s.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	

}
