import java.util.Locale;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
		//student s1=new student();
		//int a=s1.g;
		//System.out.println(s1);
		course c1=new course();
		course c2=new course("csc111",4,3);
		/*
		c2.getStudent2(1);
		System.out.println(c1.getStudent2(2));
		student s=c1.getStudent2(2);
		System.out.println(s.getName());
		*/
		/*
		System.out.println(c1.search(123));
		System.out.println(c1.searchWrongWay(123));
		*/
		/*
		 c2.addWrong(new student());
		c2.addWrong(new student());
		c2.addWrong(new student());
		c2.addWrong(new student());
	*/
		/*
		 //why? 
		 
	c2.ReadArr();
	c2.printArr();
	
	*/
		c2.adduni(new student("ali",1,3.5));
		c2.adduni(new student("li",2,4));
		c2.adduni(new student("lo",3,4.5));
		c2.adduni(new student("faisal",4,2.5));
		c2.adduni(new student("ful",4,2.5));
		c2.printArr();
		c2.printArrToString();
	}

}
