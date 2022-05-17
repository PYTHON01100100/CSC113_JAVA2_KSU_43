public class Administrative extends Ministry{
private double balance;
public Administrative(String name, int nbEmployees, double balance) {
super(name, nbEmployees);
this.balance = balance;
}
public double getBalance() {return balance;}
public double calcBudget(){
return nbEmployees * 10000 - balance;
}
@Override
public void display(){
super.display();
System.out.println("Balance: " + balance);
}
}