public class Employee {
private int id;
private String name;
private String gender;
private int age;
public Employee(int id, String name, String gender, int age) {
this.id = id;
this.name = name;
this.gender = gender;
this.age = age;
}
public int getId() {
return id;
}
public String getName() {
return name;
}
public String getGender() {
return gender;
}
public int getAge() {
return age;
}
public void display(){
System.out.println("Employee id: " + id);
System.out.println("Employee name: " + name);
System.out.println("Employee gender: " + gender);
System.out.println("Employee age: " + age);
}
}