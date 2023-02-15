
import java.awt.*;             //
import java.awt.event.*;      //    PACKAGES
import javax.swing.*;        //
import java.sql.*;          //
       public class Cash extends JFrame implements ActionListener{
          public JButton button1,button2,button3,button4,button5,button6,cancelBut;
          private JLabel label1,label2,label3,label4,label5,label6;
          private JTextField textField;
          static String url = "jdbc:odbc:abc";
          //---Constructor---
          public Cash(){
                 super("Cash");
                 Container container=getContentPane() ;
                 container.setLayout(null);

                 textField=new JTextField(10);
                 button1 = new JButton(">>>");
                 button1.setPreferredSize(new Dimension(100,30));
                 button1.setSize(button1.getPreferredSize());
                 button1.setLocation(50,50);
                 button1.addActionListener(this);
                 container.add(button1);

                 button2 = new JButton(">>>");
                 button2.setPreferredSize(new Dimension(100,30));
                 button2.setSize(button2.getPreferredSize());
                 button2.setLocation(50,100);
                 button2.addActionListener(this);
                 container.add(button2);

                 button3 = new JButton(">>>");
                 button3.setPreferredSize(new Dimension(100,30));
                 button3.setSize(button3.getPreferredSize());
                 button3.setLocation(50,150);
                 button3.addActionListener(this);
                 container.add(button3);

                 button4 = new JButton("<<<");
                 button4.setPreferredSize(new Dimension(100,30));
                 button4.setSize(button4.getPreferredSize());
                 button4.setLocation(375,50);
                 //---makes the communication with the odbc Driver---
                 button4.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent event){
                               if(event.getSource()==button1){
                               try{
  		                         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	                            }catch(ClassNotFoundException a){
		                         JOptionPane.showMessageDialog(null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                               }}DB s=new DB();s.CashScreen();}
                 });
                 container.add(button4);

                 button5 = new JButton("<<<");
                 button5.setPreferredSize(new Dimension(100,30));
                 button5.setSize(button5.getPreferredSize());
                 button5.setLocation(375,100);
                 button5.addActionListener(this);
                 container.add(button5);

                 button6 = new JButton("<<<");
                 button6.setPreferredSize(new Dimension(100,30));
                 button6.setSize(button6.getPreferredSize());
                 button6.setLocation(375,150);
                 //---makes the communication with the odbc Driver---
                 button6.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent event){
                               if(event.getSource()==button1){
                               try{
  		                         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	                            }catch(ClassNotFoundException a){
		                         JOptionPane.showMessageDialog(null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                               }}DB s=new DB();s.ExecutionForAnother();}
                 });

                 container.add(button6);

                 cancelBut = new JButton("CANCEL");
                 cancelBut.setPreferredSize(new Dimension(100,30));
                 cancelBut.setSize(cancelBut.getPreferredSize());
                 cancelBut.setLocation(375,200);
                 cancelBut.addActionListener(this);
                 container.add(cancelBut);

                 label1=new JLabel("  10 $");
                 label1.setPreferredSize(new Dimension(75,30));
                 label1.setSize(label1.getPreferredSize());
                 label1.setLocation(150,50);
                 container.add(label1);

                 label2=new JLabel("      20 $");
                 label2.setPreferredSize(new Dimension(75,30));
                 label2.setSize(label2.getPreferredSize());
                 label2.setLocation(300,50);
                 container.add(label2);

                 label3=new JLabel("  40 $");
                 label3.setPreferredSize(new Dimension(75,30));
                 label3.setSize(label3.getPreferredSize());
                 label3.setLocation(150,100);
                 container.add(label3);

                 label4=new JLabel("      50 $");
                 label4.setPreferredSize(new Dimension(75,30));
                 label4.setSize(label4.getPreferredSize());
                 label4.setLocation(300,100);
                 container.add(label4);

                 label5=new JLabel("  100 $");
                 label5.setPreferredSize(new Dimension(75,30));
                 label5.setSize(label5.getPreferredSize());
                 label5.setLocation(150,150);
                 container.add(label5);

                 label6=new JLabel("  Another..");
                 label6.setPreferredSize(new Dimension(85,30));
                 label6.setSize(label6.getPreferredSize());
                 label6.setLocation(300,150);
                 container.add(label6);

                 setSize(500,400);
                 setVisible(true);

          }//---Method for Actionlistener---
          public void actionPerformed(ActionEvent event){
             if(event.getSource()==cancelBut){
                        this.hide();//closes the present application
                        MainMenu s=new MainMenu();s.Main();//and goes to MainMenu
             }

          }
}

