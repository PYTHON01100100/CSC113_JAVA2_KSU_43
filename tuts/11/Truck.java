public class Truck extends Vehicle{
private int hourlyRate;
public Truck(int id, int hourlyRate) {
super(id);
this.hourlyRate = hourlyRate;
}
public int getHourlyRate() {
return hourlyRate;
}
public double computeRentalAmount(){
rentalAmount = hourlyRate * nbHours;
return rentalAmount;
}
}