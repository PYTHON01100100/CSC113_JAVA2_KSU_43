public class counter {
protected int start;
protected int count;
public counter(int value){
start = value;
count = start;
}
public void increment(){
count++;
}
public void reset(){
count = start;
}
public String toString(){
return "(" + count + ")";
}
}