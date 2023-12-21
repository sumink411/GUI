package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

public class Main {

	private JFrame frmCheckboxradiobutton;
	private JCheckBox cbxApple;
	private JCheckBox cbxBanana;
	private JRadioButton rbKbs;
	private JRadioButton rbMbc;
	private JButton btnBroad;
	private JButton btnFruits;
	private JTextField tfBroad;
	private JTextField tfFruits;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmCheckboxradiobutton.setVisible(true);
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
		frmCheckboxradiobutton = new JFrame();
		frmCheckboxradiobutton.setTitle("CheckBox/RadioButton");
		frmCheckboxradiobutton.setBounds(100, 100, 349, 277);
		frmCheckboxradiobutton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxradiobutton.getContentPane().setLayout(null);
		frmCheckboxradiobutton.getContentPane().add(getRbKbs());
		frmCheckboxradiobutton.getContentPane().add(getRbMbc());
		frmCheckboxradiobutton.getContentPane().add(getBtnBroad());
		frmCheckboxradiobutton.getContentPane().add(getTfBroad());
		frmCheckboxradiobutton.getContentPane().add(getCbxApple());
		frmCheckboxradiobutton.getContentPane().add(getCbxBanana());
		frmCheckboxradiobutton.getContentPane().add(getBtnFruits());
		frmCheckboxradiobutton.getContentPane().add(getTfFruits());
	}
	private JCheckBox getCbxApple() {
		if (cbxApple == null) {
			cbxApple = new JCheckBox("Apple");
			cbxApple.setBounds(200, 34, 128, 23);
		}
		return cbxApple;
	}
	private JCheckBox getCbxBanana() {
		if (cbxBanana == null) {
			cbxBanana = new JCheckBox("Banana");
			cbxBanana.setBounds(201, 93, 128, 23);
		}
		return cbxBanana;
	}
	private JRadioButton getRbKbs() {
		if (rbKbs == null) {
			rbKbs = new JRadioButton("KBS");
			rbKbs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck(); 
				}
			});
			buttonGroup.add(rbKbs);
			rbKbs.setSelected(true);
			rbKbs.setBounds(29, 35, 141, 23);
		}
		return rbKbs;
	}
	private JRadioButton getRbMbc() {
		if (rbMbc == null) {
			rbMbc = new JRadioButton("MBC");
			rbMbc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMbc);
			rbMbc.setBounds(30, 93, 141, 23);
		}
		return rbMbc;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(22, 144, 117, 29);
		}
		return btnBroad;
	}
	private JButton getBtnFruits() {
		if (btnFruits == null) {
			btnFruits = new JButton("OK");
			btnFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck(); 
				}
			});
			btnFruits.setBounds(192, 144, 117, 29);
		}
		return btnFruits;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(17, 197, 130, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setColumns(10);
			tfFruits.setBounds(186, 196, 130, 26);
		}
		return tfFruits;
	}
	
	
	//Functions 
	
	private void broadCheck() {
		if(rbKbs.isSelected()) {
			tfBroad.setText("KBS is selected.");
		}
		
		if(rbMbc.isSelected()) {
			tfBroad.setText("MBC is selected.");
		}
	}
	
	
	
	private void fruitCheck() {
		
		tfFruits.setText("Nothing");
		
			
		if(cbxApple.isSelected()) {
			tfFruits.setText("Apple is selected.");
		}
		
		if(cbxBanana.isSelected()) {
			tfFruits.setText("Banana is selected.");
		}
		
		if(cbxApple.isSelected() && cbxBanana.isSelected()) {
			tfFruits.setText("Apple & Banana");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
