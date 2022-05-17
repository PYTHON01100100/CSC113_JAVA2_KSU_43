public class Company {
private String name;
private Employee[] arrEmployee;
private int nbEmployee;
public Company(String name, int size) throws NegativeArraySizeException{
if(size < 0) throw new NegativeArraySizeException();
this.name = name; arrEmployee = new Employee[size];
nbEmployee = 0;
}
public void displayAll(){
for(int i = 0; i < nbEmployee; i++) arrEmployee[i].display();
}
public void addEmployee(Employee e) throws IllegalStateException{
if(nbEmployee >= arrEmployee.length)
throw new IllegalStateException("Array is full!");
if(e instanceof PartTime)
arrEmployee[nbEmployee++] = new PartTime((PartTime) e);
else arrEmployee[nbEmployee++] = new FullTime((FullTime) e);
}
private int searchName(String name){
for(int i = 0; i < nbEmployee; i++)
if(arrEmployee[i].getName().equalsIgnoreCase(name)) return i;
return -1;
}
public void deleteEmployee(String name) throws IndexOutOfBoundsException{
int index = searchName(name);
if(index == -1) throw new IndexOutOfBoundsException();
arrEmployee[index] = arrEmployee[nbEmployee-1];
arrEmployee[nbEmployee-1] = null; nbEmployee--;
}
public double getYearlyPay(String name) throws IndexOutOfBoundsException{
int index = searchName(name);
if(index == -1) throw new IndexOutOfBoundsException();
return arrEmployee[index].calculatePay() * 12;
}
public double calAvgPayForPartTime() throws ArithmeticException{
int countPT = 0; double sum = 0;
for(int i = 0; i < nbEmployee; i++)
if(arrEmployee[i] instanceof PartTime){
countPT++;
sum += arrEmployee[i].calculatePay();
}
if(countPT == 0) throw new ArithmeticException("/ by zero");
return sum/countPT;
}
}