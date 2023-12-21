package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfAddress;
	private JLabel lblNewLabel_1;
	private JTextField tfMail;
	private JComboBox cbMail;
	private JLabel lblNewLabel_2;

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
		frame.setTitle("전자우편 주소 결정");
		frame.setBounds(100, 100, 500, 178);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfMail());
		frame.getContentPane().add(getCbMail());
		frame.getContentPane().add(getLblNewLabel_2());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Email주소 :");
			lblNewLabel.setBounds(6, 64, 76, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setBounds(76, 59, 120, 26);
			tfAddress.setColumns(10);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("@");
			lblNewLabel_1.setBounds(199, 64, 23, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfMail() {
		if (tfMail == null) {
			tfMail = new JTextField();
			tfMail.setColumns(10);
			tfMail.setBounds(218, 59, 130, 26);
		}
		return tfMail;
	}
	private JComboBox getCbMail() {
		if (cbMail == null) {
			cbMail = new JComboBox();
			cbMail.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboAction();
					addAction(); 
				}
			});
			cbMail.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "daum.net", "gmail.com", "icloud.com"}));
			cbMail.setBounds(360, 60, 130, 27);
		}
		return cbMail;
	}
	
	
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBounds(187, 117, 303, 16);
		}
		return lblNewLabel_2;
	}

	
	//FUNCTIONS
	
	private void comboAction() {
		String strMail = cbMail.getSelectedItem().toString();      //change to string first! 
		tfMail.setText(strMail);
		
	}
	
	private void addAction() {
		lblNewLabel_2.setText( "당신의 이메일 주소는 " + tfAddress.getText() + "@" + tfMail.getText() + " 입니다.");
		
	
	}
	
	
	
	
	
	
	
	
	
	
}
