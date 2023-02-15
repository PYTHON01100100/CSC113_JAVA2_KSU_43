import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
// https://harmash.com/tutorials/swing/jtable/example-2
public class TJ2 {
	 // هنا قمنا بإنشاء النافذة و جميع الأشياء التي سنضعها فيها
    static JFrame frame = new JFrame("JTable demo");
    static JLabel label_1 = new JLabel("ID");
    static JLabel label_2 = new JLabel("Name");
    static JLabel label_3 = new JLabel("Phone");
    static JTextField textField_1 = new JTextField();
    static JTextField textField_2 = new JTextField();
    static JTextField textField_3 = new JTextField();
    static JButton btn_add = new JButton("Add");
    static JButton btn_clear = new JButton("Clear");
    static JButton btn_delete = new JButton("Delete Selected");
    static JButton btn_deleteAll = new JButton("Delete All");
    static DefaultTableModel model = new DefaultTableModel();
    static JTable table = new JTable( model );
    static JScrollPane tableScroller = new JScrollPane( table );
 
 
    public static void main(String[] args) {
 
        // هنا قمنا بوضع أسماء الأعمدة التي ستظهر في الجدول
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Phone");
 
        // frame هنا قمنا بتحديد أماكن الأشياء التي سنضيفها في الـ
        label_1.setBounds(40, 50, 50, 20);
        label_2.setBounds(40, 90, 50, 20);
        label_3.setBounds(40, 130, 50, 20);
        textField_1.setBounds(100, 50, 120, 20);
        textField_2.setBounds(100, 90, 120, 20);
        textField_3.setBounds(100, 130, 120, 20);
        btn_add.setBounds(150, 180, 70, 30);
        btn_clear.setBounds(70, 180, 70, 30);
        btn_delete.setBounds(315, 250, 140, 30);
        btn_deleteAll.setBounds(470, 250, 140, 30);
        tableScroller.setBounds(280, 50, 370, 160);
 
        // frame هنا قمنا بإضافة جميع الأشياء التي قمنا بتعريفها سابقاً في الـ
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(textField_1);
        frame.add(textField_2);
        frame.add(textField_3);
        frame.add(btn_add);
        frame.add(btn_clear);
        frame.add(btn_delete);
        frame.add(btn_deleteAll);
        frame.add(tableScroller);
 
        // frame هنا قمنا بتحديد خصائص الـ
        frame.setSize(710, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
 
 
        // btn_add هنا نضع الأوامر التي نريد تنفيذها عند النقر على الـ
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // إذا قام المستخدم بإدخال بيانات في مربعات النصوص الثلاثة
                if( !textField_1.getText().equals("") && !textField_2.getText().equals("") && !textField_3.getText().equals("") )
                {
                    // عندها سيتم تخزينهم في متغيرات بشكل مؤقت
                    String id = textField_1.getText();
                    String name = textField_2.getText();
                    String phone = textField_3.getText();
 
                    // الخاصة بالجدول model بعدها سيتم تخزينهم في مصفوفة واحدة, ثم إضافتها في الـ
                    String[] userInfo = { id, name, phone };
                    model.addRow( userInfo );
                }
            }
        });
 
 
        // btn_clear هنا نضع الأوامر التي نريد تنفيذها عند النقر على الـ
        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // سيتم مسح النصوص المدخلة في مربعات النصوص الثلاثة
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
            }
        });
 
 
        // btn_delete هنا نضع الأوامر التي نريد تنفيذها عند النقر على الـ
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // إذا كان المستخدم قد قام بتحديد سطر واحد على الأقل من الجدول
                if( table.getSelectedRowCount() > 0 )
                {
                    // الخاص فيه index كل سطر قام المستخدم بتحديده من الجدول بعدها سيتم حذف كل سطر من خلال رقم الـ index سيتم تخزين رقم
                    int[] selectedIndices = table.getSelectedRows();
                    for( int i=selectedIndices.length-1; i>=0; i-- )
                    {
                        model.removeRow( selectedIndices[i] );
                    }
                }
            }
        });
 
 
        // btn_deleteAll هنا نضع الأوامر التي نريد تنفيذها عند النقر على الـ
        btn_deleteAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // يساوي 0. أي سيتم مسح جميع العناصر الموجودة فيها model هنا سيتم جعل عدد أسطر الـ
                model.setRowCount(0);
            }
        });
 
 
    }
}
