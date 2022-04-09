package finalpro;

public class Test {
		private static int x=0;
		public Test(){ x++; }
		public static void main(String[] args)
		 {
		Test obj1 = new Test(),obj2=new Test();
		obj2=obj1;
		System.out.println(x);
		}}
