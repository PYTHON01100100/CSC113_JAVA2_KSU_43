
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
	public int search(String name) 
	{
		for(int i = 0; i< nbe; i++) {
			if(ArrEmp[i].getName().equalsIgnoreCase(name))
			return i;
	}
	return -1;
	}
	
	public int searchEmp(Employee EE) 
	{
		for(int i = 0; i< nbe; i++) {
			if(ArrEmp[i].getName().equalsIgnoreCase(EE.getName())&&ArrEmp[i].getAge()==EE.getAge()&&ArrEmp[i].getGender()==EE.getGender())
			return i;
	}
	return -1;
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
	public boolean deleteEmpbyname(String name)
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
	public boolean AddEmployee(Employee EE1)
	{
		if(nbe < ArrEmp.length )
		{
			ArrEmp[nbe++] = EE1;
			return true;
			/*
			ArrEmp[nbe] = EE1;
			nbe++;
			return true; 
			 */
		}
		else
			return false;
	}
	public boolean deleteEmployee(Employee EE)
	{
		int pos=searchEmp(EE);
		if(pos!=-1)
		{
			ArrEmp[pos]=ArrEmp[nbe-1];
			ArrEmp[nbe-1]=null;
			nbe--;
			return true;
		}
		else
			return false;
	}
	
	public Employee oldest() {
		Employee oldest= ArrEmp[0];
		for(int i = 0; i< nbe; i++) {
			if(ArrEmp[i].getAge()>oldest.getAge()) {
				oldest=ArrEmp[i];
			}
		}
		return oldest;
	}
	public Employee youngest() {
		Employee youngest= ArrEmp[0];
		for(int i = 0; i< nbe; i++) {
			if(ArrEmp[i].getAge()<youngest.getAge()) {
				youngest=ArrEmp[i];
			}
		}
		return youngest;
	}
	
	public double AvreageAge() {
		double sum=0;
		int no=nbe;
		for(int i = 0; i< nbe; i++) {
			sum=sum+ArrEmp[i].getAge();
	}
		
		return sum/no;
	}
	public boolean deleteByShifting(Employee EE)
	{
		int pos = searchEmp(EE);
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
	
	public void sortEmpb() 
	{
		Employee t;
		for(int i=0;i<nbe;i++) {
			for(int j=i+1;j<nbe;j++) {
				if(ArrEmp[j].getAge()<ArrEmp[i].getAge()) {
					//swap two objs
					t=ArrEmp[i];
					ArrEmp[i]=ArrEmp[j];
					ArrEmp[j]=t;
				}
			}
		}
		
	}
	
	
	public void display() {
		
		System.out.println("The name of the company is: " + name);
		
		for(int i = 0; i< nbe; i++)
			ArrEmp[i].display();
	}
}
