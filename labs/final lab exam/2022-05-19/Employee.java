import java.io.Serializable;
public abstract class Employee implements Serializable{
	private int ID;
	protected String name;
	protected int nbHours;
	
	public Employee(int iD, String name, int nbHours) {
		ID = iD;
		this.name = name;
		this.nbHours = nbHours;
	}
	public void display(){
		System.out.println("ID: "+ID);
		System.out.println("Name: "+name);
		System.out.println("No. Hours: "+nbHours);

	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbHours() {
		return nbHours;
	}
	public void setNbHours(int nbHours) {
		this.nbHours = nbHours;
	}
	public abstract double  computeSalary();
	
}
