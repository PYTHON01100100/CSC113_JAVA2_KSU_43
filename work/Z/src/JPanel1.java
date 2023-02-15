import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class JPanel1 {
	public static void main(String[] args) {
		 
        // هنا قمنا بإنشاء النافذة مع تحديد بعض خصائصها
        JFrame frame = new JFrame("JPanel demo");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
 
        // و وضعنا له حدود و عنوان Layout Manager لا يستخدم أي Panel هنا قمنا بتعريف
        JPanel panel = new JPanel(null);
        panel.setBorder(BorderFactory.createTitledBorder("Add User"));
        panel.setBounds(50, 30, 290, 300);
 
        // Frame في الـ Panel هنا وضعنا الـ
        frame.add(panel);
 
        // Panel هنا قمنا بتعريف جميع الأشياء التي سنضعها في الـ
        JLabel label1 = new JLabel("First Name");
        JLabel label2 = new JLabel("Last Name");
        JLabel label3 = new JLabel("Father Name");
        JLabel label4 = new JLabel("Mother Name");
        JLabel label5 = new JLabel("Gender");
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JComboBox comboBox = new JComboBox(new String[]{ "Male", "Female"});
        JButton button = new JButton("Add User");
 
        // Panel هنا قمنا بتحديد مكان كل شيء سنضيفه بداخل الـ
        label1.setBounds(30, 50, 100, 25);
        label2.setBounds(30, 90, 100, 25);
        label3.setBounds(30, 130, 100, 25);
        label4.setBounds(30, 170, 100, 25);
        label5.setBounds(30, 210, 100, 25);
        field1.setBounds(120, 50, 130, 25);
        field2.setBounds(120, 90, 130, 25);
        field3.setBounds(120, 130, 130, 25);
        field4.setBounds(120, 170, 130, 25);
        comboBox.setBounds(120, 210, 130, 25);
        button.setBounds(120, 255, 130, 25);
 
        // Panel في الـ Buttons هنا قمنا بوضع الـ
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(field1);
        panel.add(field2);
        panel.add(field3);
        panel.add(field4);
        panel.add(comboBox);
        panel.add(button);
 
        // مرئية Frame هنا جعلنا الـ
        frame.setVisible(true);
 
    }
}
