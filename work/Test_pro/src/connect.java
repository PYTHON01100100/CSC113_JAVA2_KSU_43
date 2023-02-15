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


 
public class connect {
    public static void main(String[] args) {
        try {
            // 2) الذي سنعتمد عليه للوصول إلى قاعدة البيانات MYSQL Driver هنا قمنا بتحديد رابط الوصول لبرنامج الـ
            Class.forName("com.mysql.jdbc.Driver");
 
            // 3) و الذي سنستخدمه لتحديد المعلومات الأساسية التي نحتاجها للإتصال بقاعدة البيانات Connection هنا قمنا بإنشاء كائن من الكلاس
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
 
            // 4) و الذي سنستخدمه لإرسال إستعلامات إلى قاعدة البيانات Statement هنا قمنا بتجهيز كائن نوعه
            Statement stmt = con.createStatement();
 
            // 5) rs هنا قمنا بإرسال إستعلام إلى قاعدة البيانات لجلب جميع الأسماء الموجودة في جدول الطلاب. بعدها قمنا بتخزين النتيجة في الكائن
            ResultSet rs = stmt.executeQuery("select name from students");
 
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
 
    }
 
}