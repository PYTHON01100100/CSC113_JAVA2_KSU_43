
public class Test_Company {

	public static void main(String[] args) {

         Company CC = new Company("Al Marai", 100, 7452);
		
		Employee E1 = new Employee("Ali", 24, 'M');
		Employee E2 = new Employee("Fatima", 63, 'F');
		Employee E3 = new Employee("Bader", 24, 'M');
		Employee E4 = new Employee("Ahmad", 61, 'M');
		
		CC.AddEmployee(E1);
		CC.AddEmployee(E2);
		CC.AddEmployee(E3);
		CC.AddEmployee(E4);
		
         CC.display();
         System.out.println("=================================="); 
         
         Product P1 = new Product("Juice", 19);
         Product P2 = new Product("Cheese", 24);
         Product P3 = new Product("Laban", 7);
         
         CC.AddProduct(P1);
         CC.AddProduct(P2);
         CC.AddProduct(P3);
         CC.displayProduct();
         
         System.out.println("==================================");
         
         System.out.println("The average is : " + CC.AverageAge());
         
         System.out.println("=================================="); 
         
         System.out.println("The Oldest is :\n " + CC.Oldest());
         
         System.out.println("=================================="); 
         CC.deleteEmployee("Fatima");
         CC.display();
         
         System.out.println("==================================");
         
         
         CC.deleteByShifting(E1);
         CC.display();
         
         

	}

}
