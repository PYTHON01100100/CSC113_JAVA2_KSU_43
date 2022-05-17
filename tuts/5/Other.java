public class Other extends Ministry{
public Other(String name, int nbEmployees){
super(name,nbEmployees);
}
public double calcBudget(){
return nbEmployees * 10000;
}
}