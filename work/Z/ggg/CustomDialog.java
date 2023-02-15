import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class CustomDialog {
 
    // JButton و JLabel و JDialog هذا الكلاس يحتوي على
    private JDialog dialog;
    private final JLabel label;
    private final JButton button;
 
    // التي نريده أن يظهر بداخلها Frame هنا قلنا أنه عند إنشاء كائن من هذا الكلاس يجب أن نمرر له الـ
    public CustomDialog(JFrame f) {
 
        // Dialog و تعريف الأشياء التي سنضيفها في الـ Frame بالـ Dialog هنا قمنا بربط الـ
        dialog = new JDialog(f);
        label = new JLabel("This is a custom dialog");
        button = new JButton("close");
 
        // Dialog هنا قمنا بتحديد موقع و جميع الأشياء التي سنضيفها في الـ
        label.setBounds(40, 50, 150, 30);
        button.setBounds(210, 50, 70, 30);
 
        // Dialog هنا قمنا بتحديد بعض خصائص الـ
        dialog.setLocationRelativeTo(f);
        dialog.setLayout(null);
        dialog.setSize(340, 170);
        dialog.setTitle("Custom Dialog");
        dialog.setModal(false);
 
        // Dialog بداخل الـ button و الـ label هنا قمنا بوضع الـ
        dialog.add(label);
        dialog.add(button);
 
        // button عند النقر على الـ Dialog هنا قلنا أنه سيتم إخفاء الـ
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
 
    }
 
    // Dialog هنا قمنا ببناء دالة لإظهار الـ
    public void show() {
        dialog.setVisible(true);
    }
 
    // Dialog هنا قمنا ببناء دالة لإخفاء الـ
    public void hide() {
        dialog.setVisible(false);
    }
 
}
