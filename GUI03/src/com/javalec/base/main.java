package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.javalec.function.Addition;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField tfStartNum;
	private JTextField tfEndNum;
	private JTextField tfSum;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setTitle("범위의 숫자 합계 구하기");
		frame.setBounds(100, 100, 406, 198);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_1_1());
		frame.getContentPane().add(getTfStartNum());
		frame.getContentPane().add(getTfEndNum());
		frame.getContentPane().add(getTfSum());
		frame.getContentPane().add(getBtnNewButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setBounds(31, 40, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setBounds(31, 109, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("합계");
			lblNewLabel_1_1.setBounds(227, 109, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfStartNum() {
		if (tfStartNum == null) {
			tfStartNum = new JTextField();
			tfStartNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfStartNum.setBounds(85, 35, 85, 26);
			tfStartNum.setColumns(10);
		}
		return tfStartNum;
	}
	private JTextField getTfEndNum() {
		if (tfEndNum == null) {
			tfEndNum = new JTextField();
			tfEndNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfEndNum.setColumns(10);
			tfEndNum.setBounds(85, 104, 85, 26);
		}
		return tfEndNum;
	}
	private JTextField getTfSum() {
		if (tfSum == null) {
			tfSum = new JTextField();
			tfSum.setEditable(false);
			tfSum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSum.setColumns(10);
			tfSum.setBounds(259, 104, 106, 26);
		}
		return tfSum;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("합계 구하기");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
				}
			});
			btnNewButton.setBounds(248, 35, 117, 29);
		}
		return btnNewButton;
	}
	
	private void addAction() {
		
		if(tfStartNum.getText().equals("")|| tfEndNum.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "숫자를 입력하세요!");
		}else {
			Addition addition = new Addition(Integer.parseInt(tfStartNum.getText()),Integer.parseInt(tfEndNum.getText()));
			tfSum.setText(Integer.toString(addition.add()));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
