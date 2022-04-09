
public class ave {

	public static double average(int[] array) {
		  double sum=0;
		  int nOfN=array.length;
		  for(int i=0;i<array.length;i++){
		    sum=array[i]+sum;
		  }
		  
		  return sum/nOfN;
		  
		}
	public static void main(String[] args) {
		int a[]= {2 , 4 , 9 , 23 , 435};
		double b=average(a);
		System.out.println(b);
	}
}

