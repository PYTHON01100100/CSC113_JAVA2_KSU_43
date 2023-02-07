import javafx.application.Application;
import javafx.stage.Stage;
 
public class test extends Application {
 
    // هذه أول دالة سيتم إستدعاءها عند تشغيل البرنامج
    // init() و التي ستقوم بدورها باستدعاء الدالة launch() بداخل هذه الدالة قمنا باستدعاء الدالة
    public static void main(String[] args) {
        System.out.println("main() method is called");
        launch();
    }
 
    @Override
    public void init() {
        System.out.println("init() method is called");
    }
 
    // init() سيتم استدعاء هذه الدالة بشكل تلقائي في حال تم استدعاء الدالة
    @Override
    public void start(Stage primaryStage) {
        System.out.println("start() method is called");
        primaryStage.show();
    }
 
    // سيتم استدعاء هذه الدالة عند الخروج من التطبيق
    @Override
    public void stop() {
        System.out.println("stop() method is called");
    }
 
}