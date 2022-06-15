public class Car {
	private String name;
	private String id;
	private int seatNb;
	private int year; 
	private CarElements arcel[];
	private int ncel;



	public Car(String name, String id, int seatNb, int year, int size) {
		this.name = name;
		this.id = id;
		this.seatNb = seatNb;
		this.ncel = 0;
		this.year = year;
		arcel = new CarElements[size];
	}

	public void display() {
		System.out.println("========================================");
		//Displays all the attributes of an object Car.
		System.out.println("NAME: " + name );
		System.out.println("ID: " + id);
		System.out.println(" NUMBER OF SEATS: "+ seatNb );
		System.out.println( "PRODUCTION YEAR OF THE CAR:  "+ year);
		System.out.println(" NUMBER OF CAR ELEMENTS: " + ncel);
		System.out.println("========================================");
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}

	public boolean isFull() {
		//Returns true of the array is Full otherwise returns false.
		if(ncel == arcel.length)
			return true;
		else 
			return false;
	}


	public boolean addElement(CarElements el) {
		//This method receives a CarElements object and adds it to the Car object.
		
		if(isFull()) //I used isFull() to check if arcel[] is full
			return false;
			arcel[ncel++] = new CarElements(el);
		return true;
	}

	public double PriceCar() {
		//Returns the sum of the CarElements price in an object of the class Car.
		int sum = 0;
		for(int i = 0; i < ncel; i++)
			sum += arcel[i].getPrice();
		return sum;

	}
}