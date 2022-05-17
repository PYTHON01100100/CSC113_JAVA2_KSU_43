public class test {
public static void main(String[] args) {
// TODO Auto-generated method stub
PartTime e1 = new PartTime("Ahmad", 111, 6, 150);
PartTime e2 = new PartTime("Omar", 222, 10, 200);
PartTime e3 = new PartTime("Khalid", 333, 9, 150);
FullTime e4 = new FullTime("Mohammed", 444, 5000);
FullTime e5 = new FullTime("Ali", 555, 10000);
try{
Company c = new Company("KSU", 4);
try{
c.addEmployee(e1);
c.addEmployee(e2);
c.addEmployee(e3);
c.addEmployee(e4);
c.addEmployee(e5);
}catch(IllegalStateException e){
System.out.println(e.getMessage());
}
try{
c.deleteEmployee("Ahmad");
System.out.println("Delete done");
}catch(IndexOutOfBoundsException e){
System.out.println(e);
}
try{
System.out.println("Yearly pay of Omar: " + c.getYearlyPay("Omar"));
}catch(IndexOutOfBoundsException e){
System.out.println(e);
}
try{
System.out.println("Average PartTime: " + c.calAvgPayForPartTime());
}catch(ArithmeticException e){
System.out.println(e);
}
}catch(NegativeArraySizeException e){
e.printStackTrace();
}
}
}