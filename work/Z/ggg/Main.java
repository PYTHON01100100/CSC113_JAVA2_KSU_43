import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class Main {
 
    public static void main(String[] args) {
 
        // هنا قمنا بإنشاء النافذة مع تحديد بعض خصائصها
        JFrame frame = new JFrame("JDialog demo");              // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(400, 200);                                // هنا قمنا بتحديد حجم النافذة. عرضها 320 و طولها 300
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(null);                                  // في النافذة بنفسنا Tabbed Pane لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
 
        // Panels هنا قمنا بتعريف ثلاثة
        JButton button = new JButton("Open Dialog");
        button.setBounds(40, 80, 130, 30);
        frame.add(button);
 
        // منهم Panel هنا قمنا بإعطاء لون خلفية لكل
        CustomDialog dialog = new CustomDialog(frame);
 
        // مرئية Frame هنا جعلنا الـ
        frame.setVisible(true);
 
        // button عند النقر على الـ Input Dialog هنا قلنا أنه سيتم إظهار
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.show();
            }
        });
 
    }
 
}
