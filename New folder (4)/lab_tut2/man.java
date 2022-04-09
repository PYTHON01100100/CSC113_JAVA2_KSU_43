public class man {
	private String name;
	private int age;
	private woman arrw[];
	private int nbw;
	public man(String name, int age) {
		this.name = name;
		this.age = age;
		arrw=new woman[4];
		nbw=0;
	}
	public boolean addwife(woman wife) {
		// this method associates a new wife to the man. It returns true if the
		//wife is associated false otherwise. 
		if(nbw==arrw.length) {
			return false;
		}
		else {
			arrw[nbw++]=wife;
			wife.setHusband(this);
			return true;
		}
	}
	public void displaywivesinfo() {
		// displays the detail(name and age) of every wife which is married to the
		// man and in case if man is unmarried , it will display “He is single”.
		
		if(nbw==0) {
			System.out.println("he is single");
		}
		else {
			for(int i=0;i<nbw;i++) {
				arrw[i].display();
				
			}
		}
	}
	public void divorce(woman w) {
		//this method removes the Woman w from the wives of the man. 
	int index=-1;
	for(int i=0;i<nbw;i++) {
		if(arrw[i].getName().equalsIgnoreCase(w.getName())&&
				arrw[i].getAge()==w.getAge())
			index=i;
	}
	if(index==-1) {
		System.out.println("not found");
	}
	else {
		arrw[index].setHusband(null);
		arrw[index]=arrw[nbw-1];
		arrw[nbw-1]=null;
		nbw--;
		System.out.println("done");
	}
	
	}
	public int find(woman w) {
		for(int i=0;i<nbw;i++) {
			if(w.getAge()==arrw[i].getAge()&&w.getName().equalsIgnoreCase(arrw[i].getName()))
				return i;
	}
		return -1;
	}
	
public woman  getYougestWife() {
	//): returns the youngest wife of the man.
	woman w=null;
	for(int i=0;i<nbw;i++) {
		if(w==null||arrw[i].getAge()<w.getAge())
			w=arrw[i];
	}
	return w;
		
	}
public woman[] getWifes(int a) 
{
	//this method returns an array containing all the wives of the man whose age
	//is less than a.
	int size=0;
	for(int i=0;i<nbw;i++)
		if(arrw[i].getAge()<a)
			size++;
	
	woman temp[]=new woman[size];
	int c=0;
	for(int i=0;i<nbw;i++)
		if(arrw[i].getAge()<a)
		{
			temp[c++]=arrw[i];
		}
	return temp;
}
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
 





}
