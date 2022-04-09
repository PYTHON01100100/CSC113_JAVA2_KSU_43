
public class maxMin {
	public static int[] largestSmallest(int[] array) {
		  int max=array[0];
		  int min=array[0];
		  for(int i=1;i<array.length;i++) {
			  if(array[i]>max) {
				  max=array[i];
			  }
			  if(array[i]<min) {
				  min=array[i];
			  }
		  }
		  int arr[]= {max , min};
		  return  arr;
		  
		}
	public static void main(String[] args) {
		//int a[]= {2 , 4 , 9 , 23 , 435};
		//int b[]=largestSmallest(a);
		//System.out.println(b);
			String s=" ";
			String w="hi ";
			int no=3;
			for(int i=0;i<no;i++) {
				s=s+w;
			}
		System.out.println(s);
	}
		
	}
