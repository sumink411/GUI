package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmCombobox;
	private JTextField tfAdd;
	private JTextField tfFruits;
	private JButton btnAdd;
	private JComboBox cbFruits;
	private JComboBox cbAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmCombobox.setVisible(true);
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
		frmCombobox = new JFrame();
		frmCombobox.getContentPane().setBackground(new Color(173, 187, 249));
		frmCombobox.setTitle("ComboBox");
		frmCombobox.setBounds(100, 100, 450, 252);
		frmCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombobox.getContentPane().setLayout(null);
		frmCombobox.getContentPane().add(getCbFruits());
		frmCombobox.getContentPane().add(getTfFruits());
		frmCombobox.getContentPane().add(getTfAdd());
		frmCombobox.getContentPane().add(getBtnAdd());
		frmCombobox.getContentPane().add(getCbAdd());
	}
	private JTextField getTfAdd() {
		if (tfAdd == null) {
			tfAdd = new JTextField();
			tfAdd.setBounds(36, 116, 130, 26);
			tfAdd.setColumns(10);
		}
		return tfAdd;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setEditable(false);
			tfFruits.setText("Apple");
			tfFruits.setColumns(10);
			tfFruits.setBounds(241, 60, 130, 26);
		}
		return tfFruits;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction(); 
				}
			});
			btnAdd.setBounds(36, 166, 117, 29);
		}
		return btnAdd;
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboAction();
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape ", "Mango", "Melon"}));
			cbFruits.setBounds(36, 61, 130, 27);
		}
		return cbFruits;
	}
	private JComboBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JComboBox();
			cbAdd.setBounds(241, 117, 130, 27);
		}
		return cbAdd;
	}
	
	
	//FUNCTIONS
	
	private void comboAction() {
		String strFruits = cbFruits.getSelectedItem().toString();      //change to string first! 
		tfFruits.setText(strFruits);
	}
	
	
	private void addAction() {
		cbAdd.addItem(tfAdd.getText());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
