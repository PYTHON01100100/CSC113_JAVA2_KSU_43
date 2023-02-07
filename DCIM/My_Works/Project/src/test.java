import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;
public class test {

public static void main(String[] args) throws Exception {
		
		try {
			//as I am playing the game ^_^
			wordanalysis t = new wordanalysis();
			t.readFileAndAnalyse("C:/Users/Dell/Videos/eng/txt.txt");
			System.out.println("We have read the file:"+"\ntext:");
			t.displayTheText();
			System.out.println("###############################################################################################################################################################");
			System.out.println("OP1 The total No. OF words in the document: "+t.documentLength());
			System.out.println("OP2 The total No. OF Uniqe words in the document: "+t.uniqueWords());
			//t.displayTheInformationOfThetxtText();
			System.out.println("===============================================================================================================================================================");
			System.out.println("OP3 the total no of a specific word:"+t.totalNoOfWords("one"));
			System.out.println("OP4 The total Words For Length: "+t.totalWordsForLength(6));
			System.out.println("OP5 the most frequent to the least : ");
			t.DisplayTheMost();
			System.out.println("###############################################################################################################################################################");
			System.out.println("OP6 display the locations of the occurrences of a word :");
			try {
			t.ccurrences("simple").displayLinkedListInformation();
			}catch(Exception e) {System.out.println("there is an error");}
			System.out.println("-----------------------"+"\n:");
			try {
			t.ccurrences("Human-Understanding").displayLinkedListInformation();
			}catch(Exception e) {System.out.println("there is an error");}
			System.out.println("=========================================================================================================================================================================");
			System.out.println("OP7 An operation to examine if two words are occurring adjacent to each other in the file :");
			try {
			System.out.println(t.checkAdjacent("called", "abstraction"));
			System.out.println(t.checkAdjacent("the", "acts"));
			System.out.println(t.checkAdjacent("the", "relationships"));
			System.out.println(t.checkAdjacent("the", "data"));
			System.out.println(t.checkAdjacent("are", "made"));
			System.out.println(t.checkAdjacent("them", "from"));
			System.out.println(t.checkAdjacent("a", "values"));
			System.out.println(t.checkAdjacent("functions", "operations"));
			System.out.println(t.checkAdjacent("be", "applied"));
			System.out.println(t.checkAdjacent("data", "g"));
			System.out.println(t.checkAdjacent("data", "data"));
			}catch(Exception e) {System.out.println("there is wrong");}
			//t.DisplayTheMost();
			
		}catch(IOException e) {
			
		}
		
	}

}
		
		/*
		
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
		int d=0;
		linkedList<String> l=new linkedList<String>();
		String s;
		do {
			System.out.println("enter word");
			s=input.next();
			l.insert(s);
			System.out.println("cont:");
			d=input.nextInt();
		}while(d!=-1);
		l.display();
		System.out.println("=======================================================================================");
		l.displayTheCurrent();
		*/
		
		
	