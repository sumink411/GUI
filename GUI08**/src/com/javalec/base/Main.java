package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.javalec.function.Addition;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfStartNum;
	private JRadioButton btnAll;
	private JRadioButton btnEven;
	private JRadioButton btnOdd;
	private JLabel lblNewLabel_1;
	private JTextField tfEndNum;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1_1;
	private JTextField tfSum;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		frame.setTitle("합계구하기");
		frame.setBounds(100, 100, 450, 226);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfStartNum());
		frame.getContentPane().add(getBtnAll());
		frame.getContentPane().add(getBtnEven());
		frame.getContentPane().add(getBtnOdd());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfEndNum());
		frame.getContentPane().add(getBtnNewButton());
		frame.getContentPane().add(getLblNewLabel_1_1());
		frame.getContentPane().add(getTfSum());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setBounds(22, 38, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfStartNum() {
		if (tfStartNum == null) {
			tfStartNum = new JTextField();
			tfStartNum.setBounds(95, 33, 69, 26);
			tfStartNum.setColumns(10);
		}
		return tfStartNum;
	}
	private JRadioButton getBtnAll() {
		if (btnAll == null) {
			btnAll = new JRadioButton("전체");
			buttonGroup.add(btnAll);
			btnAll.setBounds(175, 34, 69, 23);
		}
		return btnAll;
	}
	private JRadioButton getBtnEven() {
		if (btnEven == null) {
			btnEven = new JRadioButton("짝수");
			buttonGroup.add(btnEven);
			btnEven.setSelected(true);
			btnEven.setBounds(244, 34, 69, 23);
		}
		return btnEven;
	}
	private JRadioButton getBtnOdd() {
		if (btnOdd == null) {
			btnOdd = new JRadioButton("홀수");
			buttonGroup.add(btnOdd);
			btnOdd.setBounds(312, 34, 69, 23);
		}
		return btnOdd;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setBounds(22, 84, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfEndNum() {
		if (tfEndNum == null) {
			tfEndNum = new JTextField();
			tfEndNum.setColumns(10);
			tfEndNum.setBounds(95, 79, 69, 26);
		}
		return tfEndNum;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("계산하기");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction(); 
				}
			});
			btnNewButton.setBounds(185, 79, 117, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("합계");
			lblNewLabel_1_1.setBounds(22, 149, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfSum() {
		if (tfSum == null) {
			tfSum = new JTextField();
			tfSum.setColumns(10);
			tfSum.setBounds(95, 144, 130, 26);
		}
		return tfSum;
	}
	
	
private void addAction() {
		
	if (btnAll.isSelected()) {
		
		Addition addition = new Addition(Integer.parseInt(tfStartNum.getText()),Integer.parseInt(tfEndNum.getText()));
		tfSum.setText(Integer.toString(addition.add()));
	}
	
	
	if(btnEven.isSelected()) {
		
		
		
		
	}
	
	
	
	
	
	
	
	
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
