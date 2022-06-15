 public class ksuCars {
	private Car ArrCars[];
	private int nbc;

	public ksuCars(int size) {
		ArrCars = new Car[size];
	}

	public void display() {
		for (int i = 0; i < nbc; i++) {
			System.out.println("THE CARS: ");
			 ArrCars[i].display();
		}
		System.out.println("NUMBER OF CARS: " + nbc);
		
	}

	public boolean isEmpty() {
		if (nbc == 0)
			return true;
		else
			return false;
	}

	public int searchCar(String ce) {

		if (isEmpty() == false) {
			for (int i = 0; i < nbc; i++)
				if (ArrCars[i].getName().equalsIgnoreCase(ce))
					return i;
		}
		return -1;

	}

	public Car getCar(String nm) {
		Car temp = null;
		for (int i = 0; i < nbc; i++)
			if (ArrCars[i].getId().equalsIgnoreCase(nm)) {
				temp = ArrCars[i];
			}
		return temp;
	}
 }












      