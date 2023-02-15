import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//1) هنا قمنا بإستدعاء الكلاسات و الإنترفيسات التي سنستخدمها للتعامل مع قاعدة البيانات
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.sql.*;

 
public class test2 {
 
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("JLabel demo");               // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(300, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(new FlowLayout());                      // حتى نجعل الأشياء التي نضيفها في النافذة تترب وراء بعضها و في وسط النافذة FlowLayout إستخدمنا الـ
       	try {
            // 2) الذي سنعتمد عليه للوصول إلى قاعدة البيانات MYSQL Driver هنا قمنا بتحديد رابط الوصول لبرنامج الـ
            Class.forName("com.mysql.jdbc.Driver");
 
            // 3) و الذي سنستخدمه لتحديد المعلومات الأساسية التي نحتاجها للإتصال بقاعدة البيانات Connection هنا قمنا بإنشاء كائن من الكلاس
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "123456");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "123456");
            System.out.println("done..");
            // 4) و الذي سنستخدمه لإرسال إستعلامات إلى قاعدة البيانات Statement هنا قمنا بتجهيز كائن نوعه
            Statement stmt = con.createStatement();
 
            // 5) rs هنا قمنا بإرسال إستعلام إلى قاعدة البيانات لجلب جميع الأسماء الموجودة في جدول الطلاب. بعدها قمنا بتخزين النتيجة في الكائن
            ResultSet rs = stmt.executeQuery("select * from students");
            System.out.println("ID   "+"National ID   "+"Full name   "+"Major   ");

            // 6) ( ملاحظة: هنا كل سطر يحتوي على إسم واحد ) rs هنا أنشأنا حلقة تمر على جميع الأسطر التي تم تخزينها في الكائن
            while(rs.next()) {
           	 String Stuid=rs.getString("ID");
           	 String natID=rs.getString("National ID");
           	 String name=rs.getString("Full name");
           	 String maj=rs.getString("Major");
           	JLabel label = new JLabel("  \n"+Stuid+"  \t"+natID+"  \t"+name+"  \t"+maj+"  \n");   
           	// Label أي قمنا بإنشاء JLabel هنا أنشأنا كائن من الكلاس
            frame.add(label);                                       // frame في الـ label هنا أضفنا الـ
            
            frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
     
            }
 
            // 7) هنا قمنا بإغلاق الإتصال مع قاعدة البيانات
            con.close();
        }
        catch(Exception e) {
        	System.out.println("message:");
            System.out.println(e.getMessage());
        }
        
 

    }
 
}