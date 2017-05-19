package com.ib.macmickey.gui;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

import com.ib.macmickey.dao.CommandDAO;

public class CommandModel extends AbstractTableModel{

	private ResultSet commands;
	
	public CommandModel() {
		getData();
	}
	
	public void refreshData() {
		this.getData();
	}
	
	private void getData() {
		CommandDAO dao = new CommandDAO();
		
		this.commands = dao.getCommands();
	}
	
	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		System.out.println("sdfsd");
		if(this.commands == null) {
			return 0;
		}
		
		try {
			this.commands.last();
			return this.commands.getRow();
		} catch (SQLException e) {
			return 0;
		}
	}

	@Override
	public Object getValueAt(int row, int col) {
		try {
			this.commands.absolute(row+1);
			
			//return this.commands.getObject(col);
			switch(col) {
				case 0:
					return this.commands.getInt("id");
				case 1:
					return this.commands.getDouble("amount");
				case 2:
					return this.commands.getDate("created_at");
				default:
					return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public String getColumnName(int col) {
		switch(col) {
			case 0:
				return "Identifiant";
			case 1:
				return "Montant";
			case 2:
				return "Créé le";
			default:
				return null;
		}
	}

	
}
