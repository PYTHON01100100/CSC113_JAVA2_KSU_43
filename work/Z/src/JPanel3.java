import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
public class JPanel3 {
    public static void main(String[] args) {
    	 
        // هنا قمنا بإنشاء النافذة مع تحديد بعض خصائصها
        JFrame frame = new JFrame("JPanel demo");
        frame.setSize(300, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
 
        // Frame لونه رمادي و حددنا موقعه بداخل الـ Panel هنا قمنا بتعريف
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(50, 50, 180, 110);
 
        // Frame في الـ Panel هنا وضعنا الـ
        frame.add(panel);
 
        // Buttons هنا قمنا بتعريف 4
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
 
        // منهم Button هنا قمنا بإعطاء لون خلفية مختلف لكل
        button1.setBackground(Color.orange);
        button2.setBackground(Color.yellow);
        button3.setBackground(Color.green);
        button4.setBackground(Color.pink);
 
        // Panel في الـ Buttons هنا قمنا بوضع الـ
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
 
        // مرئية Frame هنا جعلنا الـ
        frame.setVisible(true);
 
    }

}
