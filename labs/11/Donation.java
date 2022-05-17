import java.io.Serializable;
public class Donation implements Serializable{
private double amount;
private String location;
private String donorName;
public Donation(double amount, String location, String donorName) {
this.amount = amount;
this.location = location;
this.donorName = donorName;
}
public Donation(Donation d){
this.amount = d.amount;
this.location = d.location;
this.donorName = d.donorName;
}
public double getAmount() throws Exception{
if(amount < 0)
throw new Exception("Amount is negative!");
return amount;
}
public String getDonorName() {
return donorName;
}
public void display(){
System.out.println("Amount: " + amount);
System.out.println("Location: " + location);
System.out.println("Donor name: " + donorName);
}
}
