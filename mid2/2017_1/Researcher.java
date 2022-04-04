public abstract class Researcher implements Employee {
	private String name;
	
	
	public Researcher(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println("name: "+name);
	}
}
