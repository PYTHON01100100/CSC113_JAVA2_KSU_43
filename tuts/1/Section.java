
public class Section {
	private Student arrStu[];
	private int nbs;
	public Section(int size) {
		arrStu=new Student[size];
		nbs=0;
	}
	public boolean addStudent(Student s) {
		if(nbs==arrStu.length) {
			return false;
		}
		else {
			arrStu[nbs]=s;
			nbs++;
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
