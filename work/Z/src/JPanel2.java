import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class JPanel2 {
    public static void main(String[] args) {
    	 
        JFrame frame = new JFrame("JPanel demo");               // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(300, 240);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 240
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(null);                                  // في النافذة بنفسنا Panel لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
 
        JPanel panel = new JPanel();                            // Panel أي قمنا بإنشاء JPanel هنا أنشأنا كائن من الكلاس
        panel.setBackground(Color.gray);                        // رمادي Panel هنا جعلنا لون خلفية الـ
        panel.setBounds(50, 50, 180, 110);                      // frame في الـ Panel هنا قمنا بتحديد حجم و موقع الـ
 
        frame.add(panel);                                       // frame في الـ Panel هنا أضفنا الـ
 
        frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
 
    }

}
