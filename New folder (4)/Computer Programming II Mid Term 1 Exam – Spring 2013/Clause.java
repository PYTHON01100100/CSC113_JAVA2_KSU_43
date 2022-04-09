
public class Clause {
	private String name; 
	private double revenue;
	public Clause(String name, double revenue) {

		this.name = name;
		this.revenue = revenue;
	}
	public Clause(Clause p) {
		this.name = p.name;
		this.revenue = p.revenue;
	}
	public double getRevenue() {
		return revenue;
	}
	
	
	
}
