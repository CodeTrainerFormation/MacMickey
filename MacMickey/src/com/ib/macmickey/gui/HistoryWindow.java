package com.ib.macmickey.gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HistoryWindow extends JPanel {
	
	private CommandModel cmdModel;
	
	public HistoryWindow() {
		
		this.cmdModel = new CommandModel();
		JTable commandTable = new JTable(this.cmdModel);
		
		JScrollPane scroll = new JScrollPane(commandTable);
		this.add(scroll);
		
	}

	public CommandModel getCmdModel() {
		return cmdModel;
	}
	
	
}
