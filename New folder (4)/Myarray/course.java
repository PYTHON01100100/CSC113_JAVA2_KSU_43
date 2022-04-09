
public class course {
	private String name;
	private int hrs;
	private student st[];
	private int nbs;
	public course() {
		name = "NA";
		hrs = 2;
		st = new student[25];
		nbs = 0;
	}
	public course(String name, int hrs, int size) {
		this.name = name;
		this.hrs = hrs;
		st = new student[size];
		nbs = 0;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getNbs() {
		return nbs;
	}
	
	public student getStudent(int index) {
		//if(index>=0&&)
		return st[index];
		//else 
			//return null;
	}
	
	public student getStudent2(int index) {
		if(index>=0&&index<nbs)
		return st[index];
		else 
			return null;
	}
	
	public int search(int id) {
		for(int i=0;i<nbs;i++)
		{
			if(st[i].getId()==id)
				return i;
		}
		return -1;
		
	}
	
	public int searchWrongWay(int id) {
		for(int i=0;i<st.length;i++)
		{
			if(st[i].getId()==id)
				return i;
		}
		return -1;
		
	}
	
	
	public int searchName(String name) {
		for(int i=0;i<nbs;i++)
		{
			if(st[i].getName().equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}
	public student searchStudent(int id) {
		for(int i=0;i<nbs;i++)
		{
			if(st[i].getId()==id)
				return st[i];
		}
		return null;
	}
	
	public boolean addWrong(student s) {
		st[nbs]=s;
		nbs++;
				return true;
	}
	public boolean add1(student s) {
		if(nbs<st.length) {
		st[nbs]=s;
		nbs++;
				return true;
		}
		else
			return false;
	}
	
	public void printArr() {
		System.out.println("Course Name:"+name);
		System.out.println("Course Hours:"+hrs);
		System.out.println("==================================# LIST OF STUDENT: #=============================================================================");
	for(int i=0;i<nbs;i++)
	{
		st[i].print();
	}
		
	}
	
	public void ReadArr() {
		System.out.println("==================================# READ THE STUDENTS INFORMATION: #=============================================================================");
	for(int i=0;i<st.length;i++)
	{
		st[i].Read();
		nbs++;
	}	
	}
	public void printArrToString() {
		System.out.println("Course Name:"+name);
		System.out.println("Course Hours:"+hrs);
		System.out.println("==================================# LIST OF STUDENT: #=============================================================================");
	for(int i=0;i<nbs;i++)
	{
		System.out.println(st[i ]);
	}
		
	}
	
	
	public boolean adduni(student s) {
		if(nbs<st.length) {
			int index=search(s.getId());
		if(index==-1)// not found then go ahed and add.
		{
		st[nbs]=s;
		nbs++;
				return true;
		}
		// if found
		return false;
		}
		//if no space
		else
			return false;
	}
	public boolean delete(int id) {
		int index=search(id);// find s to delete
		if(index==-1)
			return false;
		else {
		st[index]=st[nbs-1];
		nbs--;
		return true;
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
