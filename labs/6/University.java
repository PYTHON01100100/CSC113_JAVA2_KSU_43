public class University {
private String name;
private Student [] students;
private int nbStudents;
public University(String name, int size) {
this.name = name;
students = new Student[size];
nbStudents = 0;
}
public int search(Student s){
for(int i = 0; i < nbStudents; i++)
if(students[i].getId() == s.getId())
return i;
return -1;
}
public boolean addStudent(Student s){
if(search(s) != -1 || nbStudents >= students.length)
return false;
if(s instanceof UnderGrad)
students[nbStudents++] = new UnderGrad((UnderGrad) s);
else
students[nbStudents++] = new Graduate((Graduate) s);
return true;
}
public boolean removeStudent(Student s){
int index = search(s);
if(index == -1) return false;
students[index] = students[nbStudents-1];
students[nbStudents-1] = null;
nbStudents--;
return true;
}
public Student getMaxGPA(){
if(nbStudents == 0) return null;
Student max = students[0];
for(int i = 1; i < nbStudents; i++)
if(students[i].calcGPA() > max.calcGPA())
max = students[i];
return max;
}
public int getNumberOfGrad(){
int count = 0;
for(int i = 0; i < nbStudents; i++)
if(students[i] instanceof Graduate)
count++;
return count;
}
public void splitStudents(Graduate [] grad, UnderGrad [] underGrad){
int countG = 0, countUG = 0;
for(int i = 0; i < nbStudents; i++)
if(students[i] instanceof Graduate)
grad[countG++] = (Graduate) students[i];
else
underGrad[countUG] = (UnderGrad) students[i];
}
public Student[] getStudents(int hours){
Student temp[] = new Student[getNumberOfGrad()];
int count = 0;
for(int i = 0; i < nbStudents; i++)
if(students[i] instanceof Graduate
&& ((Graduate)students[i]).getResearchHours() > hours)
temp[count++] = students[i];
return temp;
}
}