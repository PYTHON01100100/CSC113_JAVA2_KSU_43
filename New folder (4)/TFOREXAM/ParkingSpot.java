
public class ParkingSpot {
	private int spotNumber;
	private int numOfSoFar;
	private  static  int spotCount;
	Car car;
	public ParkingSpot() {
		spotCount++;
		spotNumber=spotCount;
		numOfSoFar=0;
		car=null;
	}
	public int getSpotNumber() {
		return spotNumber;
	}
	public Car getCar() {
		return car;
	}
	
	
	public boolean isAvilable() {
		return car==null;
	}
	
	public boolean occupy(String Lpalte) {
	if( isAvilable()) {
		car=new Car(Lpalte);
		numOfSoFar++;
		return true;
	}
	return false;
	}
	
	public void vacate(){
		car=null;
	}
	
	public void display() {
		System.out.println("Spot number: "+spotNumber);
		if(! isAvilable()) {
			System.out.println("	Car license plate: "+getCar().getLicensePlate());
			}
	}
	
	
	
	
	
	
	
	
	
	
	
}
