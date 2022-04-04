
public class DineIn extends Meal {
	private int tableNo;
	public DineIn(String name, int size, int tn)
	{
		super(name,size);
		tableNo=tn;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void displayOrderDetails() {
		super.displayOrderDetails();
		System.out.println("table no:"+tableNo);
	}
	public double getPrice() {
		return 1.05*this.totalDishPrice();
	}
}
