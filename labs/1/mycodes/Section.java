public class Section {
private Student arrStu[];
private int nbStu;
public Section(int size){
arrStu = new Student[size];
nbStu = 0;
}
public boolean addStudent(Student st){
	if(nbStu >= arrStu.length)
		return false;
	arrStu[nbStu++] = st;
	return true;
}
public int searchStudent(int id){
	for(int i = 0; i < nbStu; i++) {
		if(arrStu[i].getId() == id)
			return i;
		}
	return -1;
	}
public boolean deleteStudent(int id){
	int index = searchStudent(id);
	if(index == -1)
		return false;
	arrStu[index] = arrStu[nbStu-1];
	arrStu[nbStu-1] = null;
	nbStu--;
	return true;
}
public void displayAll(){
	for(int i = 0; i < nbStu; i++)
		arrStu[i].display();
}
public void display(int index){
	if(index >= 0 && index < nbStu) {
		arrStu[index].display();
}
	else
System.out.println("Wrong index");
}
public void display(String name){
	for(int i = 0; i < nbStu; i++)
		if(arrStu[i].getName().equalsIgnoreCase(name)) {
			arrStu[i].display();
		}
	}
public void displaySameAs(Student st){
	for(int i = 0; i < nbStu; i++)
		if(arrStu[i].getName().equalsIgnoreCase(st.getName())&& arrStu[i].getAge() == st.getAge()&&arrStu[i].getGender().equalsIgnoreCase(st.getGender()))
			arrStu[i].display();
}
public Student searchFirst(String name){
	for(int i = 0; i < nbStu; i++)
		if(arrStu[i].getName().equalsIgnoreCase(name))
			return arrStu[i];
	return null;
}
public Student searchLast(String name){
	Student temp = null;
	for(int i = 0; i < nbStu; i++)
		if(arrStu[i].getName().equalsIgnoreCase(name))
			temp = arrStu[i];
	return temp;
}

public Student[] getStudents(int age){
	int size = 0;
	Student temp[] ;
	for(int i = 0; i < nbStu; i++) {
		if(arrStu[i].getAge() < age)
			size++;
	}
		temp = new Student[size];
		int counter = 0;
		for(int j = 0; j < nbStu; j++) {
			if(arrStu[j].getAge() < age)
				temp[counter++] = arrStu[j];
		}
	return temp;
}
}