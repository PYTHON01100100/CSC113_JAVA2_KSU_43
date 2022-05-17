
public abstract class Employee {
private int id;
private String name;
public Employee(int id, String name) {
this.id = id;
this.name = name;
}
public Employee(Employee e){
this.id = e.id;
this.name = e.name;
}
public int getId() {
return id;
}
public String getName() {
return name;
}
public abstract double calcSalary();
public String toString(){
return id + " : " + name;
}
}