
public class HomeDelivery extends Meal {
	private String addres;
	private int distance;
	public HomeDelivery(String nn,int size,String address,int dis) {
		super(nn,size);
		this.addres=address;
		this.distance=dis;
	}
	public int getDistance() {
		return distance;
	}
	public double getPrice() {  
		double p;
		p = totalDishPrice() + calculateDeliveryFees(distance); 
		return p; 
		}
	public double calculateDeliveryFees2(int d) {
		if(d<=10)
			return 5;
		return 1.05*calculateDeliveryFees2( d-1);
		
	}
public double calculateDeliveryFees(int d) {
	double sum=5;
	for(int i=11;i<=d;d++)
		sum=1.05*sum;
	
	return sum;
		
	}
}
