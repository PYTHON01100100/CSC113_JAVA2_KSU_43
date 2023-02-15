import java.awt.*;           //
import java.awt.event.*;    //  PACKAGES
import javax.swing.*;      //
import java.sql.*;        //
public class Information extends JFrame implements ActionListener {
       private JButton button1,button2;
       private JLabel label1,label2;
       static String url = "jdbc:odbc:abc";
       //-----Constructor------
       public Information(){
              super();
              Container container = getContentPane();
              container.setLayout(null);

              button1 = new JButton(" >>> ");
              button1.setPreferredSize(new Dimension(100,30));
              button1.setSize(button1.getPreferredSize());
              button1.setLocation(30,50);
              button1.addActionListener(this);
              container.add(button1);

              button2 = new JButton(" CANCEL ");
              button2.setPreferredSize(new Dimension(100,30));
              button2.setSize(button2.getPreferredSize());
              button2.setLocation(30,100);
              button2.addActionListener(this);
              container.add(button2);

              label1 = new JLabel("Demonstration");
              label1.setPreferredSize(new Dimension(120,30));
              label1.setSize(label1.getPreferredSize());
              label1.setLocation(150,43);
              container.add(label1);

              label2 = new JLabel("of Remainder");
              label2.setPreferredSize(new Dimension(120,30));
              label2.setSize(label2.getPreferredSize());
              label2.setLocation(150,56);
              container.add(label2);

              setSize(400,300);
              setVisible(true);
       }//------actionPerformed method for ActionListener-----
       public void actionPerformed(ActionEvent event){

              if(event.getSource()==button1){
              		DB2 s=new DB2();s.Demonstration();
              }
              else if(event.getSource()==button2){
                        //--Closes the present window--
                 	this.hide();
                        //--Going to DB2 class for execution
                 	DB2 s=new DB2();s.Back();
              }
       }

}
