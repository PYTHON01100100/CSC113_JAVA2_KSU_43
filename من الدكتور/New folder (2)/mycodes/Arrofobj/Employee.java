public class Employee {
	private String name;
	private int age;
	private char gender;
	
	public Employee(String name, int age, char gender)
	{
		this.name = name; 
		this.age = age; 
		this.gender = gender; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void display()
	{
		System.out.println("The name is : " + name );
		System.out.println("The age is : " + age );
		System.out.println("The gender is : " +gender );
		System.out.println("=====================================================================");
	}
	
	public String toString()
	{
		return ( "The name is : " + name + "\nThe age is : " + age + "\nThe gender is : " +gender +"\n ===============================================================================");
}
	
	
	

}
