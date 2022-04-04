
public class Faculty extends  Researcher{
	private String position;
	private int nbYearsOfExperience;
	public Faculty(String nn,String pos,int nb) {
		super(nn);
		position=pos;
		nbYearsOfExperience=nb;
	}
	public double getSalary() {
		return  calculateSalary(nbYearsOfExperience);
		}
	
	public double calculateSalary(int nby) {
		if(nby==0)
			return 5600;
		else if(nby<=10) 
			return (1.05*calculateSalary(nby-1));
		else
			return calculateSalary(nby-1);
	}
	public void display() {
		super.display();
		System.out.println(position + "---" + nbYearsOfExperience );}
	
}
