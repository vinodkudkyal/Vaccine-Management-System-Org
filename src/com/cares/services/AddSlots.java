package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cares.dao.DataBase;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddSlots extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSlots frame = new AddSlots();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddSlots() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(53, 68, 565, 302);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vaccine Name");
		lblNewLabel.setBounds(10, 58, 89, 21);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Vaccine Type", "Covishild", "Covaxin"}));
		comboBox.setBounds(130, 57, 132, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Vaccine Center ");
		lblNewLabel_1.setBounds(10, 118, 95, 14);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Center", "CNS Hospital", "Shiv Santoshi Hospital", "CIVIL Hospital"}));
		comboBox_1.setBounds(130, 114, 132, 22);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number Of Vaccine");
		lblNewLabel_2.setBounds(10, 161, 95, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(282, 61, 123, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(282, 118, 123, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(130, 158, 132, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(282, 161, 123, 14);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Add Slots ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
				db.addSlots((String)comboBox.getSelectedItem(), (String)comboBox_1.getSelectedItem(), textField.getText());
			}
		});
		btnNewButton.setBounds(173, 226, 89, 23);
		panel.add(btnNewButton);
		
		
		
		
	}
}
