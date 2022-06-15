import java.io.*;
import java.security.InvalidParameterException;
public abstract class Player implements Serializable {
private int id;
private String name;
protected double weghitSe;
protected double hight;
Result arRes[];
private int counter;
public Player(int id, String name, double weghitSe, double hight)
{
this.id = id;
this.name = name;
this.weghitSe = weghitSe;
this.hight = hight;
arRes= new Result[200];
counter=0;
}
public abstract double getTBW();
public boolean addresult( Result r) throws Exception {
if(arRes.length>=counter) {
throw new ArrayIndexOutOfBoundsException("full");
}
if(r.getScore()<0) {
throw new InvalidParameterException("invaild score");
}
if(arRes.length<counter&&r.getScore()>=0) {
arRes[counter++]= new Result(r);
return true;}
return false;
}
public double gethaihestScore (String d) {
double max=0;
for(int i=0; i<counter;i++)
if(arRes[i].getScore()>max&&arRes[i].getDate().equalsIgnoreCase(d
))
max= arRes[i].getScore();
return max;
}
}