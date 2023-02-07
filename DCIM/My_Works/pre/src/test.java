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
			System.out.println("method 1 is done:"+"\ntext:");
			t.displayTheText();
			System.out.println("###############################################################################################################################################################");
			System.out.println("method 2 The total No. OF words in the document: "+t.documentLength());
			System.out.println("method 3 The total No. OF Uniqe words in the document: "+t.uniqueWords());
			//t.displayTheInformationOfThetxtText();
			System.out.println("===============================================================================================================================================================");
			System.out.println("method 4 the total no of a specific word("+"data):"+t.totalNoOfWords("data"));
			System.out.println("method 5 The total Words For Length: "+t.totalWordsForLength(2));
			System.out.println("method 5 The total Words For Length: "+t.totalWordsForLength(2));
			
			System.out.println("method 6 the most frequent to the least : ");
			t.DisplayTheMost();
			System.out.println("###############################################################################################################################################################");
			System.out.println("method 7 display the locations of the occurrences of a word :");
			try {
			System.out.println("data:");
			t.ccurrences("data").displayLinkedListInformation();
			System.out.println("-----------------------"+"\nthe:");
			t.ccurrences("the").displayLinkedListInformation();
			}catch(Exception e) {/*System.out.println("there is an error");*/}
			System.out.println("=========================================================================================================================================================================");
			System.out.println("method 8 An operation to examine if two words are occurring adjacent to each other in the file :");
			System.out.println(t.checkAdjacent("the", "data"));
			System.out.println(t.checkAdjacent("in", "computer"));
			System.out.println(t.checkAdjacent("the", "relationships"));
			System.out.println(t.checkAdjacent("the", "data"));
			System.out.println(t.checkAdjacent("among", "them"));
			System.out.println(t.checkAdjacent("a", "data"));
			System.out.println(t.checkAdjacent("a", "values"));
			System.out.println(t.checkAdjacent("functions", "operations"));
			System.out.println(t.checkAdjacent("be", "applied"));
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
		
		
	