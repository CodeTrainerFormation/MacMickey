package com.ib.macmickey.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Currency;
import java.util.Locale;

import com.ib.macmickey.entities.BigMickey;
import com.ib.macmickey.entities.Cola;
import com.ib.macmickey.entities.FrenchFries;
import com.ib.macmickey.entities.IcedTea;
import com.ib.macmickey.entities.Nuggets;
import com.ib.macmickey.entities.Potatoes;
import com.ib.macmickey.gui.MainWindow;
import com.ib.macmickey.utils.Utils;

public class ButtonListener implements ActionListener {

	private MainWindow mw;
	
	public ButtonListener(MainWindow _mw) {
		this.mw = _mw;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(this.mw.getCola() == ae.getSource()) {
			this.mw.getClient().askFor(new Cola());
		}else if(this.mw.getIcedtea() == ae.getSource()) {
			this.mw.getClient().askFor(new IcedTea());
		}else if(this.mw.getBigmickey() == ae.getSource()) {
			this.mw.getClient().askFor(new BigMickey());
		}else if(this.mw.getNuggets() == ae.getSource()) {
			this.mw.getClient().askFor(new Nuggets());
		}else if(this.mw.getFries() == ae.getSource()) {
			this.mw.getClient().askFor(new FrenchFries());
		}else if(this.mw.getPotatoes() == ae.getSource()) {
			this.mw.getClient().askFor(new Potatoes());
		}
		
		double price = Utils.round(this.mw.getClient().getCommand().getPrice(), 2);
		Currency cur = Currency.getInstance(Locale.getDefault());
		this.mw.getCurrentPrice().setText(Double.toString(price) + cur.getSymbol());
		this.mw.getDetail().setText(this.mw.getClient().generateDetailCommand());
	}

}
