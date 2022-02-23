public class woman {
	private String name;
	private int age;
	private man husband;
	public woman(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setHusband(man husband) {
		this.husband = husband;
	}
	public void display() {
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
