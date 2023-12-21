package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmDialog;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDialog = new JFrame();
		frmDialog.setTitle("Dialog");
		frmDialog.setBounds(100, 100, 450, 300);
		frmDialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDialog.getContentPane().setLayout(null);
		frmDialog.getContentPane().add(getBtnNewButton());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("HELP");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					help();
				}
			});
			btnNewButton.setBounds(158, 108, 117, 29);
		}
		return btnNewButton;
	}
	
	//FUNCTIONS
	
	private void help() {
		frmDialog.setVisible(false);
		Help help = new Help();
		help.setVisible(true);
	}
	
	public void setVisible(boolean action) {
		Main window = new Main();
		window.frmDialog.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
}
