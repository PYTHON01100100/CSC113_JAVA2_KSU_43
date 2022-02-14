 public class ksuCars {
	private Car ArrCars[];
	private int nbc;

	public ksuCars(int size) {
		ArrCars = new Car[size];
	}

	public void display() {
		//Displays all the attributes of an object KsuCars.
		System.out.println("THE CARS IN KSU : ");
		for (int i = 0; i < nbc; i++) {
			 ArrCars[i].display();
		}
		System.out.println("NUMBER OF CARS IN KSU: " + nbc);
		
	}

	public boolean isEmpty() {
		if (nbc == 0)
			return true;
		else
			return false;
	}

	public int searchCar(String ce) {
		//This method receives a String representing the name of a Car object and returns the array index of the car object
		if (isEmpty() == false) {
			for (int i = 0; i < nbc; i++) {
				//if we found the name
				if (ArrCars[i].getName().equalsIgnoreCase(ce))
					return i;
			}
		}
		return -1;
	}
	public Car getCar(String nm) {
		//This method receives a String representing the Id of a Car object and returns the Car object if it’s exist.
		Car temp = null;
		for (int i = 0; i < nbc; i++) {
			//if we found the id
			if (ArrCars[i].getId().equalsIgnoreCase(nm)) {
				temp = ArrCars[i];
			}
		}
		return temp;
	}
	
	
	public boolean remove(String s) {
		//Removes a Car according to its name. It will return a value true if the operation has been completed successfully, or false if not.
		int index=searchCar(s);
		if(index==-1) {
			return false;
		}
		else {
			ArrCars[index]=ArrCars[nbc-1];
			ArrCars[nbc-1]=null;
			nbc--;
			return true;		
		}
	}
	public double AveragePrice(int y) {
		//Calculates the average price of all cars in an object of class KsuCars that were produced after the year y.
		double sum=0;
		if(isEmpty()==true) {
			return 0;
		}
		else {
		for(int i=0;i<nbc;i++) {
			sum=sum+ArrCars[i].PriceCar();
		}
		return sum/nbc;
	}
	}
 }