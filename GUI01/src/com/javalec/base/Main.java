package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.javalec.function.Addition;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmGuitest;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField tfResult;
	private JButton btnAdd;
	private JTextField tfNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmGuitest.setVisible(true);
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
		frmGuitest = new JFrame();
		frmGuitest.setTitle("GUI_Test01");
		frmGuitest.setBounds(100, 100, 352, 172);
		frmGuitest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuitest.getContentPane().setLayout(null);
		frmGuitest.getContentPane().add(getLblNewLabel());
		frmGuitest.getContentPane().add(getTfNum1());
		frmGuitest.getContentPane().add(getLblNewLabel_1());
		frmGuitest.getContentPane().add(getTfNum2());
		frmGuitest.getContentPane().add(getLblNewLabel_1_1());
		frmGuitest.getContentPane().add(getTfResult());
		frmGuitest.getContentPane().add(getBtnAdd());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Java GUI Example 01");
			lblNewLabel.setBounds(41, 23, 139, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(41, 51, 70, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("+");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(119, 53, 24, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("=");
			lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblNewLabel_1_1.setBounds(221, 53, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setColumns(10);
			tfResult.setBounds(249, 51, 70, 26);
		}
		return tfResult;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
				}
			});
			btnAdd.setBounds(38, 89, 73, 29);
		}
		return btnAdd;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(139, 51, 70, 26);
		}
		return tfNum2;
	}
	
		
	
	// ----Function
	
	private void addAction() {
//		System.out.println("Button is clicked!");
		if(tfNum1.getText().equals("")|| tfNum2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "숫자를 입력하세요!");
		}else {
		Addition addition = new Addition(Integer.parseInt(tfNum1.getText()),Integer.parseInt(tfNum2.getText()));
		tfResult.setText(Integer.toString(addition.add()));
		
			
		
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}//End
