
public class Guest {
	private int id;
	private String name;
	private String nationality;
	private int age;
	public Guest(int id, String name, String nationality, int age) {
	this.id = id;
	this.name = name;
	this.nationality = nationality;
	this.age = age;
	}
	public int getId() {
	return id;
	}
	public String getName() {
	return name;
	}
	public String getNationality() {
	return nationality;
	}
	public int getAge() {
	return age;
	}
	public void displayGuestInfo(){
	System.out.println("========================================================================================================================================");
	System.out.println("Guest id: " + id);
	System.out.println("Guest name: " + name);
	System.out.println("Guest nationality: " + nationality);
	System.out.println("Guest age: " + age);
	System.out.println("========================================================================================================================================");
	System.out.println();
	}
}
