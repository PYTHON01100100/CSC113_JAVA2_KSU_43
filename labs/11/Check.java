public class Check extends Donation{
private String bankName;
public Check(double amount, String location, String donorName,
String bankName) {
super(amount, location, donorName);
this.bankName = bankName;
}
public Check(Check chk){
super(chk);
this.bankName = chk.bankName;
}
public String getBankName() {
return bankName;
}
public void display(){
super.display();
System.out.println("Bank name: " + bankName);
}
}