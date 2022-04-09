public class woman {
	private String name;
	private int age;
	private man husband;
	public woman(String name, int age) {
		//: constructor. Assigns given values to the attributes and assigns
		//null to husband
		this.name = name;
		this.age = age;
		husband=null;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setHusband(man husband) {
		//sets the husband of the woman.
		this.husband = husband;
	}
	public void display() {
		//this method displays all the attributes of the Woman along with the
		//name and age of Husband if woman is married. 
		System.out.println("==================");
		System.out.println("the woman name: "+name);
		System.out.println("the woman age: "+age);
		if(husband!=null) {
			System.out.println("hubamd name : "+ husband.getAge() );
			System.out.println("huband age:  "+husband.getName());
		}
		System.out.println("==================");
	}
	
}
