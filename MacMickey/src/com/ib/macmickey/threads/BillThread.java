package com.ib.macmickey.threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class BillThread extends Thread {

	private String detail;
	
	public BillThread(String s) {
		this.detail = s;
	}
	
	@Override
	public void run() {
		File f = new File("bills");
		if(!f.exists()) {
			f.mkdir();
		}
		
		String filename = "bill-" + new Date().getTime() + ".txt";
		
		try {
			FileWriter fw = new FileWriter("bills/"+filename);
			
			fw.write(this.detail);
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
