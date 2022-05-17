public class test {
public static void main(String[] args) {
// TODO Auto-generated method stub
counter c1 = new counter(0);
AdvancedCounter c2 = new AdvancedCounter(0, 3);
LimitedCounter c3 = new LimitedCounter(0,3);
c1.increment();
c2.increment();
c3.increment();
System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
c3.increment();
c3.increment();
c3.increment();
System.out.println(c3);
c3.reset();
System.out.println(c3);
}
}