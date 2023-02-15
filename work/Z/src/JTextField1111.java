import javax.swing.JFrame;
import javax.swing.JTextField;
 
public class JTextField1111 {
    public static void main(String[] args) {
    	 
        JFrame frame = new JFrame("JTextField demo");             // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(300, 250);                                  // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(null);                                    // في النافذة بنفسنا Text Field لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
 
        JTextField textField = new JTextField("Enter anything");  // Text Field أي قمنا بإنشاء JTextField هنا أنشأنا كائن من الكلاس
        textField.setBounds(40, 40, 200, 30);                     // frame في الـ Text Field هنا قمنا بتحديد حجم و موقع الـ
 
        frame.add(textField);                                     // frame في الـ textField هنا أضفنا الـ
 
        frame.setVisible(true);                                   // هنا جعلنا النافذة مرئية
 
    }

}
