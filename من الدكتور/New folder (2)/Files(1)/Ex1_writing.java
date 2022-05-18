import java.io.*;
public class Ex1_writing {

	public static void main(String[] args) throws IOException{

		File f1 = new File("Teachers.data");
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		
		teacher t1 = new teacher("Ali", 45);
		teacher t2 = new teacher("saoud", 55);
		
		obj.writeObject(t1);
		obj.writeObject(t2);
		
		obj.close();
	}

}
