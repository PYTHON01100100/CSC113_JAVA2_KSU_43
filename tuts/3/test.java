public class test {
public static void main(String[] args) {
// TODO Auto-generated method stub
Group g1 = new Group("CSC113", 20);
Group g2 = new Group("CSC111", 25);
g1.addContact(new Contact("Ali", "111"));
g1.addContact(new Contact("Ahmad", "222"));
g1.addContact(new Contact("Khalid", "333"));
g1.addContact(new Contact("Omar", "444"));
g2.addContact(new Contact("Mohammed", "111"));
g2.addContact(new Contact("Faisal", "222"));
Contact c = new Contact("Ahmad", "222");
g1.removeContact(c);
System.
out.println("--------Contact at position 2:------");
g1.printContactAt(2);
System.
out.println("--------G1 info:---------");
System.
out.println(g1);
Contact [] temp = g2.concat(g1);
System.
out.println("--------G1 + G2 Contacts:---------");
for(int i = 0; i < temp.length; i++)
System.
out.println(temp[i]);
}
}