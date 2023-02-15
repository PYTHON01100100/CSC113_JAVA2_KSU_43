import java.awt.EventQueue;
import java.sql.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;   
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import net.proteanit.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Customer {

	private JFrame frame;
	private JTextField textCname;
	private JTextField textCphone;
	private JTable table;
	private JTextField textCid;
	
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer window = new Customer();
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
	public Customer() {
		initialize();
		
		connect();
		table_load();
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
	    pst = con.prepareStatement("select * from customer");
	    rs = pst.executeQuery();
	    table.setModel(DbUtils.resultSetToTableModel(rs));
	} 
    	catch (SQLException e) 
    	 {
    		e.printStackTrace();
	  } 
    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle(" ");
		frame.setBounds(100, 100, 742, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer interface");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(219, 11, 299, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Register", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(40, 93, 290, 181);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 125, 75, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 41, 75, 37);
		panel.add(lblNewLabel_1_1);
		
		textCname = new JTextField();
		textCname.setBounds(80, 137, 188, 20);
		panel.add(textCname);
		textCname.setColumns(10);
		
		textCphone = new JTextField();
		textCphone.setColumns(10);
		textCphone.setBounds(80, 53, 188, 20);
		panel.add(textCphone);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(388, 93, 290, 250);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phone,cname;
				phone = textCphone.getText();
				cname = textCname.getText();
				
				//to check not null
				if (cname == null || cname.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "name can't be null");
					return;
				}
				
				//if user want to insert only name
				if (phone == null || phone.trim().isEmpty()) {
					try {
						pst = con.prepareStatement("insert into customer(Name)values(?)");
						
						pst.setString(1, cname);
						
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
						table_load();
							           
						textCphone.setText("");
						textCname.setText("");
						
						textCphone.requestFocus();
						return;
					   }

					catch (SQLException e1) 
				        {
										
					e1.printStackTrace();
					}
				}
				
				
				
				//try block: to check phone//
				try {
					Integer.parseInt(phone);
				} catch (NumberFormatException e2) {
					System.out.println(e2.getMessage());
					//if it's a long number
					if (phone.length() > 10) {
						JOptionPane.showMessageDialog(null, "enter a 10-digit number");
						return;
					}
					//if it's not a number
					JOptionPane.showMessageDialog(null, "please enter a number");
					return;
				}
				
				if (phone.length() != 10) {
					JOptionPane.showMessageDialog(null, "enter a 10-digit number");
					return;
				}
				
							
				 try {
					pst = con.prepareStatement("insert into customer(Phone,Name)values(?,?)");
					pst.setString(1, phone);
					pst.setString(2, cname);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added!");
					table_load();
						           
					textCphone.setText("");
					textCname.setText("");
					
					textCphone.requestFocus();
					
				   }
				 catch (SQLIntegrityConstraintViolationException e2) {
					 JOptionPane.showMessageDialog(null, "phone is already stored");
					 textCphone.setText("");
					}

				catch (SQLException e1) 
			        {
									
				e1.printStackTrace();
				}
				 
				
			}
		});
		btnNewButton.setBounds(73, 285, 57, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(142, 285, 64, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCphone.setText("");
            	textCname.setText("");
            	textCphone.requestFocus();
			}
		});
		btnNewButton_1_1.setBounds(216, 285, 64, 39);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(40, 375, 290, 51);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Customer id");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 11, 90, 29);
		panel_1.add(lblNewLabel_1_2);
		
		textCid = new JTextField();
		textCid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try {
			          
		            String id = textCid.getText();

		                pst = con.prepareStatement("select Phone,Name from customer where cid = ?");
		                pst.setString(1, id);
		                ResultSet rs = pst.executeQuery();

		            if(rs.next()==true)
		            {
		              
		                String phone = rs.getString(1);
		                String Name = rs.getString(2);
		               
		                
		                textCphone.setText(phone);
		                textCname.setText(Name);
		                
		                
		                
		            }   
		            else
		            {
		            	textCphone.setText("");
		            	textCname.setText("");
		               
		                 
		            }
		            


		        } 
			
			 catch (SQLException ex) {
		           
		        }
			}
		});
		textCid.setColumns(10);
		textCid.setBounds(99, 17, 181, 20);
		panel_1.add(textCid);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
                String cid;
                cid  = textCid.getText();
	
                try {
                	pst = con.prepareStatement("delete from customer where cid =?");
	
                	pst.setString(1, cid);
                	pst.executeUpdate();
                	JOptionPane.showMessageDialog(null, "Record Deleted!");
                	table_load();
           
                	textCphone.setText("");
                	textCname.setText("");
                	textCphone.requestFocus();
                	
                }

                catch (SQLException e1) {
			
                	e1.printStackTrace();
                }
				}
			});
			btnNewButton_1_1_1.setBounds(460, 363, 162, 39);
			frame.getContentPane().add(btnNewButton_1_1_1);
			
			JButton btnNewButton_1_1_2 = new JButton("Update phone");
			btnNewButton_1_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String cid;
	                cid  = textCid.getText();
	                String phone;
	                phone = textCphone.getText();
		
	                try {
	                	pst = con.prepareStatement("UPDATE customer set Phone =? where cid =?");
		
	                	pst.setString(1, phone);
	                	pst.setString(2, cid);
	                	pst.executeUpdate();
	                	JOptionPane.showMessageDialog(null, "phone updated!");
	                	table_load();
	           
	                	textCphone.setText("");
	                	textCname.setText("");
	                	textCphone.requestFocus();
	                	
	                }

	                catch (SQLException e1) {
				
	                	e1.printStackTrace();
	                }
				}
			});
			btnNewButton_1_1_2.setBounds(122, 335, 101, 39);
			frame.getContentPane().add(btnNewButton_1_1_2);
	}
}
