import java.io.Serializable;
public abstract class Vehicle implements Serializable{
private int id;
protected boolean rented;
protected int nbHours;
protected double rentalAmount;
public Vehicle(int id){
this.id = id;
}
public abstract double computeRentalAmount();
public void display(){
System.out.println("Vehicle ID: " + id);
System.out.println("Is rented?: " + rented);
System.out.println("Number of hours: " + nbHours);
System.out.println("Rental Amount: " + rentalAmount);
}
public int getNbHours() {
return nbHours;
}
}