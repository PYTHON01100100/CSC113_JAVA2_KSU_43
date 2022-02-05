
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
	
	public boolean AddEmployee(Employee EE1)
	{
		if(nbe < ArrEmp.length )
		{
			ArrEmp[nbe++] = EE1;
			return true;
		}
		else
			return false;
	}
	
	public void display() {
		
		System.out.println("The name of the company is: " + name);
		
		for(int i = 0; i< nbe; i++)
			ArrEmp[i].display();
	}
}
