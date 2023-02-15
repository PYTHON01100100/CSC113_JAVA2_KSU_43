import java.awt.EventQueue;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;

public class ProductForm extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtNatID;
	private JTextField txtMajor;
	private JTextField txtID;
	private JTable table;
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "123456");
		}
		catch(ClassNotFoundException e) {
			Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE,null,e);

			}
		catch(SQLException e) {
			Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE,null,e);
		}
	}
	private void btnAddActionPerformed(java.awt.event.ActionEvent Evt) {
		try {
		String ID,Nat,N,M;
		ID = txtID.getText();
		Nat = txtNatID.getText();
		N = txtName.getText();
		M=txtMajor.getText();
		pst = con.prepareStatement("insert into emplooye(SSN, Age,Salary, Name,Department_Dep_num)values(?,?,?,?,?)");
		int k=pst.executeUpdate();
		if(k==1) {
		//JOptionPane.showMessageDialog(this, "Record Addedddd!!!!!");	
			JOptionPane.showMessageDialog(this, "Record Addedddd!!! Successfully");
			txtID.setText("");
			txtNatID.setText("");
			txtName.setText("");
			txtMajor.setText("");			
		}
		else {
			JOptionPane.showMessageDialog(this, "Record failed to saved!!");
		}
		}
		catch(SQLException e) {
			Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE,null,e);
		}
		
		}
	
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductForm frame = new ProductForm();
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
	public ProductForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1187, 1125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setBounds(10, 10, 257, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nat ID");
		lblNewLabel_1.setBounds(10, 62, 257, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Major");
		lblNewLabel_2.setBounds(10, 114, 257, 13);
		contentPane.add(lblNewLabel_2);
		
		txtName = new JTextField();
		txtName.setBounds(10, 33, 257, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtNatID = new JTextField();
		txtNatID.setColumns(10);
		txtNatID.setBounds(10, 85, 257, 19);
		contentPane.add(txtNatID);
		
		txtMajor = new JTextField();
		txtMajor.setColumns(10);
		txtMajor.setBounds(10, 137, 257, 19);
		contentPane.add(txtMajor);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setBounds(299, 62, 257, 13);
		contentPane.add(lblNewLabel_1_1);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(299, 85, 257, 19);
		contentPane.add(txtID);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(10, 197, 85, 21);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(105, 197, 85, 21);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(200, 197, 85, 21);
		contentPane.add(btnDelete);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(299, 197, 85, 21);
		contentPane.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 275, 988, 658);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "National ID", "Full name", "Major "
			}
		));
		
		JLabel lblNewLabel_3 = new JLabel("Students Information");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(425, 15, 420, 42);
		contentPane.add(lblNewLabel_3);
	}
}
