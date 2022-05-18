
public class TestPayable {

	public static void main(String[] args) {
		
		Payable [] Arr = new Payable[4];
		
		Arr[0] = new Invoice(3, 700);
		Arr[1] = new Invoice(4, 1000);
		Arr[2] = new Invoice(2, 500);
		Arr[3] = new PartTimeEmployee("Ali", 24, 'M', 10, 250);
		
		for(int i =0; i<Arr.length; i++)
		{
			System.out.println(Arr[i].getPaymentAmount());
		}
		
		int count =0; 
		for(int i =0; i<Arr.length; i++)
		{
			if(Arr[i] instanceof Invoice)
				count++;
		}
		
		System.out.println("The number of invoices is : " + count);
		
	}

}
