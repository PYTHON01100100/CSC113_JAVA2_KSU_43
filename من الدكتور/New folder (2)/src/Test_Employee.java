
public class Test_Employee {

	public static void main(String[] args) {

		
		Company CC = new Company("Al Marai", 100);
		
		PartTimeEmployee PT1 = new PartTimeEmployee("Ali", 23, 'M', 10, 500);
		
		PartTimeEmployee PT2 = new PartTimeEmployee("Bader", 33, 'M', 20, 250);

		PartTimeEmployee PT3 = new PartTimeEmployee("Naef", 35, 'M', 13, 175);

		FullTimeEmployee FT1 = new FullTimeEmployee("Saoud", 37, 'M', 2000);
		FullTimeEmployee FT2 = new FullTimeEmployee("Ahmad", 43, 'M', 2500);
		
		CC.addEmployee(PT1);
		CC.addEmployee(PT2);
		CC.addEmployee(PT3);
		CC.addEmployee(FT1);
		CC.addEmployee(FT2);
		
		CC.display();
		System.out.println("======================================");
		System.out.println("The nb of Part Time Employees is : " + CC.countParTime());
		
		System.out.println("======================================");
		System.out.println("The average age of full time Employees is:" + CC.averageAgeFullTime());
		
	}

	

}
