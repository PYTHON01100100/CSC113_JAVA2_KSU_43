public class FullTime extends Employee{
private double salary;
public FullTime(String name, int id, double salary) {
super(name, id);
this.salary = salary;
}
public FullTime(FullTime ft){
super(ft);
this.salary = ft.salary;
}
public void display(){
super.display();
System.out.println("Salary: " + salary);
}
public double calculatePay(){
return salary - salary*0.09;
}
public double getSalary() { return salary; }
}