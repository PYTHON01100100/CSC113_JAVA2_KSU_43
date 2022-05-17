public abstract class Ministry implements Finance{
private String name;
protected int nbEmployees;
public Ministry(String name, int nbEmployees) {
this.name = name;
this.nbEmployees = nbEmployees;
}
public String getName() {
return name;
}
public int getNbEmployees() {
return nbEmployees;
}
public abstract double calcBudget();
public void display(){
System.out.println("Name: " + name
+ "\nNbEmployees: " + nbEmployees);
}
}