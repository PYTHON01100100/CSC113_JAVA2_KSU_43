
public class Product {

	private String name ;
	private double price;
	
	public Product(String nn, double pp)
	{
		name = nn;
		price = pp;
	}
	
	public Product(Product Pr)
	{
		this.name = Pr.name;
		this.price = Pr.price;
	}
	
	public void display()
	{
		System.out.println("The name of the product is : " + name);
		System.out.println("The price of the product is : " + price);
	}
	
}
