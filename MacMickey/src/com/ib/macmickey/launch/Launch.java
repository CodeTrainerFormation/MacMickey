package com.ib.macmickey.launch;

import java.util.Locale;

import com.ib.macmickey.entities.BigMickey;
import com.ib.macmickey.entities.Client;
import com.ib.macmickey.entities.Cola;
import com.ib.macmickey.entities.FrenchFries;
import com.ib.macmickey.entities.Nuggets;
import com.ib.macmickey.gui.MainWindow;
import com.ib.macmickey.threads.BillThread;

public class Launch {
	
	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.ENGLISH);
		
		MainWindow mw = new MainWindow(new Client());
	
		
	}
	
}
