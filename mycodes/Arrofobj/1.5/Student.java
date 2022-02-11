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
	public int search(int value) {
		for(int i=0;i<nbm;i++) {
			if(Marks[i]==value)
				return i;
		}
		return -1;
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
		System.out.println("Your array  with pos is : ");
		
		for(int i = 0; i< nbm; i++) {
			System.out.print("||"+i + "||\t");
	}
		System.out.println("");
		for(int i = 0; i< nbm; i++)
		System.out.print("||"+Marks[i] + "||\t");
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
	public void sortMarks() {
		
		int t;
		for(int i=0;i<nbm;i++) {
			for(int j=i+1;j<nbm;j++) {
				if(Marks[j]<Marks[i]) {
					//swap two objs
					t=Marks[i];
					Marks[i]=Marks[j];
					Marks[j]=t;
				}
			}
		}
	}
	public void deleteByShifting(int pos) {
		int no = search(pos);
		if(no==-1)
		{
		}
		else if(nbm != Marks.length) {
			for(int i =no; i< nbm-1; i++){
				Marks[i] = Marks[i+1];
			}
			// do not write
			// Marks[nbm-1] = null;
			//Type mismatch: cannot convert from null to int
			Marks[nbm-1] = 0;
			nbm--;
		}
	}
	
	public int MaximumMark() {
		int max=Marks[0];
		for(int i=1;i<nbm;i++) {
			if(Marks[i]>max) {
				max=Marks[i];
			}
		}
	
		return max;
	}
	public int MinimumMark() {
		int min=Marks[0];
		for(int i=1;i<nbm;i++) {
			if(Marks[i]<min) {
				min=Marks[i];
			}
		}
	
		return min;
	}
	
	
	public double AvrageMarks() {
		double avg=0;
		int l=nbm;
		for(int i=0;i<nbm;i++) {
			avg+=Marks[i];
		}
		
		
		return avg/l;
	}
	
	public int countFequency() {
		int c=0;
		for(int i=0;i<nbm;i++) {
			if(Marks[i]==0)
				c+=1;
		}
		
		
		return c;
		
		
	}
	
	
}