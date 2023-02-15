
import java.awt.*;            //
import java.awt.event.*;     //   PACKAGES
import javax.swing.*;       //
import java.sql.*;         //

public class CardTransactions extends JFrame {
       private JButton button1,button2,button3;
       private JLabel label1,label2;
       static String url = "jdbc:odbc:abc";
       Container container;
       //---Constructor---
       public CardTransactions(){
                 super(" Card Transactions");
                 Container container = getContentPane();
                 container.setLayout(null);

                 button1 = new JButton(">>>");
                 button1.setPreferredSize(new Dimension(100,30));
                 button1.setSize(button1.getPreferredSize());
                 button1.setLocation(30,50);
                 //---making connection with the database---
                 button1.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent event){
                               try{
  		                         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	                            }catch(ClassNotFoundException a){
		                         JOptionPane.showMessageDialog(null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                                    }
                        //--goes to DB2-ChangePword to execute changing password--
                        DB2 s=new DB2();s.ChangePword();
                        }
                 });
                 container.add(button1);

                 button2 = new JButton(">>>");
                 button2.setPreferredSize(new Dimension(100,30));
                 button2.setSize(button2.getPreferredSize());
                 button2.setLocation(30,100);
                 //--makes the connection with the database
                 //--and goes to DB2 to execute paying dept
                 button2.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent event){
                            DB2 s=new DB2();s.DeptPaying();
                      }
                 });
                 container.add(button2);

                 button3 = new JButton("<BACK>");
                 button3.setPreferredSize(new Dimension(100,30));
                 button3.setSize(button3.getPreferredSize());
                 button3.setLocation(30,150);
                 button3.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent event){
				DB2 s=new DB2();s.Back();
                        }
                 });
                 container.add(button3);

                 label1 = new JLabel("Change Password");
                 label1.setPreferredSize(new Dimension(120,30));
                 label1.setSize(label1.getPreferredSize());
                 label1.setLocation(130,45);
                 container.add(label1);

                 label2 = new JLabel("Dept paying");
                 label2.setPreferredSize(new Dimension(120,30));
                 label2.setSize(label2.getPreferredSize());
                 label2.setLocation(130,98);
                 container.add(label2);

                 setSize(400,350);
                 setVisible(true);
       }//--end of constructor

}
