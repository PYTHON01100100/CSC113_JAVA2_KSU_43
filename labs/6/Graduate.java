public class Graduate extends Student{
private int researchHours;
public Graduate(int id, String name, int size, int researchHours) {
super(id, name, size);
this.researchHours = researchHours;
}
public Graduate(Graduate g){
super(g);
this.researchHours = g.researchHours;
}
public int getResearchHours() {
return researchHours;
}
public String toString(){
return super.toString() + ", Research hours completed: "
+ researchHours;
}
public double calcGPA(){
double average = getAverage();
if (average == -1) return -1;
return average / 25 + researchHours * 0.05;
}
}