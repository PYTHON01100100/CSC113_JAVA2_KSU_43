
public class sumandN {
	public static int[] cumulativeAddition(int[] array) {
		int sum=0;
		  int nOfN=array.length;
		  for(int i=0;i<array.length;i++){
		    sum=array[i]+sum;
		  }
		  
		  int arr[]= {sum , nOfN};
		  return  arr;
	}
	
	
}
