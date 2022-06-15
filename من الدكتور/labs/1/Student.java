public class Student {
private String name;
private int id;
private int age;
private String gender;
public Student(String name, int id, int age, String gender) {
this.name = name;
this.id = id;
this.age = age;
this.gender = gender;
}
public String getName() {
return name;
}
public int getId() {
return id;
}
public int getAge() {
return age;
}
public String getGender() {
return gender;
}
public void display(){
	System.out.println("==================================================================================");
System.out.println("Student name: " + name);
System.out.println("Student id: " + id);
System.out.println("Student age: " + age);
System.out.println("Student gender: " + gender);
System.out.println("==================================================================================");
}
}