public abstract class Employee {
private String name;
private int id;
public Employee(String name, int id) {
this.name = name;
this.id = id;
}
public Employee(Employee e){
this.name = e.name;
this.id = e.id;
}
public String getName() {
return name;
}
public int getId() {
return id;
}
public void display(){
System.out.println("Employee name: " + name);
System.out.println("Employee id: " + id);
}
public abstract double calculatePay();
}