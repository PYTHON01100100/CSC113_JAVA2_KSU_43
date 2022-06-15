/*
 * ID:441170135
 * NAME:ABDULRAHMAN ALMYMAN
 */
import java.util.Locale;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
		int i;
		int no;
		int s;
		boolean b;
		Student a=new Student(100);
		do {
			System.out.println("=================================================================================================");
				System.out.println("|| 1. addMark ||"+ "2. deleteMark ||"+  "3. searchMark || "+ "4. display the arrays ||"+ "5. MaximumMark  ||"+ "6. MinimumMark || \n"
						+ "|| 7. MinMaxMark ||"+ "8. countFequency ||"+ "9. AverageMark ||"+ "10. sortMarks ||"+"11. delet with sort || "+"12. Exit ||");
				System.out.print("enter the No. of the choice: ");
				i=input.nextInt();
				if(i==1) {
					System.out.println("please add the number to the array");
					no=input.nextInt();
					//a.addMark(no);
					b=a.addMark(no);
					if(b==false) {
						System.out.println("faild to add");
					}
					else {
						System.out.println("You've done");
					}
				}
				else if(i==2) {
					System.out.println("please enter the number of position to delete :");
					no=input.nextInt();
					b=a.deleteMark(no);
					if(b==false) {
						System.out.println("faild to delete");
					}
					else {
						System.out.println("You've done");
					}
					
					
				}
				else if(i==3) {
					System.out.println("please enter the number to search :");
					no=input.nextInt();
					s=a.search(no);
					if(s==-1) {
						System.out.println("not found");
					}
					else
					System.out.println("we found number "+no+" and lotated in "+s);
				}
				else if(i==4) {
					a.display();
				}
				else if(i==5) {
					no=a.MaximumMark();
					System.out.println(" the Maximum Mark is "+no);
				}
				else if(i==6) {
					no=a.MinimumMark();
					System.out.println("the Minimum Mark is "+no);
				}
				else if(i==7) {
					System.out.println("the Minimum Mark is " +a.MinimumMark() +" and the Maximum Mark is    "+a.MaximumMark()+"");
				}
				else if(i==8) {
					no=a.countFequency();
					System.out.println("the count of zero is "+no);
				}
				else if(i==9) {
					System.out.println("the avrage of  Marks is "+a.AvrageMarks());
				}
				else if(i==10) {
					a.sortMarks();
					System.out.println("you've done");
				}
				else if(i==11) {
					System.out.println("please enter the number to search :");
					no=input.nextInt();
					a.deleteByShifting(no);
				}
				else {
					System.out.println("wrong type and try again");
				}
		}while(i != 12);
		System.out.println("=================================================================================================");
		System.out.println("good bye :)  and see you later");
	}
}