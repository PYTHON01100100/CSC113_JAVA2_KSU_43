
public class ParkingLot {
	private ParkingSpot []ParkingLot;
	private int numAvailableSpot;
	public ParkingLot(int size){
		ParkingLot= new ParkingSpot[size];
		for(int i=0;i<ParkingLot.length;i++)
			ParkingLot[i]=new  ParkingSpot();
		
		numAvailableSpot=size;
	}
	public int getNumAvailableSpot() {
		return numAvailableSpot;
	}
	
	public boolean isEmpty() {
		return numAvailableSpot==ParkingLot.length;
	}
	public boolean isFull() {
		return numAvailableSpot==0;
	}
	
	public void display() {
		for(int i=0;i<ParkingLot.length;i++) {
			ParkingLot[i].display();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	public int searchCar(String Lplate) {
		for(int i=0;i<ParkingLot.length;i++) {
			if(ParkingLot[i].getCar().getLicensePlate().equalsIgnoreCase(Lplate)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	public boolean unParkCar(String Lplate) {
		int i=searchCar(Lplate);
		if(i==-1) {
			System.out.println("not fount");
			return false;
		}
		else {
			
		ParkingLot[i].vacate();
		
		numAvailableSpot++;
		return true;
		}
		}
	
	
	public ParkingSpot mostUsedSpot() {
		ParkingSpot max=ParkingLot[0];
		for(int i=1;i<ParkingLot.length;i++) {
			if(ParkingLot[i].getSpotNumber()>max.getSpotNumber()) {
				max=ParkingLot[i];}
		}
	
	return max;
}
	
	
	
	
	
	public boolean parkCar(String Lplate) {
		for(int i=1;i<ParkingLot.length;i++)
			if(ParkingLot[i].isAvilable()) {
				ParkingLot[i].occupy(Lplate);
				numAvailableSpot--;
				return true;
			}
		return false;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
