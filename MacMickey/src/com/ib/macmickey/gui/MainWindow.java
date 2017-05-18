package com.ib.macmickey.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton ok = new JButton("OK");
		contentPane.add(BorderLayout.SOUTH, ok);
		
		JLabel lab = new JLabel("Hello");
		
		JTextField field = new JTextField();
		field.setColumns(10);
		
		JPanel northPane = new JPanel();
		northPane.add(lab);
		northPane.add(field);
		
		contentPane.add(BorderLayout.NORTH, northPane);
		
		setContentPane(contentPane);
		setVisible(true);
	}

}
