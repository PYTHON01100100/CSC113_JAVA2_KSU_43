
public class FullTimeEmployee extends Employee{
	
	private double weeklySalary;
	
	public FullTimeEmployee()
	{
		super();
		weeklySalary =0;
	}


	public FullTimeEmployee(String nn, int aa , char gg, double ws)
	{
		super(nn, aa, gg);
		weeklySalary = ws;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public void display()
	{
		super.display();
		System.out.println("The weekly salary is : " + weeklySalary );
	}
	
	public String toString()
	{
		return ( super.toString() + "\nThe weekly Salary is: " + weeklySalary);
	}
	
	public double computeSalary()
	{
		return weeklySalary * 4;
	}


}
