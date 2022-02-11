
public class Test_Company {

	public static void main(String[] args) {
		
Company CC = new Company("Al Marai", 100);
       Employee E3 = new Employee("khouloud", 61, 'F');
		Employee E1 = new Employee("Ali", 24, 'M');
		Employee E2 = new Employee("Fatima", 59, 'F');
		Employee E4 = new Employee("Bader", 23, 'M');
		
		
		CC.AddEmployee(E1);
		CC.AddEmployee(E2);
		CC.AddEmployee(E3);
		CC.AddEmployee(E4);
		
		//int loc=CC.searchEmp(E3);
		//System.out.println("the index is: "+loc);
		//CC.display();
		//CC.sortEmp();
        // CC.display();
		CC.deleteEmployee(E2);
         //CC.deleteByShifting(E3);
         CC.display();
        //System.out.println("the oldest and youngest person in the company and their avreage:  \n"+CC.oldest()+"\n"+CC.youngest()+"\n"+CC.AvreageAge()+"\n");
         

	}

}
