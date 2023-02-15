import javax.swing.JFrame;
 
public class tests {
 
    public static void main(String[] args) {
 
        JFrame f = new JFrame();                            // أي قمنا بإنشاء نافذة JFrame هنا أنشأنا كائن من الكلاس
        f.setSize(500, 400);                                // هنا قمنا بتحديد حجم النافذة. عرضها 500 و طولها 400
        f.setVisible(true);                                 // هنا جعلنا النافذة مرئية
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
 
    }
 
}