public class test3 {
public static void main(String [] args) {
//Create objects of class "Guest"
Guest g0 = new Guest(000, "Ahmad", "Saudi", 25);
Guest g1 = new Guest(111, "Khalid", "Saudi", 23);
Guest g2 = new Guest(333, "Saif", "UAE", 26);
Guest g3 = new Guest(444, "Abdullah", "Kuwait", 22);
//Create object of class "Hotel"
Hotel h1 = new Hotel("Marriott",100);
//Adding "Guest" objects to the "Hotel" object
if(h1.addGuest(g0))
System.out.println(g0.getName() + " has been added successfully");
else
System.out.println("Hotel is full");
if(h1.addGuest(g1))
System.out.println(g1.getName() + " has been added successfully");
else
System.out.println("Hotel is full");
if(h1.addGuest(g2))
System.out.println(g2.getName() + " has been added successfully");
else
System.out.println("Hotel is full");
if(h1.addGuest(g3))
System.out.println(g3.getName() + " has been added successfullys");
else
System.out.println("Hotel is full");
System.out.println("------------------------");
//test "countGuests" method
System.out.println("Number of Saudi guests: " + h1.countGuests("Saudi"));
System.out.println("Number of UAE guests: " + h1.countGuests("UAE"));
System.out.println("Number of Kuwaiti guests: " + h1.countGuests("Kuwait"));
System.out.println("Number of Bahraini guests: "+ h1.countGuests("Bahrain"));
System.out.println("------------------------");
//test "getOldest" method
System.out.println("Oldest Guest:");
Guest oldest = h1.getOldestGuest();
oldest.displayGuestInfo();
System.out.println("------------------------");
//test "getGuests" method
System.out.println("All Kuwaiti guests:");
Guest temp[] = h1.getGuests("Kuwait");
for(int i = 0; i < temp.length; i++) {
temp[i].displayGuestInfo();
}
System.out.println("------------------------");
//test "splitGuests" method
Guest saudi[] = new Guest[2];
Guest expat[] = new Guest[2];
int nbExpat = h1.splitGuests(saudi, expat);
System.out.println("All Saudi guests:");
for(int i = 0; i < saudi.length; i++)
saudi[i].displayGuestInfo();
System.out.println("All non-Saudi guests:");
for(int i = 0; i < expat.length; i++)
expat[i].displayGuestInfo();
System.out.println("Number of non-Saudi guests: " + nbExpat);
}
}