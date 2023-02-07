import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
 
public class test extends Application {
 
    @Override
    public void start(Stage stage) {
        // يمثل النص الذي نريد إضافته في النافذة Text هنا قمنا بإنشاء كائن من الكلاس
        Text text = new Text("CSC 380");
 
        // هنا قمنا بتحديد حجم خط النص
        text.setFont(new Font(84));
 
        // هنا قمنا بتحديد مكان ظهور النص في النافذة
        text.setX(60);
        text.setY(160);
 
        // في النافذة Root Node لأننا ننوي جعله الـ Group هنا قمنا بإنشاء كائن من الكلاس
        Group root = new Group();
 
        // root في الكائن text هنا قمنا بإضافة الكائن
        root.getChildren().add(text);
 
        // فيها و تحديد حجمها Node كأول root هنا قمنا بإنشاء محتوى النافذة مع تعيين الكائن
        Scene scene = new Scene(root, 600, 300);
 
        // هنا وضعنا عنوان للنافذة
        stage.setTitle("Sample Application");
 
        // أي وضعنا محتوى النافذة الذي قمنا بإنشائه للنافذة .stage في كائن الـ scene هنا وضعنا كائن الـ
        stage.setScene(scene);
 
        // هنا قمنا بإظهار النافذة
        stage.show();
    }
 
    // هنا قمنا بتشغيل التطبيق
    public static void main(String[] args) {
        launch(args);
    }
 
}