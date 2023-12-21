package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.javalec.function.BmiCalc;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Main {

	private JFrame frmBmi;
	private JLabel lblNewLabel;
	private JTextField tfHeight;
	private JLabel lblCm;
	private JLabel lblNewLabel_2;
	private JTextField tfWeight;
	private JLabel lblKg;
	private JButton btnCalc;
	private JLabel lblResult;
	private JLabel lblImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBmi.setVisible(true);
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
		frmBmi = new JFrame();
		frmBmi.getContentPane().setBackground(new Color(255, 231, 248));
		frmBmi.setTitle("BMI계산기");
		frmBmi.setBounds(100, 100, 366, 495);
		frmBmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBmi.getContentPane().setLayout(null);
		frmBmi.getContentPane().add(getLblNewLabel());
		frmBmi.getContentPane().add(getTfHeight());
		frmBmi.getContentPane().add(getLblCm());
		frmBmi.getContentPane().add(getLblNewLabel_2());
		frmBmi.getContentPane().add(getTfWeight());
		frmBmi.getContentPane().add(getLblKg());
		frmBmi.getContentPane().add(getBtnCalc());
		frmBmi.getContentPane().add(getLblResult());
		frmBmi.getContentPane().add(getLblImage());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("키(신장):");
			lblNewLabel.setBounds(71, 46, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfHeight() {
		if (tfHeight == null) {
			tfHeight = new JTextField();
			tfHeight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			tfHeight.setHorizontalAlignment(SwingConstants.TRAILING);
			tfHeight.setBounds(125, 41, 104, 26);
			tfHeight.setColumns(10);
		}
		return tfHeight;
	}
	private JLabel getLblCm() {
		if (lblCm == null) {
			lblCm = new JLabel("cm");
			lblCm.setBounds(241, 46, 61, 16);
		}
		return lblCm;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("몸무게:");
			lblNewLabel_2.setBounds(71, 80, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfWeight() {
		if (tfWeight == null) {
			tfWeight = new JTextField();
			tfWeight.setHorizontalAlignment(SwingConstants.TRAILING);
			tfWeight.setColumns(10);
			tfWeight.setBounds(125, 75, 104, 26);
		}
		return tfWeight;
	}
	private JLabel getLblKg() {
		if (lblKg == null) {
			lblKg = new JLabel("Kg");
			lblKg.setBounds(241, 80, 61, 16);
		}
		return lblKg;
	}
	private JButton getBtnCalc() {
		if (btnCalc == null) {
			btnCalc = new JButton("계산하기");
			btnCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					bmiCalc();
				}
			});
			btnCalc.setBounds(112, 113, 117, 29);
		}
		return btnCalc;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setBounds(6, 154, 354, 16);
		}
		return lblResult;
	}
	
	
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/image/normal.png")));
			lblImage.setBounds(125, 182, 162, 264);
		}
		return lblImage;
	}
	
	
	
	
	//FUNCTIONS
	
	private void bmiCalc() {
		int check = inputCheck();
		if(check != 0) {
			JOptionPane.showMessageDialog(null, "항목을 입력 하세요");
		}else {
			calcBmi(); 
		}
		
	}
	
	
	private int inputCheck() {
		int checkResult = 0;
		if(tfHeight.getText().trim().length() == 0) {
			checkResult++;
			tfHeight.requestFocus();
		}
		
		
		if(tfWeight.getText().trim().length() == 0) {
			checkResult++;
			tfWeight.requestFocus();
		}
		
		return checkResult;
	}
	
	private void calcBmi() {
		
		double height = Double.parseDouble(tfHeight.getText());
		double weight = Double.parseDouble(tfWeight.getText());
		
		
		BmiCalc bmiCalc = new BmiCalc(weight, height); 
		double bmi =  bmiCalc.calcBmi(); 
		String result = bmiCalc.showResult(bmi);
	
		
			
	lblResult.setText("귀하의 BMI 지수는 " + bmi + " 이고 " + result + "입니다.");
		
		
	
	
	String image = bmiCalc.showImage(bmi);
	lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/image/" + image + ".png")));
	
	
	

	}
	
	
	
	
	
}
