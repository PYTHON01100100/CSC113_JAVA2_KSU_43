import java.io.*;
public class Branch {
private String name;
private Vehicle vehicles[];
private int nbV;
public Branch(String name, int size) throws Exception{
if(size <= 0) throw new Exception("Invalid Size");
this.name = name;
vehicles = new Vehicle[size];
nbV = 0;
}
public boolean addVehicle(Vehicle v){
if(nbV >= vehicles.length) return false;
vehicles[nbV++] = v;
return true;
}
public double sumRentedCars(int mil){
int sum = 0;
for(int i = 0; i < nbV; i++)
if(vehicles[i] instanceof Car && ((Car)vehicles[i]).getMilage() < mil)
sum += vehicles[i].computeRentalAmount();
return sum;
}
public void saveToFile(int nbH, double dailyR) throws IOException{
File f = new File("Cars.data");
FileOutputStream outStream = new FileOutputStream(f);
ObjectOutputStream outCars = new ObjectOutputStream(outStream);
File f2 = new File("Trucks.data");
FileOutputStream outStream2 = new FileOutputStream(f2);
ObjectOutputStream outTrucks = new ObjectOutputStream(outStream2);
for(int i = 0; i < nbV; i++){
if(vehicles[i] instanceof Car && ((Car)vehicles[i]).getDailyRate() == dailyR)
outCars.writeObject(vehicles[i]);
else if(vehicles[i] instanceof Truck && vehicles[i].getNbHours() > nbH)
outTrucks.writeObject(vehicles[i]);
}
outCars.close();
outTrucks.close();
outStream.close();
outStream2.close();
}
}