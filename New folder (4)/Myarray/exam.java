
public class exam {

public boolean isSorted(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			return false;
		}
	}
	return true;
}
public void add(int a,int b) {System.out.println( a+b);}
	
public static void main(String[] args) {
		exam o=new exam();
		//System.out.println(o.get());
		int a[]= {1,2,3,4,5,6};
		System.out.println(a.length);
		
		System.out.println(o.isSorted(a));
//compile Cannot make a static reference to the non-static method add(int, int) from the type exam
		//add(4,5);	
o.add(5, 5);
}

}
