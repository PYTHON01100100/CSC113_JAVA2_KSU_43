import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;


import net.proteanit.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class book {

	private JFrame frame;
	private JTextField textAuthor;
	private JTextField textTitle;
	private JTextField textISBN;
	private JTable table;
	
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private JComboBox <String> comboBoxPid;
	private JTextField textPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book window = new book();
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
	public book() {
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
			pst = con.prepareStatement("select * from publisher");
			rs = pst.executeQuery();
			
			while(rs.next()) {
				comboBoxPid.addItem(rs.getString("publisherID"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void table_load()
    {
    	try 
    	{
	    pst = con.prepareStatement("select * from book");
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
		frame.setBounds(100, 100, 742, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBookInterface = new JLabel("Book interface");
		lblBookInterface.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblBookInterface.setBounds(245, 11, 235, 51);
		frame.getContentPane().add(lblBookInterface);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Register", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 65, 305, 212);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Author");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(7, 11, 69, 37);
		panel.add(lblNewLabel_1_1);
		
		textAuthor = new JTextField();
		textAuthor.setColumns(10);
		textAuthor.setBounds(78, 23, 217, 20);
		panel.add(textAuthor);
		
		textTitle = new JTextField();
		textTitle.setColumns(10);
		textTitle.setBounds(78, 59, 217, 20);
		panel.add(textTitle);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Title");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(7, 54, 107, 37);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Publisher ID");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(7, 164, 153, 37);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		comboBoxPid = new JComboBox();
		comboBoxPid.setBounds(189, 176, 93, 22);
		panel.add(comboBoxPid);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Price");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(7, 90, 58, 37);
		panel.add(lblNewLabel_1_1_1_2);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(78, 103, 217, 20);
		panel.add(textPrice);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String auth, title, price;
				auth = textAuthor.getText();
				title = textTitle.getText();
				price = textPrice.getText();
				
				String pid;
				pid = comboBoxPid.getSelectedItem().toString();
				
				//to check author
				if (auth == null || auth.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "author can't be null");
					return;
				}
				
				for (int i=0; i<auth.length(); i++) {
					if (Character.isDigit(auth.charAt(i))) {
						JOptionPane.showMessageDialog(null, "author is not valid");
						return;
					}
				}
				
				//to check title
				if (title == null || title.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "title can't be null");
					return;
				}
				
				for (int i=0; i<title.length(); i++) {
					if (Character.isDigit(title.charAt(i))) {
						JOptionPane.showMessageDialog(null, "title is not valid");
						return;
					}
				}
				
				//to check price
				if (price == null || price.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "price can't be null");
					return;
				}
				
				
				//Character.isDigit(price.charAt(1));
				
							
				 try {
					pst = con.prepareStatement("insert into book(Author, Title, Price, publisher_publisherID)values(?,?,?,?)");
					pst.setString(1, auth);
					pst.setString(2, title);
					pst.setString(3, price);
					pst.setString(4, pid);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
					table_load();
						           
					textAuthor.setText("");
					textTitle.setText("");
					textPrice.setText("");
					
					textAuthor.requestFocus();
					
				   }
				 
				 catch (SQLIntegrityConstraintViolationException e2) {
					 JOptionPane.showMessageDialog(null, "title is duplicated");
					 textTitle.setText("");
					}

				catch (SQLException e1) 
			        {
					JOptionPane.showMessageDialog(null, "Please enter a valid price");					
					//e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(20, 288, 72, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(127, 288, 64, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAuthor.setText("");
				textTitle.setText("");
				textPrice.setText("");
				
				textAuthor.requestFocus();
			}
		});
		btnNewButton_1_1.setBounds(245, 288, 64, 39);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(19, 372, 290, 51);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ISBN");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 11, 98, 29);
		panel_1.add(lblNewLabel_1_2);
		
		textISBN = new JTextField();
		textISBN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try {
			          
		            String id = textISBN.getText();

		                pst = con.prepareStatement("select Author,Title,Price,publisher_publisherID from book where ISBN = ?");
		                pst.setString(1, id);
		                ResultSet rs = pst.executeQuery();

		            if(rs.next()==true)
		            {
		              
		                String auth = rs.getString(1);
		                String title = rs.getString(2);
		                String price = rs.getString(3);
		                String pid = rs.getString(4);
		               
		                
		                textAuthor.setText(auth);
		                textTitle.setText(title);
		                textPrice.setText(price);
		                
		                
		                
		                
		            }   
		            else
		            {
		            	textAuthor.setText("");
		                textTitle.setText("");
		                textPrice.setText("");
		            	//
		               
		                 
		            }
		            


		        } 
			
			 catch (SQLException ex) {
		           
		        }
			}
		});
		textISBN.setColumns(10);
		textISBN.setBounds(118, 17, 162, 20);
		panel_1.add(textISBN);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bid;
                bid  = textISBN.getText();
	
                try {
                	pst = con.prepareStatement("delete from book where ISBN =?");
	
                	pst.setString(1, bid);
                	pst.executeUpdate();
                	JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
                	table_load();
           
                	textAuthor.setText("");
	                textTitle.setText("");
	                textPrice.setText("");
                	//textCname.setText("");
                	//textCphone.requestFocus();
                	
                }

                catch (SQLException e1) {
			
                	e1.printStackTrace();
                }
			}
		});
		btnNewButton_1_1_1.setBounds(442, 384, 162, 39);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(326, 81, 390, 292);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

}
