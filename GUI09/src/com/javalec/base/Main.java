package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JPasswordField pfPassword1;
	private JButton btnShow;
	private JPasswordField pfPassword2;
	private JButton btnCompare;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getPfPassword1());
		frame.getContentPane().add(getBtnShow());
		frame.getContentPane().add(getPfPassword2());
		frame.getContentPane().add(getBtnCompare());
		frame.getContentPane().add(getLblResult());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(32, 55, 61, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPfPassword1() {
		if (pfPassword1 == null) {
			pfPassword1 = new JPasswordField();
			pfPassword1.setBounds(126, 50, 129, 26);
		}
		return pfPassword1;
	}
	private JButton getBtnShow() {
		if (btnShow == null) {
			btnShow = new JButton("show");
			btnShow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnShow.setBounds(274, 50, 117, 29);
		}
		return btnShow;
	}
	private JPasswordField getPfPassword2() {
		if (pfPassword2 == null) {
			pfPassword2 = new JPasswordField();
			pfPassword2.setBounds(126, 88, 129, 26);
		}
		return pfPassword2;
	}
	private JButton getBtnCompare() {
		if (btnCompare == null) {
			btnCompare = new JButton("compare");
			btnCompare.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comparePassword();
				}
			});
			btnCompare.setBounds(274, 91, 117, 29);
		}
		return btnCompare;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setBounds(126, 215, 203, 16);
		}
		return lblResult;
	}
	
	
	//FUNCTION
	
	
	private void checkPassword() {
		char[] pass = pfPassword1.getPassword();
		String passString = new String(pass);
		lblResult.setText(passString);
	}
	
	private void comparePassword() {
		char[] pass1 = pfPassword1.getPassword();
		String passString1 = new String(pass1);
		
		char[] pass2 = pfPassword2.getPassword();
		String passString2 = new String(pass2); 
		
		
		if(passString1.equals(passString2)) {
			lblResult.setText("Password 가 일치합니다.");
		}else 
			lblResult.setText("Password가 일치 하지 않습니다.");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
