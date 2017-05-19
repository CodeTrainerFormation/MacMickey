package com.ib.macmickey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ib.macmickey.entities.Command;

public class CommandDAO {

	private Connection connection;
	
	public CommandDAO() {
		this.connection = DAOFactory.getInstance().getConnection();
	}
	
	// créer une methode qui insert une commande
	public void insertCommand(Command c) {
		String sql = "INSERT INTO orders (amount) VALUES (?)";
		
		try {
			PreparedStatement prep = this.connection.prepareStatement(sql);
			prep.setDouble(1, c.getPrice());
			
			prep.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// créer une méthode qui recupère toutes les commandes
	public ResultSet getCommands() {
		String sql = "SELECT * FROM orders";
		
		ResultSet commands = null;
		
		try {
			Statement stmt = this.connection.createStatement();
			
			commands = stmt.executeQuery(sql);
			
			return commands;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
