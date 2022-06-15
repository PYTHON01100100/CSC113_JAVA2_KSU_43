public class CarElements {
	private String name;
	private double price;

	public CarElements(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public CarElements(CarElements E) 
	{
		// it is a copy constructor i use it with composition
		this.name = E.name;
		this.price = E.price;
	}

	public void display() {
		//displays the name and the price.
		System.out.println("========================================");
		System.out.println("The element name  is: " + name );
				System.out.println("The elemnt price is: " + price);
				System.out.println("========================================");
	}

	public double getPrice() {
		return price;
	}

}
