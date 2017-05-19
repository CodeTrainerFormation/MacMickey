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
import com.ib.macmickey.threads.BillThread;

public class BillListener implements ActionListener{

	private Client client;
	
	public BillListener(Client c) {
		client = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		new BillThread(client.generateDetailCommand()).start();
		
	}
	
}
