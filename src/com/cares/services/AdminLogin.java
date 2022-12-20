package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter ID ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(278, 203, 89, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Pass ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(278, 264, 89, 23);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(405, 205, 156, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(405, 267, 156, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("sumit")&&passwordField.getText().equals("1410")) 
				{
				DashBoardAdmin da = new DashBoardAdmin();
				da.setVisible(true);
				setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, " Enter Correct ID & Pass");
				}
			}
		});
		btnNewButton.setBounds(374, 347, 100, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3_2 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(100, 5, 655, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\sumit\\images project\\heading.jpeg"));
		lblNewLabel_2_1.setBounds(0, 0, 910, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_6 = new JLabel("Admin Login\r\n");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_6.setBounds(405, 94, 133, 35);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("Admin Login\r\n");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\sumit\\images project\\White_full.png"));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(405, 94, 133, 35);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		separator.setBounds(209, 110, 514, 344);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Login lg = new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\BACK.jpg"));
		lblNewLabel_4.setBounds(863, 416, 37, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\VINOD\\Downloads\\BACK.jpg"));
		lblNewLabel_5.setBounds(863, 402, 37, 63);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\sumit\\images project\\low_poly_banner_design_1711.jpg"));
		lblNewLabel_3.setBounds(0, 44, 910, 421);
		contentPane.add(lblNewLabel_3);
	}
}