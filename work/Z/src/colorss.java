import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
public class colorss {
    public static void main(String[] args) {
    	 
        JFrame frame = new JFrame("JLabel demo");               // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(300, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(new FlowLayout());                      // حتى نجعل الأشياء التي نضيفها في النافذة تترب وراء بعضها و في وسط النافذة FlowLayout إستخدمنا الـ
 
        Font newFont = new Font("Arial", Font.BOLD, 18);        // حجمه 18 Arial يمثل نوع خط عريض إسمه Font هنا أنشأنا كائن من الكلاس
 
        JLabel label_1 = new JLabel("label 1");                 // Label أي قمنا بإنشاء JLabel هنا أنشأنا كائن من الكلاس
        label_1.setFont(newFont);                               // newFont يستخدم الـ label هنا جعلنا الـ
 
        JLabel label_2 = new JLabel("label 2");                 // Label أي قمنا بإنشاء JLabel هنا أنشأنا كائن من الكلاس
        label_2.setFont(newFont);                               // newFont يستخدم الـ label هنا جعلنا الـ
 
        JLabel label_3 = new JLabel("label 3");                 // Label أي قمنا بإنشاء JLabel هنا أنشأنا كائن من الكلاس
        label_3.setFont(newFont);                               // newFont يستخدم الـ label هنا جعلنا الـ
 
        label_1.setForeground(Color.blue);                      // إلى اللون الأزرق label_1 هنا قمنا بتغيير لون الـ
        label_2.setForeground(Color.red);                       // إلى اللون الأحمر label_2 هنا قمنا بتغيير لون الـ
        label_3.setForeground(Color.orange);                      // إلى اللون الرمادي label_3 هنا قمنا بتغيير لون الـ
 
        frame.add(label_1);                                     // frame في الـ label_1 هنا أضفنا الـ
        frame.add(label_2);                                     // frame في الـ label_2 هنا أضفنا الـ
        frame.add(label_3);                                     // frame في الـ label_3 هنا أضفنا الـ
 
        frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
 
    }


	

}
