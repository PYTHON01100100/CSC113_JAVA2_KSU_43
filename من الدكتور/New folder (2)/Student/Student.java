package revision;

public class Student {

	private String name;
	private int age;
	private int [] Marks;
	private int nbm;
	
	public Student(int size)
	{
		name = " ";
		age =0;
		Marks = new int[size];
		nbm = 0;
		
	}
	
	
	public boolean deleteMark(int pos)
	{
		if(nbm == 0)
			return false;
		else
		{
			Marks[pos] = Marks[nbm -1];
			Marks[nbm -1] = 0;
			nbm--;
			return true;
			// Marks[pos] = Marks[--nbm];
			//Marks[nbm ] = 0;
			
			
		}
	}
	public boolean addMark(int value)
	{
		if(nbm < Marks.length)
		{
			Marks[nbm] = value;
			nbm++;
			return true;
		}
		else
			return false;
	}
	
	public void display()
	{
		System.out.println("Your array is : ");
		
		for(int i = 0; i< nbm; i++)
			System.out.print(Marks[i] + " ");
		
		System.out.println("");
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
}
