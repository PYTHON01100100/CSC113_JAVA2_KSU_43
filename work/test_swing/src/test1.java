import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
 
public class test1 {
 
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("JButton demo");              // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(300, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(new FlowLayout());                      // حتى نجعل الأشياء التي نضيفها في النافذة تترب وراء بعضها و في وسط النافذة FlowLayout إستخدمنا الـ
 
        JButton button = new JButton("Simple Button");          // Button أي قمنا بإنشاء JButton هنا أنشأنا كائن من الكلاس
 
        frame.add(button);                                      // frame في الـ button هنا أضفنا الـ
 
        frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
 
    }
 
}