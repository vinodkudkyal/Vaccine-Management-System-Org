package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;

import com.cares.dao.JtableData;

import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;

public class DashBoardAdmin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoardAdmin frame = new DashBoardAdmin();
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
	public DashBoardAdmin() {
				
		JtableData jd = new JtableData();
		BookingData BookD = new BookingData();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 554);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminLogin ad= new AdminLogin();
				ad.setVisible(true);
				setVisible(false);
			}
			
			
		});
		lblNewLabel_6.setBounds(852, 64, 46, 25);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\VINOD\\Downloads\\BACK (1).jpg"));
		
		
		
		JPanel RegistrationTablePanel = new JPanel();
		RegistrationTablePanel.setBounds(252, 84, 646, 415);
		contentPane.add(RegistrationTablePanel);
		RegistrationTablePanel.setVisible(false);
		RegistrationTablePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Data ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 38, 171, 27);
		RegistrationTablePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrationTablePanel.setVisible(false);
			}
		});
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(608, 36, 28, 27);
		RegistrationTablePanel.add(lblNewLabel_2);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 148, 626, 232);
		RegistrationTablePanel.add(scrollPane_4);
		
		table_2 = new JTable();
		scrollPane_4.setViewportView(table_2);
		jd.ShowDataInJtable("select * from registration2 ",table_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_2.setBounds(131, 5, 655, 44);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(0, 0, 941, 55);
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\sumit\\images project\\heading.jpeg"));
		contentPane.add(lblNewLabel_2_1);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 84, 255, 404);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setVisible(false);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("View Booking Details");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookD.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1_3.setBounds(10, 186, 215, 42);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("LOG OUT");
		lblNewLabel_3_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login n = new Login();
				n.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3_2.setBounds(75, 306, 78, 19);
		panel.add(lblNewLabel_3_3_2);
		
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setBounds(0, 55, 39, 34);
		lblNewLabel_3_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(true);
			}
		});
		lblNewLabel_3_3_1.setIcon(new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\sumit\\images project\\menu_icon1.jpg"));
		contentPane.add(lblNewLabel_3_3_1);
		
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("Cancel");
		lblNewLabel_3_3_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(false);
				RegistrationTablePanel.setVisible(false);
			}
		});
		lblNewLabel_3_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3_2_1.setBounds(75, 358, 78, 19);
		panel.add(lblNewLabel_3_3_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\sumit\\images project\\log out.png"));
		lblNewLabel_4.setBounds(40, 295, 30, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\sumit\\images project\\cancle.png"));
		lblNewLabel_7.setBounds(40, 347, 25, 30);
		panel.add(lblNewLabel_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(60, 258, 802, 230);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable() ;
				jd.ShowDataInJtable("select * from Vaccine_slots ",table);
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane.setColumnHeaderView(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane.setColumnHeaderView(scrollPane_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Registration Details\r\n");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrationTablePanel.setVisible(true);
				
				}
		});
		lblNewLabel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1_2.setBounds(10, 96, 215, 42);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Options");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 11, 215, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Vaccine Slots");
		lblNewLabel_5.setBounds(445, 178, 209, 28);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\sumit\\images project\\low_poly_banner_design_1711.jpg"));
		lblNewLabel_3.setBounds(0, 59, 908, 445);
		contentPane.add(lblNewLabel_3);
		
		
	}
}