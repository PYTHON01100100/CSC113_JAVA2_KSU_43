public class Company {
private String name;
private Employee [] arrEmp;
private int nbEmp;
public Company(String name, int size) {
this.name = name;
arrEmp = new Employee[size];
nbEmp = 0;
}
public int search(Employee e){
for(int i = 0; i < nbEmp; i++)
if(arrEmp[i].getId() == e.getId())
return i;
return -1;
}
public boolean addEmployee(Employee e){
if(search(e) != -1 || nbEmp == arrEmp.length)
return false;
if(e instanceof FullTime)
arrEmp[nbEmp++] = new FullTime((FullTime) e);
else
arrEmp[nbEmp++] = new PartTime((PartTime) e);
return true;
}
public Employee getMaxSalary(){
if(nbEmp == 0) return null;
Employee max = arrEmp[0];
for(int i = 1; i < nbEmp; i++)
if(arrEmp[i].calcSalary() > max.calcSalary())
max = arrEmp[i];
return max;
}
public int countPartTime(){
int count = 0;
for(int i = 0; i < nbEmp; i++)
if(arrEmp[i] instanceof PartTime)
count++;
return count;
}
public Employee[] getEmployees(int hours){
Employee temp[] = new Employee[countPartTime()];
int counter = 0;
for(int i = 0; i < nbEmp; i++){
if(arrEmp[i] instanceof PartTime
&& ((PartTime)arrEmp[i]).getWeeklyHours() > hours)
temp[counter++] = arrEmp[i];
}
return temp;
}
public int splitEmployees(FullTime FT[], PartTime PT[]){
int countFT = 0, countPT = 0;
for(int i = 0; i < nbEmp; i++){
if(arrEmp[i] instanceof FullTime)
FT[countFT++] = (FullTime) arrEmp[i];
else
PT[countPT++] = (PartTime) arrEmp[i];
}
return countPT;
}
}