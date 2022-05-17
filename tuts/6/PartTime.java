public class PartTime extends Employee{
private int weeklyHours;
private double hourlyRate;
public PartTime(int id, String name, int weeklyHours,
double hourlyRate) {
super(id, name);
this.weeklyHours = weeklyHours;
this.hourlyRate = hourlyRate;
}
public PartTime(PartTime pt){
super(pt);
this.weeklyHours = pt.weeklyHours;
this.hourlyRate = pt.hourlyRate;
}
public int getWeeklyHours() {
return weeklyHours;
}
public double getHourlyRate() {
return hourlyRate;
}
public String toString(){
return super.toString() + " : " + weeklyHours + " : "
+ hourlyRate;
}
public double calcSalary(){
return weeklyHours * hourlyRate * 4 * 12;
}
}