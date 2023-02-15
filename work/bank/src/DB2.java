
import java.awt.*;             //
import java.awt.event.*;      //    PACKAGES
import javax.swing.*;        //
import java.sql.*;          //

   public class DB2 extends JFrame implements ActionListener{
          private JTextField text1,text2,text3,text4,text5,text6,text7;
          private JButton but1,but2,but3,but4,but5,but6,but7,button1,button2;
          private JLabel label,label1,label2,label3,label4,label5,label6;
          private String str1,str2,str3,str4,str5,str6,str7;
          private int Amount,Password,Depts,password2;
          protected JList list1,list2;
          private String depts[]={"Renting dept","Receipt dept","Credit depts",
          		"Education depts","Insurance depts","Comunication depts",
                        "Car depts","Home depts","Security depts.."};
          static String url = "jdbc:odbc:abc";
          Container c;
          //---Constructor---
          public DB2(){
                 super("Executions");
          }//--Method for changing password--called from class CardTransactions--
          public void ChangePword(){
                 c=getContentPane();
                 c.setLayout(null);

                 but1=new JButton(" OK ");
                 but1.addActionListener(this);
                 but1.setPreferredSize(new Dimension(80,23));
                 but1.setSize(but1.getPreferredSize());
                 but1.setLocation(200,180);
                 but1.setBackground(Color.white);
                 c.add(but1);

                 but3=new JButton("CANCEL");
                 but3.addActionListener(this);
                 but3.setPreferredSize(new Dimension(80,22));
                 but3.setSize(but3.getPreferredSize());
                 but3.setLocation(100,180);
                 but3.setBackground(Color.white);
                 c.add(but3);

                 text1=new JTextField(10);
                 text1.setPreferredSize(new Dimension(10,22));
                 text1.setSize(text1.getPreferredSize());
                 text1.setLocation(200,50);
                 str1=text1.getText();
                 c.add(text1);

                 text2=new JTextField(10);
                 text2.setPreferredSize(new Dimension(10,22));
                 text2.setSize(text2.getPreferredSize());
                 text2.setLocation(200,100);
                 str2=text2.getText();
                 c.add(text2);

                 label1=new JLabel("Enter your OLD password:");
                 label1.setPreferredSize(new Dimension(150,30));
                 label1.setSize(label1.getPreferredSize());
                 label1.setLocation(33,46);
                 c.add(label1);

                 label2=new JLabel("Enter your NEW password:");
                 label2.setPreferredSize(new Dimension(160,30));
                 label2.setSize(label2.getPreferredSize());
                 label2.setLocation(33,96);
                 c.add(label2);

                 setSize(350,300);
                 setResizable(true);
                 show();
          }//--Method for DeptPaying--called from class CardTransactions--
          public void DeptPaying(){
                 c=getContentPane();
                 c.setLayout(new FlowLayout());

                 list1 =new JList(depts);
                 list1.setVisibleRowCount(5);
                 list1.setFixedCellHeight(15);
                 list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                 c.add(new JScrollPane(list1));

                 list2 =new JList();
                 list2.setVisibleRowCount(4);
                 list2.setFixedCellWidth(100);
                 list2.setFixedCellHeight(18);
                 list2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                 c.add(new JScrollPane(list2));

                 label5=new JLabel("Enter your password:");
                 c.add(label5);
                 text6=new JTextField(15);
                 c.add(text6);

                 label6=new JLabel("Your dept to pay:");
                 c.add(label6);
                 text7=new JTextField(15);
                 c.add(text7);

                 but2=new JButton(" OK ");
                 but2.setBackground(Color.white);
                 but2.setPreferredSize(new Dimension(100,20));
                 but2.setSize(but2.getPreferredSize());
                 but2.addActionListener(this);
                 c.add(but2);

                 but4=new JButton(" Cancel ");
                 but4.addActionListener(this);
                 but4.setPreferredSize(new Dimension(100,20));
                 but4.setSize(but4.getPreferredSize());
                 but4.setBackground(Color.white);
                 c.add(but4);


                 setSize(370,200);
                 setVisible(true);
          }//----Method for ActionListener-------
          public void actionPerformed(ActionEvent event){

                  if(event.getSource()==but1){
                        //--Getting the values which will be changed--
                        str1=text1.getText();
                        str2=text2.getText();
                                //--Updating the values of password changing--
                        	String run =  "UPDATE abc SET " +
                        	"password='" +str2+"' WHERE password="+str1;
                        try{
                        	Connection connection = DriverManager.getConnection(url,"","");
	      	            	Statement stmt = connection.createStatement();
      		            	stmt.executeUpdate(run);
                        	System.out.println("Operation completed...");
      		            	connection.close();
                            }catch(SQLException a){JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT UPDATE OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }
                  }
                  //---Select operation for the DeptPaying method----
                  else if(event.getSource()==but2){
                  	int int6;int int7;Depts=0;
                       	list2.setListData(list1.getSelectedValues());

                        try{
                        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            }catch(ClassNotFoundException a){
                            	JOptionPane.showMessageDialog(null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                            }

                       	try{
                        	str6=text6.getText();
                       		int6=Integer.parseInt(str6);
                        	String run = "SELECT * FROM abc " +"WHERE password = " +int6;
                        	System.out.println(run + "SQL string executed");
                        	Connection connection = DriverManager.getConnection(url,"","");
  	                     	Statement stmt = connection.createStatement();
                        	ResultSet result=stmt.executeQuery(run);
                              while(result.next()){
                        	String name = result.getString(1);
                        	String surname = result.getString(2);
                        	int amount = result.getInt(3);
                        	int password = result.getInt(4);
                        	int depts =result.getInt(5);
                       		password2=password;
                        	Depts=depts;
                              }
                              	connection.close();
                              }catch(SQLException a){
                              	JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT SELECT OPERATION",JOptionPane.INFORMATION_MESSAGE);
                              }
                        	int6=password2;
                        	str7=text7.getText();
                        	int7=Integer.parseInt(str7);
                        	Depts=Depts-int7;
                                //---Update operation for DeptPaying----
                       		String run4 =  "UPDATE abc SET " +
                        	"depts='" +Depts+"' WHERE password="+int6;
                        try{
                        	Connection connection = DriverManager.getConnection(url,"","");
	      	            	Statement stmt = connection.createStatement();
      		            	stmt.executeUpdate(run4);
                        	System.out.println("Operation completed...");
      		            	connection.close();
                            }catch(SQLException a){JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT UPDATE OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }
                  }
                  //--------------------------------------------------------------

                  else if(event.getSource()==but3){
                  	this.hide();}
                  else if(event.getSource()==but4){
                        this.hide();
                  }
                  else if(event.getSource()==but7){
                        this.hide();}
                 //----Select operation for Demonstration-------------------------
                 else if(event.getSource()==but6){
                         try{
                         	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                             }catch(ClassNotFoundException a){
                             	JOptionPane.showMessageDialog(null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                             }
                          try{
                          	str5=text5.getText();
                        	int pword=Integer.parseInt(str5);

                        	String run = "SELECT * FROM abc " +"WHERE password = " +pword;
                        	System.out.println(run + "SQL string executed");
                        	Connection connection = DriverManager.getConnection(url,"","");
  	                     	Statement stmt = connection.createStatement();
                        	ResultSet result=stmt.executeQuery(run);
                              while(result.next()){
                        	String name = result.getString(1);
                        	String surname = result.getString(2);
                        	String amount = result.getString(3);
                        	String password = result.getString(4);
                        	JOptionPane.showMessageDialog(null,"Your total money is: "+amount+"$");
                              }
                        	connection.close();
                              }
                              catch(SQLException a){
                              	JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT SELECT OPERATION",JOptionPane.INFORMATION_MESSAGE);
                              }

                 }//--Closing the actionPerformed method--
          }//--Method for the
          public void Back(){
          	 this.hide();
                 MainMenu s=new MainMenu();
                 s.Main();
          }
          public void Demonstration(){
                 c = getContentPane();
                 c.setLayout(new FlowLayout());

                 label4=new JLabel("To see remainder,write your password ");
                 c.add(label4);

                 text5=new JTextField(10);
                 c.add(text5);

                 but6 = new JButton("OK");
                 but6.addActionListener(this);
                 c.add(but6);

                 but7 = new JButton("BACK");
                 but7.addActionListener(this);
                 c.add(but7);

                 setSize(350,200);
                 setResizable(true);
                 show();
          }
}
