import java.io.*;

public class Ex3_write_Array {

	public static void main(String[] args) throws IOException{

		File f1 = new File("Teachers.data");
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream obj = new ObjectOutputStream(fos);
	
		teacher [] Arr= new teacher[3];
		Arr[0] = new teacher("Ali", 45);
		Arr[1]  = new teacher("saoud", 55);
		Arr[2]  = new teacher("bader", 59);
		
		obj.writeObject(Arr);
		
		
		obj.close();
}
}
