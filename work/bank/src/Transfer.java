import java.awt.*;               //
import java.awt.event.*;        //
import javax.swing.*;          //  PACKAGES
import java.sql.*;            //
//import sun.jdbc.odbc.*;      //

	public class Transfer extends JFrame implements ActionListener{
       		private JTextField textfield1,textfield2,textfield3,textfield4,textfield5;
       		private JButton OKButton,ExitButton;
       		private JLabel label;
       		private int int1,int2,int3,Amount,Amount1,Password;
       		private String str1,str2,str3;
       		static String url = "jdbc:odbc:abc";
                //SET UP GUI
       		public Transfer(){
	      		super("Money Transfer");
	      		Container container = getContentPane();
	      		container.setLayout(new FlowLayout() );

	      		label=new JLabel("Password of the user:");
	      		label.setLocation(200,50);
	      		container.add(label);

	      		textfield5 = new JTextField(15);
	      		container.add(textfield5);

	      		textfield1 = new JTextField("Password of the receiver:");
	     	 	textfield1.setEditable(false);
	      		container.add(textfield1);
                        textfield2 = new JTextField(15);
	      		container.add(textfield2);

              		textfield3 = new JTextField("Amount of the sent:",15);
              		textfield3.setEditable(false);
              		container.add(textfield3);
              		textfield4 = new JTextField(15);
              		container.add(textfield4);

              		OKButton = new JButton("OK");
              		OKButton.setPreferredSize(new Dimension(80,20));
              		OKButton.setSize(OKButton.getPreferredSize());
              		OKButton.addActionListener(this);
              		container.add(OKButton);

              		ExitButton = new JButton("Exit");
              		ExitButton.setPreferredSize(new Dimension(80,20));
              		ExitButton.setSize(ExitButton.getPreferredSize());
              		ExitButton.addActionListener(this);
              		container.add(ExitButton);

              		setSize(400,150);
              		setVisible(true);

       		}//-------------actionPerformed----------------------------------------
       		public void actionPerformed(ActionEvent event){
                	if(event.getSource()==ExitButton){
                		this.hide();MainMenu s=new MainMenu();s.Main();
                        }
       			else if(event.getSource()==OKButton){
                     	try{
                        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            }catch(ClassNotFoundException a){
                            	JOptionPane.showMessageDialog(null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        try{    //Select operation:
                        	str3=textfield5.getText();   // gets password of user
                        	int1=Integer.parseInt(str3);
                        	String run = "SELECT * FROM abc " +"WHERE password = " +int1;
                        	System.out.println(run + "SQL string executed");
                        	Connection connection = DriverManager.getConnection(url,"","");
  	                     	Statement stmt = connection.createStatement();
                        	ResultSet result=stmt.executeQuery(run);
                              while(result.next()){
                        	String name = result.getString(1);
                        	String surname = result.getString(2);
                        	int amount = result.getInt(3);
                        	int password = result.getInt(4);

                        	Amount=amount;
                              }
                         	connection.close();
                            }
                            catch(SQLException a){
                            	JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT SELECT OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }

                        	str2=textfield4.getText();  //amount of sent
                        	int3=Integer.parseInt(str2);
                        	Amount=Amount-int3;
                                //--------------Updating values of the database-------------
                        	String run =  "UPDATE abc SET " +
                        	"amount='" +Amount+"' WHERE password="+int1;
                        try{
                        	Connection connection = DriverManager.getConnection(url,"","");
	      	            	Statement stmt = connection.createStatement();
      		            	stmt.executeUpdate(run);
                        	System.out.println("Operation completed...");
      		            	connection.close();
                            }catch(SQLException a){JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT UPDATE OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }
                        //---Select operation for the person (the money transferred to)------
                        try{
                        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            }catch(ClassNotFoundException a){
                            	JOptionPane.showMessageDialog(null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                            }
                        try{
                        	str1=textfield2.getText();//password of receiver
                        	int2=Integer.parseInt(str1);

                        	String run2 = "SELECT * FROM abc " +"WHERE password = " +int2;
                        	System.out.println(run2 + "SQL string executed");
                        	Connection connection = DriverManager.getConnection(url,"","");
  	                     	Statement stmt = connection.createStatement();
                        	ResultSet result=stmt.executeQuery(run2);
                              while(result.next()){
                        	String name = result.getString(1);
                        	String surname = result.getString(2);
                        	int amount = result.getInt(3);
                        	int password = result.getInt(4);

                        	Amount1=amount;
                              }
                        	connection.close();
                            }
                            catch(SQLException a){
                            	JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT SELECT OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }
                        	Amount1=Amount1+int3;
                                //---------Updating the values for the person,money transferred to--
                        	String run1 =  "UPDATE abc SET " +
                        	"amount='" +Amount1+"' WHERE password="+int2;
                        try{
                        	Connection connection = DriverManager.getConnection(url,"","");
	      	            	Statement stmt = connection.createStatement();
      		            	stmt.executeUpdate(run1);
                        	System.out.println("Operation completed...");
      		             	connection.close();
                            }catch(SQLException a){JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT UPDATE OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }

		}
       	}





