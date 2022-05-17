public class AdvancedCounter extends counter{
private int amount;
public AdvancedCounter(int value, int amount) {
super(value);
this.amount = amount;
}
@Override
public void increment(){
count += amount;
}
}