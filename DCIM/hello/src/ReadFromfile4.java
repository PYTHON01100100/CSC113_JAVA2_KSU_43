import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ReadFromfile4 {
	
	String	filename;
	Scanner input;
	public ReadFromfile4() throws FileNotFoundException,IOException {
		
	}
	public int NoOfWords(String fn) throws FileNotFoundException {
		this.filename = fn;
		File f=new File(filename);
		input=new Scanner(f);
		int n=0;
		input.useDelimiter("[^A-Z-a-z\u0027]+"); 
		while(input.hasNext()) {
			input.next();
			n++;
		}
	return n;
}
	public void readFileAndAnalyse(String fn)throws FileNotFoundException,IOException {
		//this.filename = filename;
		this.filename = fn; File f=new File(filename); input=new Scanner(f); int k; k=maxLength(fn); int n1=NoOfWords(fn);
		System.out.println("======================================================================================================");
		DisplayTheTextFile(fn);
		System.out.println("======================================================================================================");
		System.out.println("The max Length: "+(k)+"\nThe No. of words:"+(n1));
		//ArrayLitst d=new ArrayLitst(k+1);
		String words[]=new String[n1+1];
		Scanner in=new Scanner(System.in).useLocale(Locale.US);
		//to deal with all the words
		int x=0;
		//line
		int l=1;		
		Scanner input=new Scanner(f);
		input.useDelimiter("[^A-Z-a-z\u0027]+");
		while(input.hasNext()) {
			String s=input.next();
			words[x++]=s;
		}
		System.out.println("##########################################################################################################################");
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			x=0;
			while((line = br.readLine()) != null) {
				System.out.println("line: "+l);
				String[] s;
				//s.useDelimiter("[^A-Za-z]+");
				s=line.split(" ");
				System.out.println(line);
				for(int i=0;i<s.length;i++) {
					int len=words[x].length();
					System.out.println("LINE:"+l);
					System.out.println("Position: "+ (i+1));
					System.out.println("Words: "+words[x]);
					System.out.println("==================================================================");
					x++;
				}
				l++;
			}
		} catch (IOException e) {
		}
		System.out.println("Done\n");
	}
	
	
	
	//to take the max length
	public int maxLength(String fn)throws FileNotFoundException,IOException {
		this.filename = fn;
		File f=new File(filename);
		input=new Scanner(f);
		int max=0;
		input.useDelimiter("[^A-Z-a-z\u0027]+");	
		while(input.hasNext()) {
			int tmp=input.next().length();
			if(tmp>max) {max=tmp;}
		}
	return max;
}
	public void DisplayTheTextFile(String fn)throws FileNotFoundException,IOException {
		this.filename = fn;
		File f=new File(filename);
		input=new Scanner(f);
		System.out.println("The text: \n");
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
		}
		
}

	//for testing
	private int getNoOfLines()throws FileNotFoundException,IOException {
		
		int l=1;
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				l++;
			}
		} catch (IOException e) {
			return 0;
		}
		//because it will not give the real no. of lines
		return l-1;
		
}
	
}