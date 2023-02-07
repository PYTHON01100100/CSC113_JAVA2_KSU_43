import java.io.*;
import java.util.Scanner;
/*
 * diagram : https://app.diagrams.net/
 * 
 */
public class test2  {
		public static void main(String[] args) throws IOException {
			String	filename="C:/Users/Dell/Videos/eng/txt.txt";
			//String words[]=new String[100];
			ReadFromfile4 t=new ReadFromfile4();
			
			
			System.out.println("");
			t.readFileAndAnalyse(filename);
			
			
		}}