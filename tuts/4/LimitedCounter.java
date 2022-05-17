public class LimitedCounter extends counter {
private int limit;
private int start;
public LimitedCounter(int value, int limit){
super(value);
this.limit = limit;
}
@Override
public void increment(){
if(count == limit)
System.out.println(" limit has been reached");
else
count++;
}
}