
public abstract class Meal implements Order {
	
	private Dish arrDish[];
	private String name;
	private int nbd;
	public Meal(String name, int size) {
		this.name=name;
		nbd=0;
		arrDish=new Dish[size];
	}
	//just for testing
	public boolean add(Dish d) {
		if(nbd==arrDish.length)
			return false;
		arrDish[nbd++]=d;
		return true;
	}
	public double totalDishPrice() {
		double sum=0;
		try {
			for(int i=0;i<nbd;i++)
				sum+=arrDish[i].getPrice();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return sum;
	}
	public void displayOrderDetails() {
		System.out.println("name: "+name);
		
	}
}
