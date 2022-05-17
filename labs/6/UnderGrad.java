public class UnderGrad extends Student{
public UnderGrad(int id, String name, int size) {
super(id, name, size);
}
public UnderGrad(UnderGrad ug){
super(ug);
}
public double calcGPA(){
double average = getAverage();
if (average == -1) return -1;
return average / 20;
}
}