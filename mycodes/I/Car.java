public class Car {
	private String name;
	private String id;
	private int seatNb;
	private int year; 
	private CarElements arcel[];
	private int ncel;

	public Car(String n, String d, int s, int y, int size) {
		this.name = n;
		this.id = d;
		this.seatNb = s;
		this.ncel = 0;
		this.year = y;
		arcel = new CarElements[size];
	}

	public void display() {
		System.out.println(
				"NAME: " + name + ", ID: " + id + ", NUMBER OF SEATS: " + seatNb + ", PRODUCTION YEAR OF THE CAR: "+ year + ", NUMBER OF CAR ELEMENTS: " + ncel);
	}

	public boolean isFull() {
		if(ncel == arcel.length)
			return true;
		else 
			return false;
	}


	public boolean addElement(CarElements el) {
		if(isFull())
			return false;
			arcel[ncel++] = new CarElements(el);
		return true;
	}

	public double PriceCar() {
		int sum = 0;
		for(int i = 0; i < ncel; i++)
			sum += arcel[i].getPrice();
		return sum;

	}