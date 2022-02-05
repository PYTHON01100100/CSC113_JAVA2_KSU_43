
public class Test_Company {

	public static void main(String[] args) {

Company CC = new Company("Al Marai", 100);
		
		Employee E1 = new Employee("Ali", 24, 'M');
		Employee E2 = new Employee("Fatima", 59, 'F');
		Employee E3 = new Employee("Bader", 24, 'M');
		Employee E4 = new Employee("khouloud", 61, 'F');
		
		CC.AddEmployee(E1);
		CC.AddEmployee(E2);
		CC.AddEmployee(E3);
		CC.AddEmployee(E4);
		
         CC.display();
         

	}

}
