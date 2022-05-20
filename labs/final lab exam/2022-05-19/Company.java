import java.io.*;
public class Company {
	private String name;
	private Employee[] arremp;
	private int nbe;
	public Company(String name,int s) {
		this.name = name;
		arremp = new Employee[s];
		nbe=0;
	}
	public boolean addEmployee(Employee e){
		if(arremp.length==nbe)
			return false;
		arremp[nbe++]=e;
		return true;
	}
	public double avgGovtEmpSalary(){
		int c=0;
		double s=0;
		for(int i=0;i<nbe;i++){
			if(arremp[i] instanceof GovtEmployee){
			try{
				{
					s=((GovtEmployee)arremp[i]).computeSalary();
					c++;
				}
				
			}catch(ArithmeticException e){System.out.println(e.getMessage());}
			}
		}
		if(c!=0)
		return s/c;
		else
			return s;
	}
	public PrivateEmployee[] getPrivateEmployees(double r) throws IOException{
		int b=0;
		int size=0;
		for(int i=0;i<nbe;i++){
			if(arremp[i] instanceof PrivateEmployee&&((PrivateEmployee)arremp[i]). getHourlyRate()>r)
				size++;
}
		
		PrivateEmployee[] pe=new PrivateEmployee[size];
for(int i=0;i<nbe;i++){
				if(arremp[i] instanceof PrivateEmployee&&((PrivateEmployee)arremp[i]). getHourlyRate()>r){
					pe[b++]=(PrivateEmployee)arremp[i];
				}
}
File f = new File("emp.data");
FileOutputStream outStream = new FileOutputStream(f);
ObjectOutputStream outp = new ObjectOutputStream(outStream);
	
	for(int i = 0; i < size; i++){
		outp.writeObject(pe[i]);
		}
		outp.close();
		outStream.close();
return pe;
}
}
