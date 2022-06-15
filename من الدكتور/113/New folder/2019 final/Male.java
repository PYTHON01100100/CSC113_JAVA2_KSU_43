public class Male extends Player {
private int age;
public Male(int id, String name, double weghitSe, double hight,
int age) {
super(id, name, weghitSe, hight);
this.age = age;
}
public int getAge() {
return age;
}
@Override
public double getTBW() {
return 2.447-(0.09156*age)+(0.1074*hight)+(0.3362*weghitSe);
}
}