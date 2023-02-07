import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;
public class wordanalysis {
	private String filename; private int n =0; private int m =0; private Scanner input; LinkedList<WordInformation> arrayOfDifferentLengths[] ; WordInformation sortedArray[];
	/*
	 1. Method readFileAndAnalyse (filename f)
Input: filename f
Requires: f should be an existing file with valid filename.
Results: This operation will open file f as input, read the text in the file word
by word and analyze the text as follows: When a word w of length x is read,
the list for words of length x is searched for word w. If w is found, a new node
is inserted for its occurrence, containing w’s line number and word position in
the line. If w is not found, a new node is inserted in the list for words of length
x, containing the string for the word and a new node is inserted for in its
occurrence list, containing w’s line number and word position.
	 */
	public wordanalysis()throws FileNotFoundException,IOException { n=0; m=0; Scanner input=new Scanner(System.in).useLocale(Locale.US);}
	public void readFileAndAnalyse(String fn) throws IOException { filename=fn; this.filename = fn; n=NoOfWords(fn); int  k=maxLength(filename);
		arrayOfDifferentLengths = (LinkedList<WordInformation>[]) new LinkedList[k+1];
		//System.out.println(arrayOfDifferentLengths.length);
	    for(int i=0;i<arrayOfDifferentLengths.length;i++) { arrayOfDifferentLengths[i] = new LinkedList<WordInformation>();}
	    File f =new File(filename); input=new Scanner(f);
		int pos=1; int Line=1;
		String words[]=new String[n+1]; Scanner in=new Scanner(System.in).useLocale(Locale.US);
		//to deal with all the words
		int x=0;
		//line
		int l=1;		
		Scanner input=new Scanner(f);
		input.useDelimiter("[^A-Z-a-z\u0027]+");
		while(input.hasNext()) { String s=input.next(); words[x++]=s;}
		//System.out.println("##########################################################################################################################");
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			x=0;
			while((line = br.readLine()) != null) {
				WordInformation wi; WordOccurrence wo;
				//System.out.println("line: "+Line);
				String[] s;
				//s.useDelimiter("[^A-Za-z]+");
				s=line.split(" ");
				//System.out.println(line);
				for(int i=0;i<s.length;i++) {
					//int len=words[x].length();
					if(arrayOfDifferentLengths[words[x].length()] !=null && arrayOfDifferentLengths[words[x].length()].findWord(words[x])) {	
						//arrayOfDifferentLengths[s[i].length()].findLast();
						arrayOfDifferentLengths[words[x].length()].retrieve().occList.insert(wo = new WordOccurrence(Line, pos));
						arrayOfDifferentLengths[words[x].length()].retrieve().size = arrayOfDifferentLengths[words[x].length()].retrieve().size+1 ;
						//System.out.println("a repeated word "+arrayOfDifferentLengths[words[x].length()].retrieve().word);
						//n++;
						pos++;
					}
					else {arrayOfDifferentLengths[words[x].length()].insert(wi = new WordInformation(words[x]));
				//	arrayOfDifferentLengths[s[i].length()].findLast();
					arrayOfDifferentLengths[words[x].length()].retrieve().occList.insert(wo = new WordOccurrence(Line, pos));
					arrayOfDifferentLengths[words[x].length()].increaseSize();
					//System.out.println("The new Word: "+arrayOfDifferentLengths[words[x].length()].retrieve().word);
					pos++; m++;
					//n++;
					}
					//System.out.println("==================================================================");
					x++;
				}
				Line++; pos=1;
				}
				
			
		} catch (IOException e) {
			System.out.println("there is an error");
		}
		//we need to make a sorted array
		sortedArray=new WordInformation[uniqueWords()];
		int no=0;
		for(int i=1;i<arrayOfDifferentLengths.length;i++) {
			if(!arrayOfDifferentLengths[i].First()) {arrayOfDifferentLengths[i].findfirst();}
			
			while(arrayOfDifferentLengths[i].retrieve()!=null) {
				sortedArray[no++]=arrayOfDifferentLengths[i].retrieve();
				arrayOfDifferentLengths[i].findNext();
			}
			//sortedArray[no++]=arrayOfDifferentLengths[i].retrieve();
		}
		WordInformation tmp;
		for(int i=0;i<sortedArray.length;i++) {
			for(int j=1; j < (sortedArray.length-1); j++){  
                if(sortedArray[j-1].size < sortedArray[j].size){  
                       //swap elements  
                       tmp = sortedArray[j-1];  
                       sortedArray[j-1] = sortedArray[j];  
                       sortedArray[j] = tmp;  
               }
			}
		}
		}
	
	/*
	 (2) An operation to determine the total number of words in a text file (i.e., the
length of the file). O(1)
(3) An operation to determine the total number of unique words in a text file. O(1)
2. Method documentLength (int l)
Results: The method will return the length of document (i.e., total number of
all words).
Output: l
3. Method uniqueWords (int u)
Results: The method will return the number of unique words in the document.
Output: u
	 */
	public int documentLength () {return n;} public int uniqueWords() {return m;}
	/*
	 (4) An operation to determine the total number of occurrences of a particular word.
Case 1 = O(m/k), Case 2 = O(m) or O(n)
	 */
	public int totalNoOfWords(String s) {
		while(arrayOfDifferentLengths[s.length()] !=null && arrayOfDifferentLengths[s.length()].findWord(s))
			return arrayOfDifferentLengths[s.length()].retrieve().size;
		return 0;
	}
	/*
	 (5) An operation to determine the total number of words with a particular length
occurring in the text file. Case 1= O(1), Case 2 = O(1)
	 */
	public int totalWordsForLength(int len) throws Exception{
		int no=0;
		//maybe there will be error and we should throw
		arrayOfDifferentLengths[len].findfirst();
		while(arrayOfDifferentLengths[len].retrieve() !=null) {
			no+=arrayOfDifferentLengths[len].retrieve().size;
			arrayOfDifferentLengths[len].findNext();
		}
		if(no>0)
		return no;
		else
			return 0;
	}
	
	
	
	/*
	 (5) An operation to display the unique words in the file sorted by the total
occurrences of each word (from the most frequent to the least). O(m)
	 */
	public void DisplayTheMost() {
		for(int i=0;i<sortedArray.length;i++) {
			System.out.print("||"+"Word: "+sortedArray[i].word+"||");
			System.out.println("total No. Of Words: "+sortedArray[i].size+"||");
		}
	}
	
	//operation 6
	/*
	 An operation to display the locations of the occurrences of a word starting from
the top of the text file (i.e., as a list of line and word numbers). Note that every
new-line character indicates end of a line. O(n)
	 */
		public LinkedList<WordOccurrence> ccurrences(String s) throws Exception{
			try {
			if(arrayOfDifferentLengths[s.length()] !=null && arrayOfDifferentLengths[s.length()].findWord(s)) {
				return arrayOfDifferentLengths[s.length()].retrieve().occList;
			}
			}catch (Exception e) {
				System.out.println("there is an error try again");}
			return null;
		}
		/*
		 (8) An operation to examine if two words are occurring adjacent to each other in
a text file (at least one occurrence of both words is needed to satisfy this
operation). O(n)
		 */
	public boolean checkAdjacent(String s1,String s2) throws Exception {
		LinkedList<WordOccurrence> t1=ccurrences(s1);
		LinkedList<WordOccurrence> t2=ccurrences(s2);
		if(t1!=null&&t2!=null) { t1.findfirst();t2.findfirst();}
		
		if(t1!=null&&t2!=null) {
		while(t1.retrieve()!=null) {
			t2.findfirst();
			while(t2.retrieve()!=null) {
				if((t1.retrieve().getLineNo())==(t2.retrieve().getLineNo())){
					if((t1.retrieve().position+1)==(t2.retrieve().position))return true; }
				t2.findNext(); }
			t1.findNext();}
		}
	
		return false;}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		private int maxLength(String fn)throws FileNotFoundException,IOException {
			this.filename = fn; File f=new File(filename); input=new Scanner(f); int max=0; input.useDelimiter("[^A-Za-z]+");	
			while(input.hasNext()) { int tmp=input.next().length(); if(tmp>max) {max=tmp;} }return max;  }
		private int NoOfWords(String fn) throws FileNotFoundException {
			this.filename = fn; File f=new File(filename); input=new Scanner(f); int n=0; input.useDelimiter("[^A-Z-a-z]+");	
			while(input.hasNext()) { input.next(); n++; } return n; }
		public void displayTheText() {
			try (FileReader fr = new FileReader(filename);
					BufferedReader br = new BufferedReader(fr)) {String line;
				while((line = br.readLine()) != null) {
					String[] s;
					//s.useDelimiter("[^A-Za-z]+");
					s=line.split(" "); System.out.println(line);}
			} catch (IOException e) {			System.out.println("there is an error");}      }
		//to sure you insert the information in The good why
		public void displayTheInformationOfThetxtText() { String words[]=new String[(n+1)]; Scanner in=new Scanner(System.in).useLocale(Locale.US);
			//to deal with all the words
			int x=0;
			//line
			int l=1; int pos=1;
			input.useDelimiter("[^A-Z-a-z\u0027]+");
			while(input.hasNext()) { String s=input.next();words[x++]=s;}
			System.out.println("###############################################################################################################################################################################");
			try (FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)) { String line; x=0;
				while((line = br.readLine()) != null) {
					System.out.println("line: "+l); String[] s;
					//s.useDelimiter("[^A-Za-z]+");
					s=line.split(" ");System.out.println(line);
					for(int i=0;i<s.length;i++) {
						int len=words[x].length();
						System.out.print("||"+"LINE:"+l+"||"); System.out.print("The No. : "+ (x+1)+"||");System.out.print("The Pos No: "+pos+"||"); System.out.println("Words: "+words[x]+"||");
						System.out.println("==================================================================");
						x++; pos++;
					}
					pos=1; l++;
				}
			} catch (IOException e) {System.out.println("there is an error");}}

		
		
	
	
	private int totalUnicqeWordsForLength(int len) {
		int no=0;
		//maybe there will be error and we should throw
		//arrayOfDifferentLengths[len].findfirst();
		if(arrayOfDifferentLengths[len] !=null) {
			no=arrayOfDifferentLengths[len].getSize();
		}
		if(no>0)
		return no;
		else
			return 0;
	}
	
	
	
	
	/*
	private boolean checkAdjacent2(String s1,String s2) {
		int len1=s1.length();
		int len2=s2.length();
		if(arrayOfDifferentLengths[len1].findWord(s1)&&arrayOfDifferentLengths[len2].findWord(s2)) {
			arrayOfDifferentLengths[len1].retrieve().getOccList().findfirst();
			arrayOfDifferentLengths[len2].retrieve().getOccList().findfirst();
		while(arrayOfDifferentLengths[len1] !=null && arrayOfDifferentLengths[len1].findWord(s1)) {
			 int line =arrayOfDifferentLengths[len1].retrieve().occList.retrieve().lineNo;
			 int pos=arrayOfDifferentLengths[len1].retrieve().occList.retrieve().position;
			while(arrayOfDifferentLengths[len2] !=null && arrayOfDifferentLengths[len2].findWord(s2)) {
				 int line2=arrayOfDifferentLengths[len2].retrieve().occList.retrieve().lineNo;
				 int pos2=arrayOfDifferentLengths[len2].retrieve().occList.retrieve().position;
				 if((line)==line2 && ((pos+1)==pos2) || ((pos)==pos2+1)) {
					 return true;
				 }
				 arrayOfDifferentLengths[len2].retrieve().occList.findNext();
				 if(arrayOfDifferentLengths[len2].retrieve().occList.retrieve()!=null) {
					  line2=arrayOfDifferentLengths[len2].retrieve().occList.retrieve().lineNo;
					  pos2=arrayOfDifferentLengths[len2].retrieve().occList.retrieve().position;
					 if((line)==line2 && ((pos+1)==pos2) || ((pos)==pos2+1))  {
						 return true;
					 }
					 else {
						 break;
					 }
				 } 
			}
			//arrayOfDifferentLengths[len2].retrieve().getOccList().findfirst();
			arrayOfDifferentLengths[len2].retrieve().getOccList().findNext();;
		}
		}
		
		return false;
	}
	*/
	
	
}
