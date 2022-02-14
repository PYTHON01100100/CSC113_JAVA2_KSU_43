import java.util.Locale;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		int i,j,L;
		String name;
		String id;
		int seatNb; 
		int year;
		int size;
		double price;
		Car C[];
		CarElements CE[];
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
		System.out.println("enter size of ksu cars");
		int no=input.nextInt();
		ksuCars[] k=new ksuCars[no];
		System.out.println("enter no  Cars");
		int no2=input.nextInt();
		C=new Car[no2];
		for( i=0;i<no2;i++) {
			System.out.println("enter name, id, seat Nb, year, size");
			name=input.next();
			id=input.next();
			seatNb=input.nextInt();
			year=input.nextInt();
			size=input.nextInt();
			C[i] =new Car( name, id,seatNb, year,size);
			for( j=0;j<size;j++) {
				CE=new CarElements[size];
				System.out.println("enter element name and price");
				name=input.next();
				price=input.nextDouble();
				CE[j]=new CarElements( name, price);
				C[i].addElement(CE[j]);
			}
		}
		for(i=0;i<no2;i++)
			C[i].display();
		/*
		for(i=0;i<no2;i++) {
			L=k[i].searchCar("sonata");
			if(L!=-1)
				CE[L].display();
		}
		*/
		
		
		
		
		
		
		
	}
}