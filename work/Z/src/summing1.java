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

public class summing1{
	static JLabel label_plus = new JLabel("+");                 // label_plus إسمه Label هنا أنشأنا
    static JLabel label_result = new JLabel();                  // فارغ label_result إسمه Label هنا أنشأنا
    static JFrame frame = new JFrame("JTextField demo");        // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
    static JTextField text_field_1 = new JTextField();          // text_field_1 إسمه Text Field هنا أنشأنا
    static JTextField text_field_2 = new JTextField();          // text_field_2 إسمه Text Field هنا أنشأنا
    static JButton button = new JButton("=");                   // button إسمه Button هنا أنشأنا
	   
    public static void main(String[] args) {
    	 
        label_plus.setBounds(135, 40, 50, 30);                  // frame في الـ label هنا قمنا بتحديد حجم و موقع الكائن
        label_result.setBounds(340, 40, 90, 30);                // frame في الـ label هنا قمنا بتحديد حجم و موقع الكائن
        text_field_1.setBounds(40, 40, 80, 30);                 // frame في الـ textField هنا قمنا بتحديد حجم و موقع الكائن
        text_field_2.setBounds(160, 40, 80, 30);                // frame في الـ textField هنا قمنا بتحديد حجم و موقع الكائن
        button.setBounds(270,40, 50, 30);                       // frame في الـ button هنا قمنا بتحديد حجم و موقع الكائن
 
        frame.add(label_plus);                                  // frame في الـ label_plus هنا أضفنا الكائن
        frame.add(label_result);                                // frame في الـ label_result هنا أضفنا الكائن
        frame.add(text_field_1);                                // frame في الـ text_field_1 هنا أضفنا الكائن
        frame.add(text_field_2);                                // frame في الـ text_field_2 هنا أضفنا الكائن
        frame.add(button);                                      // frame في الـ button هنا أضفنا الكائن
 
        frame.setSize(500, 140);                                // هنا قمنا بتحديد حجم النافذة. عرضها 500 و طولها 140
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(null);                                  // لذلك قمنا بتحديد مكان كل شيء قمنا بإضافته في النافذة Layout Manager أي لم نستخدم أي null هنا وضعنا
        frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
 
        // button هنا نضع الأوامر التي نريد تنفيذها عند النقر على الزر
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // num_2 و num_1 و تخزينهم في المتغيرات text_field_2 و الـ text_field_1 أولاً سيتم جلب الأرقام التي سيدخلها المستخدم في الـ
                    double num_1 = Double.valueOf(text_field_1.getText());
                    double num_2 = Double.valueOf(text_field_2.getText());
 
                    // label_result في حال قام المستخدم بإدخال أرقام, سيتم جمعهم ثم سيوضع الناتج كنص مكان المتغير
                    label_result.setForeground(Color.black);
                    label_result.setText("" + (num_1+num_2));
                }
                catch(Exception ex)
                {
                    // label_result في حال لم يقم المستخدم بإدخال أرقام, سيتم عرض النص التالي و تلوينه بالأحمر
                    label_result.setForeground(Color.red);
                    label_result.setText("خطأ في الإدخال !");
                }
            }
        });
 
    }

    
    
    
    
    
	

}
