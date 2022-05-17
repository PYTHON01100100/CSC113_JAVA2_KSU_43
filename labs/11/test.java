import java.io.*;
public class test {
public static void main(String[] args) {
// TODO Auto-generated method stub
CharityAssociation CA = new CharityAssociation("KSU", 3);
CA.addDonation(new Cash(100, "Riyadh", "Ahmad", "Riyal"));
CA.addDonation(new Cash(150, "Jeddah", "Ali", "Dollar"));
CA.addDonation(new Check(80, "Riyadh", "Khalid", "Rajhi"));
try {
CA.saveToFile("Cash.data", "Ahmad");
} catch (IOException e) {
System.out.println(e);
}
try {
CA.saveAll("donations.data");
} catch (IOException e) {
System.out.println(e);
}
Check [] chks = new Check[1];
try {
CA.loadFromFile("donations.data", chks);
} catch (IOException e) {
System.out.println(e);
}
chks[0].display();
}
}