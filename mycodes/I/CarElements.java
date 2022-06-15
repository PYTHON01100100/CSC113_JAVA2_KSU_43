public class CarElements {
	private String code;
	private double price;

	public CarElements(String c, double p) {
		this.code = c;
		this.price = p;
	}

	public CarElements(CarElements E) {
		this.code = E.code;
		this.price = E.price;
	}

	public void display() {
		System.out.println("The code is: " + code + "\nThe price is: " + price);

	}

	public double getPrice() {
		return price;
	}

}
