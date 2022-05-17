public abstract class Student {
private int id;
private String name;
protected Course courses[];
protected int nbCourses;
public Student(int id, String name, int size) {
this.id = id;
this.name = name;
courses = new Course[size];
nbCourses = 0;
}
public Student(Student s){
this.id = s.id;
this.name = s.name;
courses = new Course[s.courses.length];
for(int i = 0; i < s.nbCourses; i++){
this.courses[i] = s.courses[i];
}
this.nbCourses = s.nbCourses;
}
public boolean addCourse(Course c){
if(nbCourses == courses.length)
return false;
courses[nbCourses++] = new Course(c);
return true;
}
public int getId() {
return id;
}
public String getName() {
return name;
}
public abstract double calcGPA();
public double getAverage(){
if(nbCourses == 0) return -1;
double sum = 0;
for(int i = 0; i < nbCourses; i++)
sum += courses[i].getGrade();
return sum / nbCourses;
}
public String toString(){
return "ID: " + id + ", Name: " + name;
}
}