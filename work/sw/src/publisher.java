import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import net.proteanit.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class publisher {

	private JFrame frame;
	private JTextField textPname;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textpIDSearch;
	private JTable table;
	
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
					publisher window = new publisher();
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
	public publisher() {
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
	    pst = con.prepareStatement("select * from publisher");
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
		frame.setBounds(100, 100, 745, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPublisherInterface = new JLabel("Publisher interface");
		lblPublisherInterface.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPublisherInterface.setBounds(209, 11, 299, 71);
		frame.getContentPane().add(lblPublisherInterface);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Register", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 67, 290, 181);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(7, 28, 75, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Address");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(7, 66, 107, 37);
		panel.add(lblNewLabel_1_1);
		
		textPname = new JTextField();
		textPname.setColumns(10);
		textPname.setBounds(92, 40, 188, 20);
		panel.add(textPname);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(92, 78, 188, 20);
		panel.add(textAddress);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(92, 114, 188, 20);
		panel.add(textPhone);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phone");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(7, 102, 107, 37);
		panel.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pname,address, phone;
				pname = textPname.getText();
				address = textAddress.getText();
				phone = textPhone.getText();
				
				//to check name
				if (pname == null || pname.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "name can't be null");
					return;
				}
				
				for (int i=0; i<pname.length(); i++) {
					if (Character.isDigit(pname.charAt(i))) {
						JOptionPane.showMessageDialog(null, "name is not valid");
						return;
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
				
				//if user don't want to insert address
				if (address == null || address.trim().isEmpty()) {
					try {
						pst = con.prepareStatement("insert into publisher(Name,Phone)values(?,?)");
						
						pst.setString(1, pname);
						pst.setString(2, phone);
				
						
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
						table_load();
							           
						textPname.setText("");
						textAddress.setText("");
						textPhone.setText("");
						
						textPname.requestFocus();
						return;
					   }
					 catch (SQLIntegrityConstraintViolationException e2) {
						 JOptionPane.showMessageDialog(null, "phone is already stored");
						 textPhone.setText("");
						}

					catch (SQLException e1) 
				        {
										
					e1.printStackTrace();
					}
				}
				
				for (int i=0; i<address.length(); i++) {
					if (Character.isDigit(address.charAt(i))) {
						JOptionPane.showMessageDialog(null, "address is not valid");
						return;
					}
				}
				
							
				 try {
					pst = con.prepareStatement("insert into publisher(Name,Address,Phone)values(?,?,?)");
					pst.setString(1, pname);
					pst.setString(2, address);
					pst.setString(3, phone);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added!");
					table_load();
						           
					textPname.setText("");
					textAddress.setText("");
					textPhone.setText("");
					
					textPname.requestFocus();
					
				   }
				 
				 catch (SQLIntegrityConstraintViolationException e2) {
					 JOptionPane.showMessageDialog(null, "phone is already stored");
					 textPhone.setText("");
					}

				catch (SQLException e1) 
			        {
									
				e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(20, 251, 72, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(120, 251, 64, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPname.setText("");
				textAddress.setText("");
				textPhone.setText("");
            	
            	textPname.requestFocus();
			}
		});
		btnNewButton_1_1.setBounds(213, 251, 64, 39);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 353, 290, 51);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Publisher ID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 11, 98, 29);
		panel_1.add(lblNewLabel_1_2);
		
		textpIDSearch = new JTextField();
		textpIDSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
			          
					String pid = textpIDSearch.getText();

		                pst = con.prepareStatement("select Name,Address,Phone from publisher where publisherID = ?");
		                pst.setString(1, pid);
		                ResultSet rs = pst.executeQuery();

		            if(rs.next()==true)
		            {
		              
		                String name = rs.getString(1);
		                String address = rs.getString(2);
		                String phone = rs.getString(3);
		               
		                
		                textPname.setText(name);
		                textAddress.setText(address);
		                textPhone.setText(phone);
		                
		                
		                
		            }   
		            else
		            {
		            	textPname.setText("");
		            	textAddress.setText("");
		            	textPhone.setText("");  
		            }
		            


		        } 
			
			 catch (SQLException ex) {
		           
		        }
				
			}
		});
		textpIDSearch.setColumns(10);
		textpIDSearch.setBounds(118, 17, 162, 20);
		panel_1.add(textpIDSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(325, 67, 383, 266);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pID;
                pID  = textpIDSearch.getText();
	
                try {
                	pst = con.prepareStatement("delete from publisher where publisherID =?");
	
                	pst.setString(1, pID);
                	pst.executeUpdate();
                	JOptionPane.showMessageDialog(null, "Record Deleted!");
                	table_load();
           
                	textPname.setText("");
                	textAddress.setText("");
                	textPhone.setText("");
                	textPname.requestFocus();
                	
                }

                catch (SQLException e1) {
			
                	e1.printStackTrace();
                }
			}
		});
		btnNewButton_1_1_1.setBounds(431, 341, 162, 39);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Update address");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pID;
                pID  = textpIDSearch.getText();
                String address;
                address = textAddress.getText();
                
                for (int i=0; i<address.length(); i++) {
					if (Character.isDigit(address.charAt(i))) {
						JOptionPane.showMessageDialog(null, "address is not valid");
						return;
					}
				}
	
                try {
                	pst = con.prepareStatement("UPDATE publisher set Address =? where publisherID =?");
	
                	pst.setString(1, address);
                	pst.setString(2, pID);
                	pst.executeUpdate();
                	JOptionPane.showMessageDialog(null, "address updated!");
                	table_load();
           
                	textPname.setText("");
    				textAddress.setText("");
    				textPhone.setText("");
    				textPname.requestFocus();
                	
                }

                catch (SQLException e1) {
			
                	e1.printStackTrace();
                }
			}
		});
		btnNewButton_1_1_2.setBounds(92, 303, 122, 39);
		frame.getContentPane().add(btnNewButton_1_1_2);
	}

}
