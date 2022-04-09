package finalpro;
import java.util.Scanner;

public class TeastPlayer {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
       Player pl = new Player();
       int Number;
       int count;
       System.out.println("Enter Number:");  
        Number = kb.nextInt();
         
       while ( Number!= -1)
      {    
    	   if (1 <= Number && Number<=150)
    	  System.out.println("number is ok");
      else {
    	  System.out.println("number is out of size");
      }
           System.out.println("Please enter Player name, position, rank , goals"); 
          pl.setName(kb.next()); 
          pl.setPosition(kb.next());
          pl.setRank(kb.next());
          pl.setGoals(kb.nextInt());
         
          pl.print();
          System.out.println("Enter Number:");
          Number = kb.nextInt();
         
      }
       
          kb.close();
          System.out.println(pl.getCount());
      
	}

}