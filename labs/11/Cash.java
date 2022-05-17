public class Cash extends Donation{
private String currency;
public Cash(double amount, String location, String donorName,
String currency) {
super(amount, location, donorName);
this.currency = currency;
}
public Cash(Cash csh){ super(csh); this.currency = csh.currency; }
public String getCurrency() { return currency; }
public void display(){
super.display();
System.out.println("Currency: " + currency);
}
}