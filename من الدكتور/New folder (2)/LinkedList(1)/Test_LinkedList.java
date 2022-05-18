
public class Test_LinkedList {

	public static void main(String[] args) {

LinkedList L1 = new LinkedList();

L1.insertAtFirst(10);
L1.insertAtFirst(20);
L1.insertAtFirst(30);
L1.insertAtFirst(40);

L1.display();

System.out.println("\n============================================");
L1.insertAtLast(100);

L1.display();

System.out.println("\n============================================");

L1.deleteAtFirst();

L1.display();
System.out.println("\n============================================");

L1.deleteAtLast();

L1.display();

System.out.println("\n============================================");

System.out.println("Is it Empty ? " + L1.isEmpty() );

System.out.println("The nb of elements is: " + L1.size());

Node res = L1.search(20);

if(res == null)
	System.out.println("Element not found");
else
	System.out.println(res.getData() + " was found");
System.out.println("\n============================================");

L1.deleteAtFirst();

L1.deleteAtFirst();

L1.deleteAtFirst();


System.out.println("Is it Empty ? " + L1.isEmpty() );

System.out.println("The nb of elements is: " + L1.size());

Node pp = L1.search(20);

if(pp == null)
	System.out.println("Element not found");
else
	System.out.println(pp.getData() + " was found");
	}

}
