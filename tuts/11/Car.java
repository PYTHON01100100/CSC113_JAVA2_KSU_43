public class Car extends Vehicle{
private double dailyRate;
private int milage;
public Car(int id, double dailyRate, int milage) {
super(id);
this.dailyRate = dailyRate;
this.milage = milage;
}
public double getDailyRate() {
return dailyRate;
}
public int getMilage() {
return milage;
}
public double computeRentalAmount(){
int nbDays = nbHours/24;
if(nbHours%24 > 0) nbDays++;
if(rented) rentalAmount = nbDays * dailyRate;
return rentalAmount;
}
}