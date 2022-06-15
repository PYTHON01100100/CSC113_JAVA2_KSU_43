public class Test2 {
	public static void main(String [] args){
		Hotel h = new Hotel("Mariott", 300);
		h.addGuest(new Guest(1, "Ahmad", "Saudi", 22));
		h.addGuest(new Guest(2, "Khalid", "Saudi", 28));
		h.addGuest(new Guest(1, "Omar", "Kuwait", 25));
		h.addGuest(new Guest(1, "Mohammed", "UAE", 21));
		System.out.println("Number of UAE guests: "+ h.countGuests("UAE"));
		System.out.println("Oldest guest: ");
		h.getOldestGuest().displayGuestInfo();
		System.out.println("Guests from Kuwait: ");
		Guest [] kuwait = h.getGuests("Kuwait");
		for(int i = 0; i < kuwait.length; i++)
		kuwait[i].displayGuestInfo();
		Guest [] saudi = new Guest[2];
		Guest [] expat = new Guest[2];
		int nbExpat = h.splitGuests(saudi, expat);
		System.out.println("Saudi Guests: ");
		for(int i = 0; i < saudi.length; i++)
		saudi[i].displayGuestInfo();
		System.out.println("Non Saudi Guests: ");
		for(int i = 0; i < expat.length; i++)
		expat[i].displayGuestInfo();
		System.out.println("Number of Non-Saudi guests: "+ nbExpat);
		}
}