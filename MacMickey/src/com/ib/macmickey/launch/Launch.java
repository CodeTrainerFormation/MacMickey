package com.ib.macmickey.launch;

import com.ib.macmickey.entities.BigMickey;
import com.ib.macmickey.entities.Client;
import com.ib.macmickey.entities.Cola;
import com.ib.macmickey.entities.FrenchFries;
import com.ib.macmickey.entities.Nuggets;
import com.ib.macmickey.gui.MainWindow;

public class Launch {
	
	public static void main(String[] args) {
		
		MainWindow mw = new MainWindow(new Client());
		
//		Client c = new Client(1);
//		
//		c.askForMenus(new BigMickey(), new FrenchFries(), new Cola());
//		c.askFor(new Nuggets());
//		
//		c.showCommand();
//		c.showLeftMoney();
		
	}
	
}
