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


public class entering1{
	
	static JFrame frame = new JFrame("JTextField demo");        // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
    static JTextField textField = new JTextField();             // textField إسمه Text Field هنا أنشأنا
    static JLabel label = new JLabel("Enter any thing");        // label إسمه Label هنا أنشأنا
    static JLabel labelResult = new JLabel();                   // فارغ labelResult إسمه Label هنا أنشأنا
    static JButton button = new JButton("Get text");            // button إسمه Button هنا أنشأنا


	
    public static void main(String[] args) {
    	 
        label.setBounds(40, 40, 100, 30);                       // frame في الـ label هنا قمنا بتحديد حجم و موقع الكائن
        textField.setBounds(150, 40, 150, 30);                  // frame في الـ textField هنا قمنا بتحديد حجم و موقع الكائن
        button.setBounds(40, 120, 80, 30);                      // frame في الـ button هنا قمنا بتحديد حجم و موقع الكائن
        labelResult.setBounds(150, 120, 150, 30);               // frame في الـ labelResult هنا قمنا بتحديد حجم و موقع الكائن
 
        frame.add(label);                                       // frame في الـ label هنا أضفنا الكائن
        frame.add(textField);                                   // frame في الـ textField هنا أضفنا الكائن
        frame.add(button);                                      // frame في الـ button هنا أضفنا الكائن
        frame.add(labelResult);                                 // frame في الـ labelResult هنا أضفنا الكائن
 
        frame.setSize(360, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 360 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(null);                                  // لذلك قمنا بتحديد مكان كل شيء قمنا بإضافته في النافذة Layout Manager أي لم نستخدم أي null هنا وضعنا
        frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
 
        button.addActionListener(new ActionListener() {         // button هنا نضع الأوامر التي نريد تنفيذها عند النقر على الزر
            @Override
            public void actionPerformed(ActionEvent e) {
                labelResult.setText(textField.getText());       // button عند النقر على الـ label و وضعه كنص للكائن textField سيتم جلب النص الموجود في الكائن
            }
        });
 
    }
    
    
	
	
	
	
    
    
    
	


}