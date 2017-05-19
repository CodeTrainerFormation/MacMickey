package com.ib.macmickey.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
		
		Properties prop = getConf();
		String server = prop.getProperty("server");
		String port = prop.getProperty("port");
		String db = prop.getProperty("dbname");
		
		String connStr = String.format(url, server, port, db);
		
		try {
			this.connection = DriverManager.getConnection(connStr, "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private Properties getConf() {
		
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("conf/db.properties");
			
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}

	public Connection getConnection() {
		return connection;
	}
	
}
