
import java.awt.*;            //
import java.awt.event.*;     //    PACKAGES
import javax.swing.*;       //
import java.sql.*;         //

public class DB extends JFrame implements ActionListener {
        static String url = "jdbc:odbc:abc";
        private JTextField text1,text2,text3;
        private JButton but1,but2,but3,but4;
        private JLabel label1,label2,label3;
        private int Amount,Amount1,pword,int1;
        private String str1,str2,str3;
        private String run;
        Container c;
        //---Constructor---
        public DB(){
        }//---Method for getting different amount--called from class Cash--
        public void ExecutionForAnother(){

               Container c=getContentPane();
               c.setLayout(new FlowLayout());

               label2=new JLabel("   Write the money you want to get and your password:");
               c.add(label2);
               text1=new JTextField(10);
               c.add(text1);

               label1=new JLabel("<<P.WORD||AMOUNT>>");
               c.add(label1);
               text2=new JTextField(10);
               c.add(text2);

               but1=new JButton(" OK ");
               but1.addActionListener(this);
               but1.setBackground(Color.white);
               c.add(but1);

               but4=new JButton(" BACK ");
               but4.addActionListener(this);
               but4.setBackground(Color.white);
               c.add(but4);

               setSize(400,250);
               setResizable(true);
               show();
        }//----Method for getting one of the value(money) that is seen
        //---on the screen--Called from class Cash---
        public void CashScreen(){
               c=getContentPane();
               c.setLayout(new FlowLayout());

               label3 = new JLabel("PLEASE WRITE Pword & PRESS OK:");
               c.add(label3);
               text3=new JTextField(10);
               c.add(text3);

               but2 = new JButton("OK");
               but2.setPreferredSize(new Dimension(80,25));
               but2.setSize(but2.getPreferredSize());
               but2.setBackground(Color.white);
               but2.addActionListener(this);
               c.add(but2);

               but3 = new JButton("CANCEL");
               but3.setPreferredSize(new Dimension(80,25));
               but3.setSize(but3.getPreferredSize());
               but3.setBackground(Color.white);
               but3.addActionListener(this);
               c.add(but3);

               setSize(350,200);
               show();
        }//--------Method for  the ActionListener---------
        public void actionPerformed(ActionEvent event){
                   if(event.getSource()==but2){// for CashScreen
                            str3=text3.getText();
                            int int8=Integer.parseInt(str3);
                        try{    //--Selection for CashScreen---
                        	String run =  "SELECT * FROM abc  " +"WHERE password=" +int8;
                        	System.out.println(run+"SQL Operatýon Executed..");
                        	Connection connection = DriverManager.getConnection(url,"","");
  	                     	Statement stmt = connection.createStatement();
                        	ResultSet result=stmt.executeQuery(run);
                              while (result.next()){
                        	String name = result.getString(1);
                        	String surname = result.getString(2);
                        	int amount = result.getInt(3);
                        	int password = result.getInt(4);
                        	Amount = amount;
                              }
                              connection.close();
                             }catch(SQLException a){
                             	JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT SELECTION OPERATION",JOptionPane.INFORMATION_MESSAGE);
	                     }
                        	Amount=Amount-20; //reducing the user's money
                                //---Updating the new values----
                        	String run1 =  "UPDATE abc SET " +
                        	"amount='" +Amount+"' WHERE password="+int8;
                        try{
                        	Connection connection = DriverManager.getConnection(url,"","");
	      	            	Statement stmt = connection.createStatement();
      		            	stmt.executeUpdate(run1);
                        	System.out.println("Operation completed...");
      		            	connection.close();
                            }catch(SQLException a){JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT UPDATE OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }


                   }//--------------------------------------------------------
                   else if(event.getSource()==but4){
                   		this.hide();}
                   else if(event.getSource()==but1){ //for another
                   	  	str2=text1.getText();  // gets password
                              	pword=Integer.parseInt(str2);
                        try{
                        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            }catch(ClassNotFoundException a){
                            	JOptionPane.showMessageDialog(null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                            }
			//---Selection for ExecutionForAnother----
                        try{
                        	String run = "SELECT * FROM abc " +"WHERE password = " +pword;
                        	System.out.println(run + "SQL string executed");
                        	Connection connection = DriverManager.getConnection(url,"","");
  	                     	Statement stmt = connection.createStatement();
                        	ResultSet result=stmt.executeQuery(run);
                              while(result.next()){
                        	String name = result.getString(1);
                        	String surname = result.getString(2);
                        	int amount = result.getInt(3);
                        	int password = result.getInt(4);

                        	Amount1=amount;
                        	}
                        	connection.close();
                            }catch(SQLException a){
                             	JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT SELECT OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }
                        	str1=text2.getText(); //gets the wanted money
                        	int1 =Integer.parseInt(str1);
                        	Amount1=Amount1-int1; //and subtract it from the total money
                                //--Update the Amount after operations above--
                        	String run1 =  "UPDATE abc SET " +
                        	"amount='" +Amount1+"' WHERE password="+pword;
                        try{
                        	Connection connection = DriverManager.getConnection(url,"","");
	      	            	Statement stmt = connection.createStatement();
      		            	stmt.executeUpdate(run1);
                        	System.out.println("Operation completed...");
      		            	connection.close();
                            }catch(SQLException a){JOptionPane.showMessageDialog(null,url,"SQL EXCEPTION AT UPDATE OPERATION",JOptionPane.INFORMATION_MESSAGE);
                            }
                   }
                   else if(event.getSource()==but3){
                        this.hide();
                   }
        }//--end of method actionPerformed---

}//--end of class.

