public abstract class Booking implements Reservable {
private int ID;
private int year;
public Booking(int ID,int year) {
	this.ID=ID;
	this.year=year;
}
public int getYear() {
	return year;
}
public double getCost() { 
return calculateCost(year);
}
public void display() {
	System.out.println("ID: " + ID);
	System.out.println("Year: " + year);
}
}
