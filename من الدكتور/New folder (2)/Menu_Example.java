package joud;
import java.util.Scanner;
public class Menu_Example {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int nb1, nb2, choice;
		do {
			
            System.out.println("        MENU");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Exit");
            
            System.out.println("Please enter your choice:");
            choice = input.nextInt();
            switch(choice)
            {
            case 1:
            	System.out.println("Please enter your Number 1:");
            	nb1= input.nextInt();
            	System.out.println("Please enter your Number 2:");
            	nb2= input.nextInt();
            	int sum = nb1 + nb2;
            	System.out.println("The sum is: " + sum);
            	break;
            case 2:
            	System.out.println("Please enter your Number 1:");
            	nb1= input.nextInt();
            	System.out.println("Please enter your Number 2:");
            	nb2= input.nextInt();
            	int diff = nb1 - nb2;
            	System.out.println("The difference is: " + diff);
            	break;
            	
            case 3:
            	System.out.println("Please enter your Number 1:");
            	nb1= input.nextInt();
            	System.out.println("Please enter your Number 2:");
            	nb2= input.nextInt();
            	int mul= nb1 * nb2;
            	System.out.println("The multiplication is: " + mul);
            	break;
            	
            case 4:
            	System.out.println("Thank you for using our System");
            	System.out.println("Good Bye");
            	break;
            	
            	default:
            		System.out.println("Wrong choice, please try again");
            	
            }
		}while(choice != 4);
            

	}

}
