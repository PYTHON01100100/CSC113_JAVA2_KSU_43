
public class Company {

	private String name; 
	
	private Employee [] ArrEmp; 
	private int nbe; 
	
	public Company(String nn, int size)
	{
		name = nn;
		ArrEmp = new Employee[size];
		nbe = 0;
		
	}
	
	public double  averageAgeFullTime()
	{
	     int count = 0;
	     double sum =0;
		for(int i =0; i< nbe; i++)
		{
			if(ArrEmp[i] instanceof FullTimeEmployee)
			{
				count++;
				sum+= ArrEmp[i].getAge();
			}
		}
		if(count !=0)
		return sum/count;
		else return 0;
	}
	
	public int countParTime()
	{
	int count = 0;
		for(int i =0; i< nbe; i++)
		{
			if(ArrEmp[i] instanceof PartTimeEmployee)
				count++;
		}
		return count;
	}
	
	public boolean addEmployee(Employee EE)
	{
		if(nbe < ArrEmp.length)
		{
			ArrEmp[nbe++] = EE;
			return true;
		}
		else
			return false; 
	}
	
	public void display()
	{
		System.out.println("The name of the company is : " + name);
		
		for(int i =0; i< nbe; i++)
		{
			ArrEmp[i].display();
		}
	}
}
