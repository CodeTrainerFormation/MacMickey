package com.ib.macmickey.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {
	
	private static DAOFactory instance;
	private Connection connection;
	
	private DAOFactory() {
		loadDriver();
		connect();
	}
	
	public static DAOFactory getInstance() {
		if(instance == null) {
			instance = new DAOFactory();
		}
		
		return instance;
	}
	
	private void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void connect() {
		String url = "jdbc:mysql://%s:%s/%s";
		
		String server = "localhost";
		String port = "3306";
		String db = "macmickey";
		
		String connStr = String.format(url, server, port, db);
		
		try {
			this.connection = DriverManager.getConnection(connStr, "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
	
}
