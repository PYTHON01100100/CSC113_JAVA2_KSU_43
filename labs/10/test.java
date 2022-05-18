import java.util.Scanner;
public class test {
public static void main(String [] args){
Scanner input = new Scanner(System.in);
LinkedListOfEmployees list = new LinkedListOfEmployees();
int choice = 0;
do{
System.out.println("1- Add a new emmployee.");
System.out.println("2- Get number of employees of a given gender.");
System.out.println("3- Display the oldest employee.");
System.out.println("4- To display all employees of a given gender.");
System.out.println("5- To view all Male employees in the LinkedList.");
System.out.println("0- Exit.");
System.out.print("Enter choice: ");
choice = input.nextInt();
switch(choice){
case 1:
System.out.print("Enter employee id, name, gender, and age: ");
Employee e = new Employee(input.nextInt(),
input.next(), input.next(), input.nextInt());
list.insertAtEnd(e);
System.out.println("Employee Added Successfully");
break;
case 2:
System.out.print("Enter the given gender: ");
String g = input.next();
System.out.println("Number of " + g + " employees: "
+ list.countEmployees(g));
break;
case 3:
Employee emp = list.getOldestEmployee();
if(emp == null) System.out.println("The list is empty");
else{
System.out.println("The oldest employee is:");
emp.display();
}
break;
case 4:
System.out.print("Enter the given gender: ");
String gen = input.next();
int count = list.countEmployees(gen);
if(count == 0){
System.out.println("There are no employees of the given gender!");
}
else{
LinkedListOfEmployees tempList =
list.getEmployee(gen);
System.out.println("All " + gen + " employees: ");
tempList.display();
}
break;
case 5:
int countM = list.countEmployees("Male");
if(countM == 0){
System.out.println("There are no male employees!");
}
else{
LinkedListOfEmployees male = list.getEmployee("Male");
System.out.println("All Male employees: ");
male.display();
}
break;
case 0:
System.out.println("GoodBye!");
break;
default:
System.out.println("Invalid choice!");
}
}while(choice != 0);
}
