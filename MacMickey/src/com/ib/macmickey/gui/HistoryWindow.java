package com.ib.macmickey.gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HistoryWindow extends JPanel {
	
	public HistoryWindow() {
		
		CommandModel model = new CommandModel();
		JTable commandTable = new JTable(model);
		
		JScrollPane scroll = new JScrollPane(commandTable);
		this.add(scroll);
		
	}
}
