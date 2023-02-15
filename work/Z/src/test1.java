import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class test1{
	
    public static void main(String[] args) {
    	 
        JFrame frame = new JFrame("JTextField demo");           // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
 
        JTextField textField_1 = new JTextField("Red Text");    // textField_1 إسمه JtextField هنا قمنا بإنشاء
        JTextField textField_2 = new JTextField("Blue Text");   // textField_2 إسمه JtextField هنا قمنا بإنشاء
        JTextField textField_3 = new JTextField("Gray Text");   // textField_3 إسمه JtextField هنا قمنا بإنشاء
 
        Font newFont = new Font("Arial", Font.BOLD, 16);        // حجمه 16 Arial يمثل نوع خط عريض إسمه Font هنا أنشأنا كائن من الكلاس
 
        textField_1.setBounds(40, 40, 200, 30);                 // frame الأول في الـ Text Field هنا قمنا بتحديد حجم و موقع الـ
        textField_2.setBounds(40, 80, 200, 30);                 // frame الثاني في الـ Text Field هنا قمنا بتحديد حجم و موقع الـ
        textField_3.setBounds(40, 120, 200, 30);                // frame الثالث في الـ Text Field هنا قمنا بتحديد حجم و موقع الـ
 
        textField_1.setFont(newFont);                           // newFont يستخدم الـ textField_1 هنا جعلنا الـ
        textField_2.setFont(newFont);                           // newFont يستخدم الـ textField_2 هنا جعلنا الـ
        textField_3.setFont(newFont);                           // newFont يستخدم الـ textField_3 هنا جعلنا الـ
 
        textField_1.setForeground(Color.red);                   // أزرق فاتح textField_1 هنا جعلنا لون خط
        textField_2.setForeground(Color.blue);                  // أحمر textField_2 هنا جعلنا لون خط
        textField_3.setForeground(Color.gray);                  // برتقالي textField_3 هنا جعلنا لون خط
 
        frame.add(textField_1);                                 // frame في الـ textField_1 هنا أضفنا الـ
        frame.add(textField_2);                                 // frame في الـ textField_2 هنا أضفنا الـ
        frame.add(textField_3);                                 // frame في الـ textField_3 هنا أضفنا الـ
 
        frame.setSize(300, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(null);                                  // قمنا بإضافته سابقاً Text Field لذلك قمنا بتحديد مكان كل Layout Manager أي لم نستخدم أي null هنا وضعنا
        frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
 
    }

    
	
	
	
	
    
    
    
	


}