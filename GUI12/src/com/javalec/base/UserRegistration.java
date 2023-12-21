package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.javalec.util.Share;

public class UserRegistration extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfUserId;
	private JLabel lblPassword;
	private JPasswordField pfPassword;
	private JTextField tfName;
	private JLabel lblName;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UserRegistration dialog = new UserRegistration();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UserRegistration() {
		setBounds(100, 100, 403, 269);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("User id:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setBounds(56, 50, 106, 16);
			contentPanel.add(lblNewLabel);
		}
		contentPanel.add(getTfUserId());
		contentPanel.add(getLblPassword());
		contentPanel.add(getPfPassword());
		contentPanel.add(getTfName());
		contentPanel.add(getLblName());
		contentPanel.add(getBtnOk());
	}
	private JTextField getTfUserId() {
		if (tfUserId == null) {
			tfUserId = new JTextField();
			tfUserId.setBounds(174, 45, 130, 26);
			tfUserId.setColumns(10);
		}
		return tfUserId;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
			lblPassword.setBounds(56, 81, 106, 16);
		}
		return lblPassword;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(174, 76, 130, 26);
		}
		return pfPassword;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(174, 109, 130, 26);
		}
		return tfName;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name: ");
			lblName.setHorizontalAlignment(SwingConstants.TRAILING);
			lblName.setBounds(56, 114, 106, 16);
		}
		return lblName;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("Ok");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					okAction(); 
				}
			});
			btnOk.setBounds(141, 159, 117, 29);
		}
		return btnOk;
	}
	
	
	
	//FUNCTIONS
	
	private void okAction() {
		Share.userid = tfUserId.getText();
		Share.name = tfName.getText();
		
		char[] pass = pfPassword.getPassword(); 
		String passString = new String(pass);
		
		Share.password = passString; 
		
		
		
		
  //화면 정리 
		
		Main window = new Main();
		window.main(null);
		
		this.setVisible(false);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
