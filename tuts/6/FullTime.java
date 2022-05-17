public class FullTime extends Employee{
private double salary;
public FullTime(int id, String name, double salary) {
super(id, name);
this.salary = salary;
}
public FullTime(FullTime ft){
super(ft);
this.salary = ft.salary;
}
public String toString(){
return super.toString() + " : " + salary;
}
public double calcSalary(){ return salary * 12; }
}