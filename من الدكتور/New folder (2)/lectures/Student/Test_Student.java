package revision;

public class Test_Student {

	public static void main(String[] args) {


		Student St = new Student(10);
		
		St.setName("Soltane");
		St.setAge(19);
		
		St.addMark(18);
		St.addMark(17);
		St.addMark(38);
		
		St.addMark(25);
		St.addMark(28);
		St.addMark(40);
		St.display();
		
		boolean res = St.deleteMark(2);
		
		if(res)
			System.out.println("Delete successful");
		else
			System.out.println("Delete failed");
		St.display();
	}

}
