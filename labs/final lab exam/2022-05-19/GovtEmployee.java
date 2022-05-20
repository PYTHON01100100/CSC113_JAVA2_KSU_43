
public class GovtEmployee extends Employee  {
	private double dailyrate;
	private int nDays;
	public GovtEmployee(int iD, String name, int nbHours, double dailyrate, int nDays) {
		super(iD, name, nbHours);
		this.dailyrate = dailyrate;
		this.nDays = nDays;
	}
	public double computeSalary()throws ArithmeticException{
		double salary =dailyrate *nDays;
		if(salary>20000)
			throw new ArithmeticException("Wrong Salary");
		
		return salary;
		

		
		
	}
	public void display(){
		super.display();
		System.out.println("daily rate:"+dailyrate);
		
		System.out.println("No. Days:"+nDays);

		}
}
