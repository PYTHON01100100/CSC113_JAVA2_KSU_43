
public class Project {
private String name;
private int duration;
private double budget;
private Researcher arRes[];
private int nbr;
public Project(String nn,int d,double b,int size) {
	name=nn;
	duration=d;
	budget=b;
	nbr=0;
	arRes=new Researcher[size];
}
public Project(Project p) {
	this.name=p.name;
	this.duration=p.duration;
	this.budget=p.budget;
	this.nbr=p.nbr;
	arRes=new Researcher[p.arRes.length];
	for(int i=0;i<p.nbr;i++)
		arRes[i]=p.arRes[i];
}
public boolean deleteStudent(double g) {
	for(int i=0;i<nbr;i++) {
		if(arRes[i] instanceof Student) {
			if(((Student)arRes[i]).getGpa()<g) {
				arRes[i]=arRes[nbr-1];
				arRes[nbr-1]=null;
				nbr--;
				return true;
			}
		}
	}
	return false;
			
}
public Researcher[] getResearchers(double s, double g) {
	Researcher res[]=new Researcher[nbr];
	int c=0;
	for(int i=0;i<nbr;i++) {
		if(arRes[i]instanceof Student) {
			if(((Student)arRes[i]).getGpa()<g);
			res[c++]=arRes[i];
		}
		else {
			if(((Faculty)arRes[i]).getSalary()<s);
			res[c++]=arRes[i];
			
		}
		
		
		
		
	}
	return res;
}
}
