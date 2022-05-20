
public class PrivateEmployee extends Employee {
	private double hourlyRate;

	public PrivateEmployee(int iD, String name, int nbHours, double hourlyRate) {
		super(iD, name, nbHours);
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public double computeSalary()throws ArithmeticException{
		double salary =hourlyRate *nbHours;
		if(salary<3000)
			throw new ArithmeticException("Wrong Salary");
		
		return salary;
		
		
		
	}
	public void display(){
		super.display();
		System.out.println("hourly Rate:"+hourlyRate);
		}
}
