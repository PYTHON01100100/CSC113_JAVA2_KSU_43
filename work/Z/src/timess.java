import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;
import java.text.SimpleDateFormat;
public class timess implements Runnable{
    static JLabel timeLabel = new JLabel();
    
    @Override
    public void run() {
 
        while(!Thread.currentThread().isInterrupted())          // ( شغال Thread أي طالما أن الـ ) true لا ترجع isInterrupted() طالما أن الدالة
        {
 
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
 
            timeLabel.setText(sdf.format(date));                // كل ثانية timeLabel سيتم وضع الوقت الحالي كنص للكائن
 
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                timeLabel.setText(e.getMessage());              // timeLabel في حال حدث أي خطأ سيتم وضعه كنص للكائن
                timeLabel.setForeground(Color.red);             // و سيتم تلوينه باللون الأحمر
            }
        }
    }
        public static void main(String[] args) {
        	 
            JFrame frame = new JFrame("Display Time");              // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
            frame.setSize(350, 70);                                 // هنا قمنا بتحديد حجم النافذة. عرضها 350 و طولها 70
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
            frame.setLayout(new FlowLayout());                      // حتى نجعل الأشياء التي نضيفها في النافذة تترب وراء بعضها و في وسط النافذة FlowLayout إستخدمنا الـ
     
            Font newFont = new Font("Arial", Font.BOLD, 20);        // حجمه 20 Arial يمثل نوع خط عريض إسمه Font هنا أنشأنا كائن من الكلاس
     
            timeLabel.setFont(newFont);                             // newFont يستخدم الـ TimeLabel هنا جعلنا الـ
            timeLabel.setForeground(Color.blue);                    // إلى اللون الأزرق TimeLabel هنا قمنا بتغيير لون الـ
     
            frame.add(timeLabel);                                   // frame في الـ TimeLabel هنا أضفنا الـ
     
            frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
     
            Thread t = new Thread(new timess());                      // Runnable نفسه لأنه يطبق الإنترفيس Main() مبني على كائن من الكلاس Thread هنا قمنا بإنشاء كائن من الكلاس
     
            t.start();                                              // و التي بدورها ستعرض لنا الوقت كل ثانية run() أي سيتم إستدعاء الدالة thread هنا قمنا بتشغيل كائن الـ
     
        }


	

}
