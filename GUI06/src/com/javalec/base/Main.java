package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.javalec.function.Calculation;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private JButton btnEqual;
	private JComboBox cbOperator;

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
		frame.setTitle("계산기");
		frame.setBounds(100, 100, 450, 164);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtnEqual());
		frame.getContentPane().add(getCbOperator());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(22, 51, 74, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setColumns(10);
			tfNum2.setBounds(167, 51, 74, 26);
		}
		return tfNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setColumns(10);
			tfResult.setBounds(303, 51, 113, 26);
		}
		return tfResult;
	}
	private JButton getBtnEqual() {
		if (btnEqual == null) {
			btnEqual = new JButton("=");
			btnEqual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation(); 
				}
			});
			btnEqual.setBounds(247, 51, 55, 29);
		}
		return btnEqual;
	}
	private JComboBox getCbOperator() {
		if (cbOperator == null) {
			cbOperator = new JComboBox();
			cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
			cbOperator.setBounds(97, 52, 60, 27);
		}
		return cbOperator;
	}
	
	
	//FUNCTIONS
	
	private void calculation() {
		if(tfNum1.getText().equals("") || tfNum2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "숫자를 입력 하세요!");
		}else {
			int num1 = Integer.parseInt(tfNum1.getText());
			String strCalc = cbOperator.getSelectedItem().toString();
			int num2 = Integer.parseInt(tfNum2.getText());
			int result;
			Double result2;
			
			if(strCalc.equals("+")) {
				result = num1 + num2;
				tfResult.setText(Integer.toString(result)); 
			}else if(strCalc.equals("-")) {
				result = num1 - num2;
				tfResult.setText(Integer.toString(result)); 
			}else if(strCalc.equals("*")) {
				result = num1 * num2;
				tfResult.setText(Integer.toString(result));
			}else {
				result2 = (double)num1 / num2;
				tfResult.setText(String.format("%.2f", result2));
			
		}
	}
	
	
	

		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
