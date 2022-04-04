
public class Student extends Researcher {
	private double gpa;
	public Student(String nn,double g) {
		super(nn);
		gpa=g;
	
	}
	public double getGpa() {return gpa;}
	public double getSalary() {
		return 1000*gpa;
	}
	public void display() {
		super.display();
		System.out.println(gpa);
	}
	
}
