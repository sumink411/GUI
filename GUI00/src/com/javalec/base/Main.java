package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Main {

	private JFrame frmGui;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmGui.setVisible(true);
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
		frmGui = new JFrame();
		frmGui.getContentPane().setBackground(Color.ORANGE);
		frmGui.setTitle("GUI00");
		frmGui.setBounds(100, 100, 450, 300);
		frmGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGui.getContentPane().setLayout(null);
		frmGui.getContentPane().add(getLblNewLabel());
		frmGui.getContentPane().add(getBtnNewButton());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("안녕하세요");
			lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
			lblNewLabel.setBounds(32, 32, 125, 27);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Alert");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnAlert();
				}
			});
			btnNewButton.setBounds(185, 32, 117, 29);
		}
		return btnNewButton;
	}
	
	//-------- Functions -------
	
	private void btnAlert() {
		JOptionPane.showMessageDialog(null, "Alert를 눌렀습니다");
	}
}
