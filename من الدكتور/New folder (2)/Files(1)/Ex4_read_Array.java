import java.io.*;
class Ex4_read_Array {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f1 = new File("Teachers.data");
		FileInputStream fos = new FileInputStream(f1);
		ObjectInputStream obj = new ObjectInputStream(fos);
		
		teacher res[];
		
				res = (teacher[]) obj.readObject();
			for(int i=0; i<res.length; i++)
			{
		System.out.println("The name is : " + res[i].getName());
		System.out.println("The age is : " + res[i].getAge());
			}

	}

}
