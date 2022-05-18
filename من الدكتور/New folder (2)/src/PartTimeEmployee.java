
public class PartTimeEmployee extends Employee{
	
	private int nbh;
	private double rate;
	
	public PartTimeEmployee()
	{
		super(); 
		nbh =0;
		rate = 0.0;
	}

	public PartTimeEmployee(String nn, int aa, char gg, int nh, double rr)
	{
		super(nn, aa, gg); 
		nbh = nh;
		rate = rr;
	}

	public int getNbh() {
		return nbh;
	}

	public void setNbh(int nbh) {
		this.nbh = nbh;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void display()
	{
		super.display();
		System.out.println("The nb of hours is: " + nbh);
		System.out.println("The rate is: " + rate);
	}
	
	public String  toString()
	{
		return (super.toString()  + "\nThe nb of hours is: " + nbh +"\nThe rate is: " + rate);
	}
	
	public double computeSalary()
	{
		return nbh * rate;
	}
}
