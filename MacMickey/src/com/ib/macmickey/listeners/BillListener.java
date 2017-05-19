package com.ib.macmickey.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

import com.ib.macmickey.entities.Client;

public class BillListener implements ActionListener{

	private Client client;
	
	public BillListener(Client c) {
		client = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		File f = new File("bills");
		if(!f.exists()) {
			f.mkdir();
		}
		
		String filename = "bill-" + new Date().getTime() + ".txt";
		
		try {
			FileWriter fw = new FileWriter("bills/"+filename);
			
			fw.write(client.generateDetailCommand());
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
