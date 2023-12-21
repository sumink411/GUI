package com.javalec.base;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.javalec.function.Addition;
import com.javalec.function.Division;
import com.javalec.function.Multiplication;
import com.javalec.function.Subtraction;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tfResult;
	private JButton addition;
	private JButton Multiplication;
	private JButton Subtraction;
	private JLabel lblNewLabel_2;
	private JLabel operator;
	private JButton btnX;
	private JButton multiplication_1_1;
	private JButton multiplication_1;
	private JButton subtraction;
	private JButton multiplication;
	private JButton division;

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
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setTitle("두개의 숫자 가감승제");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTf1());
		frame.getContentPane().add(getTf2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getAddition());
		frame.getContentPane().add(getAddition());
		frame.getContentPane().add(getSubtraction());
		frame.getContentPane().add(getMultiplication());
		frame.getContentPane().add(getDivision());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getOperator());
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자 1:");
			lblNewLabel.setBounds(37, 36, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자 2:");
			lblNewLabel_1.setBounds(37, 76, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					//Text Field 에서 숫자외의 문자가 입력되면 지우기
					if(e.getKeyChar() >= '0' && e.getKeyChar()<= '9') {
						//숫자가 입력
					}else {
						JOptionPane.showMessageDialog(null, "숫자만 입력하세요", "경고" , JOptionPane.ERROR_MESSAGE);
						tfNum1.setText("");
					}
				}
			});
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(90, 31, 87, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					//Text Field 에서 숫자외의 문자가 입력되면 지우기
					if(e.getKeyChar() >= '0' && e.getKeyChar()<= '9') {
						//숫자가 입력
					}else {
						JOptionPane.showMessageDialog(null, "숫자만 입력하세요", "경고" , JOptionPane.ERROR_MESSAGE);
						tfNum2.setText("");
					}
				}
			});
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(90, 71, 87, 26);
		}
		return tfNum2;
	}
	private JTextField getTf1() {
		if (tf1 == null) {
			tf1 = new JTextField();
			tf1.setHorizontalAlignment(SwingConstants.TRAILING);
			tf1.setColumns(10);
			tf1.setBounds(47, 182, 87, 26);
		}
		return tf1;
	}
	private JTextField getTf2() {
		if (tf2 == null) {
			tf2 = new JTextField();
			tf2.setHorizontalAlignment(SwingConstants.TRAILING);
			tf2.setColumns(10);
			tf2.setBounds(180, 182, 87, 26);
		}
		return tf2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setColumns(10);
			tfResult.setBounds(314, 182, 87, 26);
		}
		return tfResult;
	}
	private JButton getAddition() {
		if (addition == null) {
			addition = new JButton("+");
			addition.setBackground(Color.WHITE);
			addition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
				}
			});
			addition.setBounds(285, 31, 50, 29);
		}
		return addition;
	}
	
	private JButton getSubtraction() {
		if (subtraction == null) {
			subtraction = new JButton("-");
			subtraction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					subtractAction();
				}
			});
			subtraction.setBackground(Color.WHITE);
			subtraction.setBounds(337, 31, 50, 29);
		}
		return subtraction;
	}
	private JButton getMultiplication() {
		if (multiplication == null) {
			multiplication = new JButton("X");
			multiplication.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					multiplyAction();
				}
			});
			multiplication.setBackground(Color.WHITE);
			multiplication.setBounds(285, 71, 50, 29);
		}
		return multiplication;
	}
	private JButton getDivision() {
		if (division == null) {
			division = new JButton("/");
			division.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					divideAction();
				}
			});
			division.setBackground(Color.WHITE);
			division.setBounds(337, 71, 50, 29);
		}
		return division;
	}
	
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("=");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(279, 187, 30, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getOperator() {
		if (operator == null) {
			operator = new JLabel("+");
			operator.setHorizontalAlignment(SwingConstants.CENTER);
			operator.setBounds(138, 187, 30, 16);
		}
		return operator;
	}
	
	
	
	//Function
	
	

	private void addAction() {
		// TODO Auto-generated method stub
		if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "숫자를 입력하세요!");
		}else {
			tf1.setText(tfNum1.getText());
			tf2.setText(tfNum2.getText());
			operator.setText("+");
		Addition addition = new Addition(Integer.parseInt(tfNum1.getText()),Integer.parseInt(tfNum2.getText()));
		tfResult.setText(Integer.toString(addition.add()));

		}
	}
	

	private void subtractAction() {
		// TODO Auto-generated method stub
		if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "숫자를 입력하세요!");
		}else {
			tf1.setText(tfNum1.getText());
			tf2.setText(tfNum2.getText());
			operator.setText("-");
			Subtraction subtraction = new Subtraction(Integer.parseInt(tfNum1.getText()),Integer.parseInt(tfNum2.getText()));
		tfResult.setText(Integer.toString(subtraction.subtract()));

		}
	}
	

	private void divideAction() {
		// TODO Auto-generated method stub
		if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "숫자를 입력하세요!");
		}else {
			tf1.setText(tfNum1.getText());
			tf2.setText(tfNum2.getText());
			operator.setText("/");
			Division division = new Division(Integer.parseInt(tfNum1.getText()),Integer.parseInt(tfNum2.getText()));
		tfResult.setText(Double.toString(division.divide()));

		}
	}
	
	
	private void multiplyAction() {
		// TODO Auto-generated method stub
		if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "숫자를 입력하세요!");
		}else {
			tf1.setText(tfNum1.getText());
			tf2.setText(tfNum2.getText());
			operator.setText("*");
			Multiplication multiplication = new Multiplication(Integer.parseInt(tfNum1.getText()),Integer.parseInt(tfNum2.getText()));
		tfResult.setText(Integer.toString(multiplication.multiply()));

		}
	}
	
	

	
	
	
	
	
	
	
	
}
