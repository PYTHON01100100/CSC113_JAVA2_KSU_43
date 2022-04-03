
public class Hotel extends Booking{
	private String hotelName;
	private int nbOfNights;
	public Hotel(int ID,int year, String hotelName,int nbOfNights) {
		super(ID,year);
		this.hotelName=hotelName;
		this.nbOfNights=nbOfNights;
	}
	public int getNbOfNights() {
		return nbOfNights;
	}
	public double calculateCost(int year) {
		if(year<=2010)
			return 2000;
			return 1.1*calculateCost(year-1);
		
	}
	public double calculateCost2(int year) {
		double result=2000;
		for(int y=2011;y<=year;y++)
			result+=1.1*result;
		
		return result;
	}
	public void display() {
		super.display();
		System.out.println("Hotel name: " + hotelName);
		System.out.println("# of nights: " + nbOfNights);
	}
}
