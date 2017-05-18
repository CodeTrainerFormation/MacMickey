package com.ib.macmickey.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.ib.macmickey.entities.Client;
import com.ib.macmickey.listeners.ButtonListener;

public class MainWindow extends JFrame {

	private Client client;
	private JPanel contentPane;
	private ResourceBundle ihmBundle;
	private JTextField currentPrice;
	private JButton reset, validate, bigmickey,
			nuggets, cola, icedtea, fries, potatoes;
	private JTextArea detail;

	public MainWindow(Client _client) {
		this.client = _client;
		this.ihmBundle = ResourceBundle.getBundle("com.ib.macmickey.i18n.ihm");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		this.createMainPane();
		
		setContentPane(contentPane);
		setVisible(true);
	}
	
	public void createMainPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel northPane = new JPanel();
		JPanel southPane = new JPanel();
		
		// NORTH
		this.currentPrice = new JTextField("");
		currentPrice.setEditable(false);
		currentPrice.setColumns(10);
		northPane.add(currentPrice);
		
		// SOUTH
		this.reset = new JButton(ihmBundle.getString("cancel"));
		reset.addActionListener(new ButtonListener(this));
		southPane.add(reset);
		
		this.validate = new JButton(ihmBundle.getString("validate"));
		southPane.add(validate);
		
		//CENTER
		JPanel centerPane = new JPanel();
		centerPane.setLayout(new BoxLayout(centerPane, BoxLayout.X_AXIS));
		
		JPanel centerLeftPane = new JPanel();
		centerPane.add(centerLeftPane);
		
		JPanel centerRightPane = new JPanel();
		centerPane.add(centerRightPane);
		
		JPanel choicePane = new JPanel();
		choicePane.setLayout(new GridLayout(3,2));
		
		centerLeftPane.add(choicePane);
		
		this.bigmickey = new JButton(ihmBundle.getString("bigmickey"));
		this.nuggets = new JButton(ihmBundle.getString("nuggets"));
		this.cola = new JButton(ihmBundle.getString("cola"));
		this.icedtea = new JButton(ihmBundle.getString("icedtea"));
		this.fries = new JButton(ihmBundle.getString("fries"));
		this.potatoes = new JButton(ihmBundle.getString("potatoes"));
		
		ArrayList<JButton> productButtons = new ArrayList<>();
		
		productButtons.add(bigmickey);
		productButtons.add(nuggets);
		productButtons.add(cola);
		productButtons.add(icedtea);
		productButtons.add(fries);
		productButtons.add(potatoes);
		
		for(JButton pBtn : productButtons) {
			pBtn.addActionListener(new ButtonListener(this));
			choicePane.add(pBtn);
		}
		
		detail = new JTextArea();
		detail.setColumns(15);
		detail.setRows(20);
		detail.setEditable(false);
		centerRightPane.add(detail);
		
		contentPane.add(northPane, BorderLayout.NORTH);
		contentPane.add(southPane, BorderLayout.SOUTH);
		contentPane.add(centerPane, BorderLayout.CENTER);
		
	}

	public JTextField getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(JTextField currentPrice) {
		this.currentPrice = currentPrice;
	}

	public JButton getReset() {
		return reset;
	}

	public JButton getValidate() {
		return validate;
	}

	public Client getClient() {
		return client;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public ResourceBundle getIhmBundle() {
		return ihmBundle;
	}

	public JButton getBigmickey() {
		return bigmickey;
	}

	public JButton getNuggets() {
		return nuggets;
	}

	public JButton getCola() {
		return cola;
	}

	public JButton getIcedtea() {
		return icedtea;
	}

	public JButton getFries() {
		return fries;
	}

	public JButton getPotatoes() {
		return potatoes;
	}

	public JTextArea getDetail() {
		return detail;
	}
	
	
}
