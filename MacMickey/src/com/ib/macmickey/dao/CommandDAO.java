package com.ib.macmickey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
