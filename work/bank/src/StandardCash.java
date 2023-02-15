
import java.awt.*;            //
import java.awt.event.*;     //  PACKAGES
import javax.swing.*;       //
import java.sql.*;         //
       public class StandardCash extends JFrame implements ActionListener {
              private JButton button1,button2;
              private JLabel label1;
              private String str1;
              private int Amount,Password;
              private JTextField text1;
              static String url = "jdbc:odbc:abc";
              Container container;
              //SET UP GUI
              public StandardCash(){
                     super("Standard Cash (10$)");
                     Container container = getContentPane();
                     container.setLayout(null);

                     button1 = new JButton("OK");
                     button1.setPreferredSize(new Dimension (90,30));
                     button1.setSize(button1.getPreferredSize());
                     button1.setLocation(50,100);
                     button1.addActionListener(this);
                     container.add(button1);

                     text1=new JTextField(10);
                     text1.setPreferredSize(new Dimension(10,22));
                     text1.setSize(text1.getPreferredSize());
                     text1.setLocation(50,60);
                     container.add(text1);

                     button2 = new JButton("CANCEL");
                     button2.setPreferredSize(new Dimension (90,30));
                     button2.setSize(button2.getPreferredSize());
                     button2.addActionListener(this);
                     button2.setLocation(150,100);

                     container.add(button2);

                     label1 = new JLabel("Please enter your password:");
                     label1.setPreferredSize(new Dimension(250,20));
                     label1.setSize(label1.getPreferredSize());
                     label1.setLocation(50,40);
                     container.add(label1);

                     setSize(350,300);
                     show();

              }//------Method for ActionListener-----------------
              public void actionPerformed(ActionEvent event){
              	if(event.getSource()==button1){
                        //Selecting the values for the user--------
                        try{
                        	str1=text1.getText();
                                int int1=Integer.parseInt(str1);

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
                        	Password=password;
                        	Amount=amount-10;
                              }
                        	connection.close();
                            }
                            catch(SQLException a){
                            	JOptionPane.showMessageDialog(
		null,url,"SQL EXCEPTION AT SELECT OPERATION",
		JOptionPane.INFORMATION_MESSAGE);
                            }
                                //-----Updating the Amount that is reduced up ^^----------
                        	String run =  "UPDATE abc SET " +
                        	"amount='" +Amount+"' WHERE password="+Password;
                        try{
                        	Connection connection = DriverManager.getConnection(url,"","");
	      	            	Statement stmt = connection.createStatement();
      		            	stmt.executeUpdate(run);
                        	System.out.println("Operation completed...");
      		            	connection.close();
                            }catch(SQLException a){JOptionPane.showMessageDialog(
				null,url,"SQL EXCEPTION AT UPDATE OPERATION",
				JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else if(event.getSource()==button2){
                        	this.hide();
                                MainMenu s=new MainMenu();s.Main();
                        }

              }
	}
