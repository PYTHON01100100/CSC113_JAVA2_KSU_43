public class PartTime extends Employee{
private int nbWorkHours;
private int rate;
public PartTime(String name, int id, int nbWorkHours, int rate) {
super(name, id);
this.nbWorkHours = nbWorkHours;
this.rate = rate;
}
public PartTime(PartTime pt){
super(pt);
this.nbWorkHours = pt.nbWorkHours;
this.rate = pt.rate;
}
public void display(){
super.display();
System.out.println("Number of work hours: " + nbWorkHours);
System.out.println("Rate of each hour: " + rate);
}
public double calculatePay(){
return nbWorkHours * 4 * rate;
}
public int getNbWorkHours() { return nbWorkHours; }
public int getRate() {return rate;}
}