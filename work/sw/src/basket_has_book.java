import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import net.proteanit.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class basket_has_book {

	private JFrame frame;
	private JTable table;
	
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	
	private JComboBox comboBoxBook;
	private JComboBox comboBoxBasket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basket_has_book window = new basket_has_book();
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
	public basket_has_book() {
		initialize();
		connect();
		table_load();
		fillComboBox1();
		fillComboBox2();
	}
	
	public void connect() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "moh1234");
			System.out.println("connected");

		} catch (Exception e) {
			System.out.println("not connected");
			System.out.println(e.getMessage());
		}
	}
	
	public void table_load()
    {
    	try 
    	{
	    pst = con.prepareStatement("select * from basket_has_book");
	    rs = pst.executeQuery();
	    table.setModel(DbUtils.resultSetToTableModel(rs));
	} 
    	catch (SQLException e) 
    	 {
    		e.printStackTrace();
	  } 
    }
	
	public void fillComboBox1() {
		try {
			pst = con.prepareStatement("select * from basket");
			rs = pst.executeQuery();
			
			while(rs.next()) {
				comboBoxBasket.addItem(rs.getString("id"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void fillComboBox2() {
		try {
			pst = con.prepareStatement("select * from book");
			rs = pst.executeQuery();
			
			while(rs.next()) {
				comboBoxBook.addItem(rs.getString("ISBN"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 741, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblV = new JLabel("basket_has_book");
		lblV.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblV.setBounds(212, 11, 286, 51);
		frame.getContentPane().add(lblV);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Register", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(22, 73, 305, 212);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Basket id");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 64, 109, 37);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Book ISBN");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(10, 112, 153, 37);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		comboBoxBook = new JComboBox();
		comboBoxBook.setBounds(173, 123, 93, 22);
		panel.add(comboBoxBook);
		
		 comboBoxBasket = new JComboBox();
		comboBoxBasket.setBounds(173, 75, 93, 22);
		panel.add(comboBoxBasket);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bid, isbn;
				bid = comboBoxBasket.getSelectedItem().toString();
				isbn = comboBoxBook.getSelectedItem().toString();
				
				try {
					pst = con.prepareStatement("insert into basket_has_book(Basket_id, Book_ISBN)values(?,?)");
					pst.setString(1, bid);
					pst.setString(2, isbn);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
					table_load();
						           
					
					
				   }

				catch (SQLException e1) 
			        {
									
				e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(55, 296, 72, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(212, 296, 64, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(337, 73, 378, 306);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bid, isbn;
				bid = comboBoxBasket.getSelectedItem().toString();
				isbn = comboBoxBook.getSelectedItem().toString();
				
				try {
					pst = con.prepareStatement("delete from basket_has_book where Basket_id = ? and Book_ISBN = ?");
					pst.setString(1, bid);
					pst.setString(2, isbn);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
					table_load();
						           
					
					
				   }

				catch (SQLException e1) 
			        {
									
				e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1_1_1.setBounds(443, 393, 162, 39);
		frame.getContentPane().add(btnNewButton_1_1_1);
	}

}
