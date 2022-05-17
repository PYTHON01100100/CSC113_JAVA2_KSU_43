import java.io.IOException;
public class test {
public static void main(String[] args) {
// TODO Auto-generated method stub
try{
Branch b = new Branch("Test", 4);
b.addVehicle(new Car(1111, 30.0, 50000));
b.addVehicle(new Car(2222, 30.0, 30000));
b.addVehicle(new Truck(3333, 50));
b.addVehicle(new Truck(4444, 100));
try {
b.saveToFile(5, 30.0);
} catch (IOException e) {
System.out.println(e);
}
} catch(Exception e){
System.out.println(e);
}
System.out.println("Bye!");
}
}