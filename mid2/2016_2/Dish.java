
public class Dish {
	private String name;
	private double price;
	public Dish(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
	public double getPrice() throws Exception {
		if(price<0||price>100)
			throw new Exception("wrong type");
		return price;
	}
	public void display() {
		System.out.println("name: "+name);
		System.out.println("price: "+price);
	}
}
