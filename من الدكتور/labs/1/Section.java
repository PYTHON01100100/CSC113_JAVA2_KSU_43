
public class Section {
	private Student arrStu[];
	private int nbs;
	public Section(int size) {
		arrStu=new Student[size];
		nbs=0;
	}
	public boolean addStudent(Student s) {
		//this method adds a student st in the section and returns
		// true if student is successfully added in the section otherwise it returns false.
		if(nbs==arrStu.length) {
			return false;
		}
		else {
			arrStu[nbs]=s;
			nbs++;
			return true;
		}
	}
	private void addStudent2(Student s) {
		if(nbs==arrStu.length) {
			System.out.println("IS FULL");
		}
		else {
			arrStu[nbs]=s;
			nbs++;
			System.out.println("ADDED");
		}
	}
	public int searchstu(int id) {
		// this method returns the index of the array if student with Id id is
		//found otherwise it returns -1.
		for(int i=0;i<nbs;i++) {
			if(id==arrStu[i].getId())
				return i;
		}
		return -1;
	}
	public boolean deleteStu(int id) {
		// this method deletes a student with Id id from the section. It
		// returns true if the student is successfully deleted otherwise it returns false.
		int i=searchstu(id);
		if(i==-1) {
			return false;
		}
		else {
			arrStu[i]=arrStu[nbs-1];
			arrStu[nbs-1]=null;
			nbs--;
			return true;
		}
	}
	public boolean deleteStushift(int id) {
		int i=searchstu(id);
		int index;
		if(i==-1) {
			return false;
		}
		else {
			for(index=i;index<nbs-1;i++) {
			arrStu[index]=arrStu[index+1];
			}
			arrStu[nbs-1]=null;
			nbs--;
			return true;
		}
	}
	public Student searchMax(String gender) {
		// in this case
		Student m=null;
		for(int i=0;i<nbs;i++) {
			if(gender.equalsIgnoreCase(arrStu[i].getGender())) {
				if(m==null||arrStu[i].getAge()>m.getAge())
				m=arrStu[i];
			}
		}
		return m;
	}
	public void displayAll() {
		// this method will display the information of every student in the section
		System.out.println("the student information");
		for(int i=0;i<nbs;i++)
			arrStu[i].display();
	}
	public void display(int index) {
		//this method will display the information of the student at array index index
		for(int i=0;i<nbs;i++)
			if(index==i) {
				arrStu[i].display();
				return;
			}
			else {
				System.out.println("invalid index");
			}
		//another way
		/*
		if(index>=0&&index<nbs) {
			arrStu[index].display();
		}
		else
			System.out.println("invalid index");
			*/
	}
	
	public void display(String name) {
		//: this method will display the information of every student
		//in the section whose name is name.
		for(int i=0;i<nbs;i++)
			if(name.equalsIgnoreCase(arrStu[i].getName())) {
				arrStu[i].display();
				return;
			}
	}
	public void displaySameAs(Student s) {
		//this method will display the information of every
		//student in the section whose information(Name, Age and Gender) is same as of st
		for(int i=0;i<nbs;i++)
		{
			if(s.getAge()==arrStu[i].getAge()&&
					s.getName().equalsIgnoreCase(arrStu[i].getName())&&
					s.getGender().equalsIgnoreCase(arrStu[i].getGender())) {
				arrStu[i].display();
		}
		}
	}
	public  Student searchFirst(String name) {
		//this method will return the first Student Object from
		//the array whose name is name
		for(int i=0;i<nbs;i++) {
			if(name.equalsIgnoreCase(arrStu[i].getName()))
				return arrStu[i];
		}
		return null;
	}
	public  Student searchLast(String name) {
		//: this method will return the last Student Object from the
		//array whose name is name.
		for(int i=nbs-1;i>=0;i--) {
			if(name.equalsIgnoreCase(arrStu[i].getName()))
				return arrStu[i];
		}
		return null;

	}
	public  Student searchLast2(String name) {
		Student temp=null;
		for(int i=0;i<nbs;i--) {
			if(name.equalsIgnoreCase(arrStu[i].getName()))
				temp= arrStu[i];
		}
		return temp;

	}
	public Student[] getStudent(int age) {
		//: this method will return an array of students having age less than age
		int size=0;
		for(int i=0;i<nbs;i++)
			if(arrStu[i].getAge()<age) {
				size++;
			}
		Student temp[]=new Student[size];
		int c=0;
		for(int i=0;i<nbs;i++)
			if(arrStu[i].getAge()<age) {
				temp[c++]=arrStu[i];
			}
		return temp;
	}
	
	public int splitStudent(Student[]male, Student []female) {
		int countM=0;
		int countF=0;
		for(int i=0;i<nbs;i++) {
			if(arrStu[i].getGender().equalsIgnoreCase("F")) {
				female[countF++]=arrStu[i];
			}
			else {
				male[countM++]=arrStu[i];
			}
			
			
		}
		
		return countM;
	}
	
}
