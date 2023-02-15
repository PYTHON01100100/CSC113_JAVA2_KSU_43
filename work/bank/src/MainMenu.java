import java.awt.event.* ;     //
import javax.swing.* ;       //  PACKAGES
import java.awt.* ;         //
import java.sql.*;         //
        //-----------------THE MAIN MENU---------------------
	public class MainMenu extends JFrame implements ActionListener {
	    	private JButton but1, but2, but3, but4, but5, but6,but7,but8,but9 ;
                private JLabel labb,label,label2,label3,label4,label4a,label5,label6,label6a,label7;
                private JTextArea textarea;
                private JPasswordField pwordfield;
                private int pw,intt;
       		static String url = "jdbc:odbc:abc";
                private String str1;
       		Container c;
                //--Constructor----
	    	public MainMenu() {
              		super("ATM");
              	}
                //----Method Main(The main Method)-----
       		public void Main(){
                      c = getContentPane() ;
                      c.setLayout(null) ;


		        but1 = new JButton(">>>") ;
		        but1.setPreferredSize( new Dimension(100,30) ) ;
		        but1.setSize( but1.getPreferredSize() ) ;
		        but1.setLocation(50,50) ;
		        but1.addActionListener(this) ;
		        c.add(but1) ;

                      but2 = new JButton(">>>") ;
                      but2.setPreferredSize( new Dimension(100,30) ) ;
                      but2.setSize( but2.getPreferredSize() ) ;
                      but2.setLocation(50,100) ;
                      but2.addActionListener(this) ;
                      c.add(but2) ;

              		but3=new JButton(">>>");
              		but3.setPreferredSize(new Dimension(100,30));
              		but3.setSize(but3.getPreferredSize());
              		but3.addActionListener(this);
             	 	but3.setLocation(50,150);
              		c.add(but3);

                      but4 = new JButton("<<<");
                      but4.setPreferredSize(new Dimension(100,30));
                      but4.setSize(but4.getPreferredSize());
                      but4.addActionListener(this);
                      but4.setLocation(375,50);
                      c.add(but4);

              		but5 = new JButton("<<<");
              		but5.setPreferredSize(new Dimension(100,30));
              		but5.setSize(but5.getPreferredSize());
              		but5.setLocation(375,100);
              		but5.addActionListener(this);
              		c.add(but5);

                      but6 = new JButton("<<<");
                      but6.setPreferredSize(new Dimension(100,30));
                      but6.setSize(but6.getPreferredSize());
                      but6.setLocation(375,150);
                      but6.addActionListener(this);
                      but6.addActionListener(new ActionListener(){
                        //----Creating the odbc Driver for but6-----
                      	public void actionPerformed(ActionEvent event){
                          if(event.getSource()==but6){
                          	try{
                                	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                    }catch(ClassNotFoundException a){
                                    	JOptionPane.showMessageDialog(
			null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                                    }
                          }
                        }


                      });
                      c.add(but6);

              		but7 = new JButton("CANCEL");
              		but7.setPreferredSize(new Dimension(100,30));
              		but7.setSize(but7.getPreferredSize());
              		but7.setLocation(200,212);
              		but7.addActionListener(this);
              		c.add(but7);

                      label=new JLabel("CASH");
                      label.setPreferredSize(new Dimension(75,50));
                      label.setSize(label.getPreferredSize());
                      label.setLocation(160,40);
                      label.setToolTipText("to draw money,please click on the left button");
                      c.add(label);

              		label2 = new JLabel(" INFORMATION");
              		label2.setPreferredSize(new Dimension(85,50));
                        label2.setSize(label2.getPreferredSize());
              		label2.setLocation(280,40);
              		label2.setToolTipText("For information,please click on the left button");
              		c.add(label2);

                      label3 = new JLabel("TRANSFER");
                      label3.setPreferredSize(new Dimension(85,50));
                      label3.setSize(label3.getPreferredSize());
                      label3.setLocation(160,90);
                      label3.setToolTipText("for referring money,click on the right button");
                      c.add(label3);

              		label4 = new JLabel("CARD ");
              		label4.setPreferredSize(new Dimension(85,50));
              		label4.setSize(label4.getPreferredSize());
              		label4.setLocation(160,132);
              		label4.setToolTipText(
		"For password,dept operations,please click on the left button");
              		c.add(label4);

              		label4a = new JLabel("TRANSACTIONS");
              		label4a.setPreferredSize(new Dimension(100,50));
                        	label4a.setSize(label4a.getPreferredSize());
              		label4a.setLocation(160,148);
              		c.add(label4a);

                      label5 = new JLabel("  INVESTMENT");
                      label5.setPreferredSize(new Dimension(95,50));
                      label5.setSize(label5.getPreferredSize());
                      label5.setLocation(280,90);
                      label5.setToolTipText(
		"To buy fund,bond etc.,please click on the right button");
                      c.add(label5);

              		label6 = new JLabel("  STANDARD");
              		label6.setPreferredSize(new Dimension(75,50));
              		label6.setSize(label6.getPreferredSize());
              		label6.setLocation(280,132);
              		label6.setToolTipText("To get 10$ rapidly,please click");
              		c.add(label6);

              		label6a = new JLabel("  CASH");
              		label6a.setPreferredSize(new Dimension(75,50));
              		label6a.setSize(label6a.getPreferredSize());
              		label6a.setLocation(280,147);
              		label6a.setToolTipText("To get 10$ rapidly please click");
              		c.add(label6a);

                      setSize(500,410) ;
                      show();
	        }
                //------actionPerformed method for ActionListener-----
                public void actionPerformed( ActionEvent event ){
                	if( event.getSource()==but7 )
                        	System.exit(0) ;
                        else if( event.getSource() == but1 ){
                        	new Cash();this.hide();}
                     	else if(event.getSource()== but2 ){
                          	new Transfer();this.hide();}
                     	else if(event.getSource()==but3){
                          	new CardTransactions();this.hide();}
                     	else if(event.getSource()==but4 ){
                          	new Information();this.hide();}
                     	else if(event.getSource()==but6){
                          	new StandardCash();this.hide();}
                        else if(event.getSource()==but9)
                        	System.exit(0);
                     	else if(event.getSource()==but8){
                                //----Select operation for  comparison of first password entered----
                          	try{
                                	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	                            }catch(ClassNotFoundException a){
                                    	JOptionPane.showMessageDialog(
			null, url,"CLASS NOT FOUND EXCEPTION !!!",
			JOptionPane.INFORMATION_MESSAGE);
                                    }

                          	try{
                              		String string = new String(pwordfield.getPassword());
					intt=Integer.parseInt(string);
                        		String run = "SELECT * FROM abc " +"WHERE password = " +intt;
                        		System.out.println(run + "SQL string executed");
                        		Connection connection = DriverManager.getConnection(url,"","");
  	                     		Statement stmt = connection.createStatement();
                        		ResultSet result=stmt.executeQuery(run);
                                    while(result.next()){
                        		String name = result.getString(1);
                        		String surname = result.getString(2);
                        		int amount = result.getInt(3);
                        		int password = result.getInt(4);
                        		pw=password;

                                    }
                        		connection.close();

                                    }catch(SQLException a){
       		  	         	JOptionPane.showMessageDialog(
				null,url,"SQL EXCEPTION AT SELECT OPERATION",
				JOptionPane.INFORMATION_MESSAGE);
	                }               this.hide();
                        //---Comparison---if there is not equivalent MainMenu does not appear-----
                           if(pw==intt){MainMenu s=new MainMenu();s.Main();}
                   	   else if(pw!=intt){
                        	JOptionPane.showMessageDialog(
		null,"Invalid Password,Please try again",
		"EXCEPTION",JOptionPane.ERROR_MESSAGE);
                                MainMenu s=new MainMenu();s.Password();
                           }
                        }

               	}//-----method main---Executes the password asking--------
               	public static void main(String args[]){
               		 MainMenu s=new MainMenu();
                         s.Password();
               	}//-----password method----------
               	public void Password(){
                         c = getContentPane() ;
                         c.setLayout(new FlowLayout()) ;
                         c.setBackground(Color.lightGray);

               		 pwordfield=new JPasswordField(17);
                         c.add(pwordfield);

                         but8=new JButton("OK");
                         but8.setPreferredSize(new Dimension(90,25));
                         but8.setSize(but8.getPreferredSize());
                         but8.addActionListener(this);
                         c.add(but8);

                         but9=new JButton("CANCEL");
                         but9.setPreferredSize(new Dimension(90,25));
                         but9.setSize(but9.getPreferredSize());
                         but9.addActionListener(this);
                         c.add(but9);
                         //-----Informations about the program-----
                         String sttr="              W E L C O M E!\n"+
                         	     "    Please write your password:\n"+
                                     "----------------------------------------------\n"+
                         	     "            This product is a\n"+
                         	     "       guarenteed trade mark of\n"+
                                     " 'SP COMPUTER SYSTEMS INC.\n"+
                                     "  For information we are on web:\n"+
                                     "         www.spcomputer.com\n"+
                                     "----------------------------------------------\n"+
                                     "        Producer:  ÖNER  EKIZ";

                         //-----set up textarea----------------
                         textarea = new JTextArea(sttr,10,17);
                         c.add(new JScrollPane(textarea));
                         textarea.setBackground(Color.lightGray);
                         textarea.setEditable(false);
                         setSize(250,300) ;
                         show();
               }
       	}