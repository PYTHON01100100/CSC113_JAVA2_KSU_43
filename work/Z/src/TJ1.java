import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class TJ1 {
	 
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("JTable demo");                 // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(500, 250);                                  // هنا قمنا بتحديد حجم النافذة. عرضها 500 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(null);                                    // في النافذة بنفسنا Table لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا
 
        String columns[] = {"ID", "First Name", "Last Name"};     // هنا قمنا بتعريف مصفوفة و التي سنستخدمها كأسماء للجدول
        String data[][] = {                                       // هنا قمنا بتعريف مصفوفة و التي سنستخدمها كبيانات في الجدول
            {"1", "Mhamad", "Harmush" },
            {"2", "Ahmad", "Mousally" },
            {"3", "Hala", "Hassan" },
            {"4", "Rim", "Al Mouhandes" },
            {"5", "Said", "Al Kurdy" },
            {"6", "Abdullah", "Saadi" },
            {"7", "Ibrahim", "Marhaba" },
            {"8", "Omar", "El Koussa" },
            {"9", "Riad", "Asaad" },
            {"10", "Rawan", "Hoblos" }
        };
 
        DefaultTableModel model = new DefaultTableModel();       // Model أي كأننا قمنا بتعريف .DefaultTableModel هنا قمنا بإنشاء كائن من الكلاس
        model.setDataVector(data, columns);                      // Model هنا قمنا بوضع المصفوفات بداخل الـ
        JTable table = new JTable(model);                        // model هنا قمنا بتعريف جدول مبني على البيانات الموجودة في الـ
        JScrollPane tableScroller= new JScrollPane(table);       // عند الحاجة Scroll Bar لضمان ظهور JScrollPane بداخل كائن من الكلاس table هنا وضعنا الـ
 
        tableScroller.setBounds(60, 40, 370, 140);               // frame في الـ tableScroller هنا قمنا بتحديد حجم و موقع الـ
 
        frame.add(tableScroller);                                // frame في الـ tableScroller هنا أضفنا الـ
 
        frame.setVisible(true);                                  // هنا جعلنا النافذة مرئية
 
    }
 

}
