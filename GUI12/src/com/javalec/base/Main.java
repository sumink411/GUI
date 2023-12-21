package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.javalec.util.Share;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

	private JFrame frmMenu;
	private JButton btnRegistration;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmMenu.setVisible(true);
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
		frmMenu = new JFrame();
		frmMenu.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				checkStatus(); 
			}
		});
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 450, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		frmMenu.getContentPane().add(getBtnRegistration());
		frmMenu.getContentPane().add(getLblResult());
	}
	private JButton getBtnRegistration() {
		if (btnRegistration == null) {
			btnRegistration = new JButton("사용자등록");
			btnRegistration.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					userRegistration();
				}
			});
			btnRegistration.setBounds(149, 75, 117, 29);
		}
		return btnRegistration;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setBounds(123, 116, 235, 110);
		}
		return lblResult;
	}
	
	
	//FUNCTIONS
	
	private void userRegistration() {
		
		UserRegistration registration = new UserRegistration(); 
		registration.setVisible(true);
		frmMenu.setVisible(false);
		
		
	}
	
	
	private void checkStatus() {
		if(!Share.userid.equals("")) {
			String str;
			str = "<html>당신의 아이디는" + Share.userid + "이고 <br> 당신의 이름은 " + Share.name + "이며 <br>당신의 패스워드는 " + Share.password + "입니다.</html>";
		    lblResult.setText(str);
			Share.userid = ""; 
		}
		
		
		
	}
	
	
	
	
}
