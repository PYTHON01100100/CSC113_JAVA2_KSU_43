import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable; 
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import net.proteanit.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class basket {

	private JFrame frame;
	private JTextField textAmount;
	private JTextField textBid;
	
	private JComboBox<String> comboBoxCid;
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basket window = new basket();
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
	public basket() {
		initialize();
		
		connect();
		
		fillComboBox();
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
	
	public void fillComboBox() {
		try {
			pst = con.prepareStatement("select * from Customer");
			rs = pst.executeQuery();
			
			while(rs.next()) {
				comboBoxCid.addItem(rs.getString("cid"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void table_load()
    {
    	try 
    	{
	    pst = con.prepareStatement("select * from basket");
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
		frame.setBounds(100, 100, 739, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBasketInterface = new JLabel("Basket interface");
		lblBasketInterface.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblBasketInterface.setBounds(202, 11, 299, 71);
		frame.getContentPane().add(lblBasketInterface);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Register", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(29, 93, 290, 181);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(7, 28, 75, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Customer id");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 117, 107, 37);
		panel.add(lblNewLabel_1_1);
		
		textAmount = new JTextField();
		textAmount.setColumns(10);
		textAmount.setBounds(92, 40, 188, 20);
		panel.add(textAmount);
		
		comboBoxCid = new JComboBox();
		comboBoxCid.setBounds(157, 128, 93, 22);
		panel.add(comboBoxCid);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String amount;
				amount = textAmount.getText();
				String cid;
				cid = comboBoxCid.getSelectedItem().toString();
				
				//to check amount
				try {
					Integer.parseInt(amount);
				} catch (NumberFormatException e2) {
					System.out.println(e2.getMessage());
					JOptionPane.showMessageDialog(null, "enter a number");
					return;
				}
				
							
				 try {
					pst = con.prepareStatement("insert into basket(amount, Customer_cid)values(?,?)");
					pst.setString(1, amount);
					pst.setString(2, cid);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
					table_load();
						           
					textAmount.setText("");
					
					textAmount.requestFocus();
					
				   }

				catch (SQLException e1) 
			        {
									
				e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(39, 279, 57, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(144, 279, 64, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAmount.setText("");
				textAmount.requestFocus();
			}
		});
		btnNewButton_1_1.setBounds(241, 279, 64, 39);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(29, 359, 290, 51);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Basket id");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 11, 90, 29);
		panel_1.add(lblNewLabel_1_2);
		
		textBid = new JTextField();
		textBid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
			          
		            String id = textBid.getText();

		                pst = con.prepareStatement("select amount,Customer_cid from basket where id = ?");
		                pst.setString(1, id);
		                ResultSet rs = pst.executeQuery();

		            if(rs.next()==true)
		            {
		              
		                String phone = rs.getString(1);
		                String cid = rs.getString(2);
		               
		                
		                textAmount.setText(phone);
		                //comboBoxCid.set
		                
		                
		                
		            }   
		            else
		            {
		            	textAmount.setText("");
		            	//
		               
		                 
		            }
		            


		        } 
			
			 catch (SQLException ex) {
		           
		        }
			}
		});
		textBid.setColumns(10);
		textBid.setBounds(99, 17, 181, 20);
		panel_1.add(textBid);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(349, 93, 345, 264);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String bid;
	                bid  = textBid.getText();
		
	                try {
	                	pst = con.prepareStatement("delete from basket where id =?");
		
	                	pst.setString(1, bid);
	                	pst.executeUpdate();
	                	JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
	                	table_load();
	           
	                	textAmount.setText("");
	                	//textCname.setText("");
	                	//textCphone.requestFocus();
	                	
	                }

	                catch (SQLException e1) {
				
	                	e1.printStackTrace();
	                }
			}
		});
		btnNewButton_1_1_1.setBounds(444, 368, 162, 39);
		frame.getContentPane().add(btnNewButton_1_1_1);
	}
}
