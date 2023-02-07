// 1) هنا قمنا بإستدعاء الكلاسات و الإنترفيسات التي سنستخدمها للتعامل مع قاعدة البيانات
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

 
public class connect2 {
    public static void main(String[] args) {
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
           	 System.out.println(Stuid+"     "+ natID+"   "+name+"   "+maj+"   ");
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
    	/*   	
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
            ResultSet rs = stmt.executeQuery("select ID from students");
 
            // 6) ( ملاحظة: هنا كل سطر يحتوي على إسم واحد ) rs هنا أنشأنا حلقة تمر على جميع الأسطر التي تم تخزينها في الكائن
            while(rs.next()) {
                // rs هنا في كل دورة سيتم عرض إسم جديد من الأسماء الموجودة في الكائن
                System.out.println(rs.getString("ID"));
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
*/
    	/*
        // 3) و الذي سنستخدمه لتحديد المعلومات الأساسية التي نحتاجها للإتصال بقاعدة البيانات Connection هنا قمنا بإنشاء كائن من الكلاس
        Connection con =null;

        // 4) و الذي سنستخدمه لإرسال إستعلامات إلى قاعدة البيانات Statement هنا قمنا بتجهيز كائن نوعه
        Statement stmt = null;

        // 5) rs هنا قمنا بإرسال إستعلام إلى قاعدة البيانات لجلب جميع الأسماء الموجودة في جدول الطلاب. بعدها قمنا بتخزين النتيجة في الكائن
        ResultSet rs = null;
        PreparedStatement pre=null; 
        try {
            // 2) الذي سنعتمد عليه للوصول إلى قاعدة البيانات MYSQL Driver هنا قمنا بتحديد رابط الوصول لبرنامج الـ
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?user=root&password=123456");
         //   Connection conn = DriverManager.getConnection("jdbc:mysql://hostname:port/mydb\", \"root\", \"123456");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://hostname:port/mydb\", \" root\", ");
          //  Connection conn = DriverManager.getConnection("jdbc:mysql:// 127.0.0.1 /mydb","root","root"); 
            stmt = conn.createStatement();
              rs = stmt.executeQuery("select * from students");
              System.out.println("ID   "+"National ID   "+"Full name   "+"Major   ");

             while(rs.next()) {
            	 String Stuid=rs.getString("ID");
            	 String natID=rs.getString("National ID");
            	 String name=rs.getString("Full name");
            	 String maj=rs.getString("Major");
            	 System.out.println(Stuid+"     "+ natID+"National ID   "+name+"Full name   "+maj+"Major   ");
            	 
             }
             
 /*
            // 6) ( ملاحظة: هنا كل سطر يحتوي على إسم واحد ) rs هنا أنشأنا حلقة تمر على جميع الأسطر التي تم تخزينها في الكائن
            while(rs.next()) {
                // rs هنا في كل دورة سيتم عرض إسم جديد من الأسماء الموجودة في الكائن
                System.out.println(rs.getString("name"));
            }

            // 7) هنا قمنا بإغلاق الإتصال مع قاعدة البيانات
            con.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        */
 