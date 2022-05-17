public class Executive extends Ministry{
private double expenses;
public Executive(String name, int nbEmployees, double expenses) {
super(name, nbEmployees);
this.expenses = expenses;
}
public double getExpenses() { return expenses; }
public double calcBudget(){
return expenses + nbEmployees * 1.5;
}
@Override
public void display(){
super.display();
System.out.println("Expenses: " + expenses);
}
}