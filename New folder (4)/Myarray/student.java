import java.util.Locale;
import java.util.Scanner;

public class student {

	private int id;
	private double gpa;
	private String name;
	//public final int g;
	Scanner input=new Scanner(System.in).useLocale(Locale.US);
	public student() {
		this("NA",0,0.0);
	}
	public String toString() {
		return name+" , "+id+" , "+gpa;
	}
	
	
	public student( String name,int id, double gpa) {
		this.id = id;
		this.gpa = gpa;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void Read() {
		System.out.println("Enter Name:");
		name=input.next();
		System.out.println("Enter ID:");
		id=input.nextInt();
		System.out.println("Enter GPA:");
		gpa=input.nextDouble();
		if(gpa<0||gpa>5) {
		gpa=0;		
		}
		input.close();
		}

	public void print() {			
		System.out.println("=============================#THE STUDENT INFORMATION#============================================");		
		System.out.println("|name: "+name+"| |ID: "+id+"| |GPA: "+gpa+"|");
		System.out.println("====================================================================================================");

	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}