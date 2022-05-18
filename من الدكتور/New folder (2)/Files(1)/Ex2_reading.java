import java.io.*;

class Ex2_reading {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f1 = new File("Teachers.data");
		FileInputStream fos = new FileInputStream(f1);
		ObjectInputStream obj = new ObjectInputStream(fos);
		
		teacher res;
		
		try {
			
			while(true)
			{
		res = (teacher) obj.readObject();
		System.out.println("The name is : " + res.getName());
		System.out.println("The age is : " + res.getAge());
			}
		}catch(EOFException e)
		{
			System.out.println("I reached the end of file");
		}
	}

}
