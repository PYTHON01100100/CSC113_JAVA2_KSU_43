
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
	
	public int searchByName(String name)
	{
		for(int i = 0; i< nbe; i++)
		{
			if(ArrEmp[i].getName().equals(name))
				return i;
		}
		
		return -1;
	}
	
	public int searchEmployee(Employee EE)
	{
		for(int i = 0; i< nbe; i++)
		{
			if(ArrEmp[i].getName().equals(EE.getName()))
				if(ArrEmp[i].getAge() == EE.getAge())
					if(ArrEmp[i].getGender() == EE.getGender())
				return i;
		}
		
		return -1;
	}
	
	public boolean deleteEmployee(String name)
	{
		int pos = searchByName(name);
		if(pos !=-1)
		{
			ArrEmp[pos] = ArrEmp[nbe -1];
			ArrEmp[nbe -1] = null;
			nbe--;
			
			//ArrEmp[pos] = ArrEmp[--nbe];
			//ArrEmp[nbe] = null;
			return true;
		}
		else 
			return false;
	}
	
	public boolean deleteByShifting(Employee EE)
	{
		int pos = searchEmployee(EE);
		if(pos !=-1)
		{
			for(int i =pos; i< nbe -1; i++)
			{
				ArrEmp[i] = ArrEmp[i+1];
			}
			
			ArrEmp[nbe-1] = null;
			nbe--;
			return true;
		}
		else
			return false;
	
	}
	
	public Employee Oldest()
	{
		Employee old = ArrEmp[0];
		
		for(int i =1; i< nbe; i++)
		{
			if(ArrEmp[i].getAge() > old.getAge())
				old = ArrEmp[i];
		}
		
		return old;
	}
	
	public double AverageAge()
	{
		double sum = 0;
		
		for(int i =0; i< nbe; i++)
		{
			sum+= ArrEmp[i].getAge();
		}
		
		if(nbe !=0)
		return sum/nbe;
		else
			return 0.0;
	}
}

