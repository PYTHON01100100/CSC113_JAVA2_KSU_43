
public class Test {

	public static void main(String[] args) {
		Hotel h = new Hotel("Mariott", 300);
		h.addGuest(new Guest(1, "Ahmad", "Saudi", 22));
		h.addGuest(new Guest(2, "Khalid", "Saudi", 28));
		h.addGuest(new Guest(3, "Omar", "Kuwait", 25));
		h.addGuest(new Guest(4, "Mohammed", "UAE", 21));
		h.addGuest(new Guest(5, "ALI", "USA", 40));
		h.addGuest(new Guest(6, "francua", "France", 40));
		h.addGuest(new Guest(7, "winston", "UK", 40));
		int NofS=h.countGuests("Saudi");
		int NofNonS=(h.countg()-NofS);
		System.out.println("Number of UAE guests: "+ h.countGuests("UAE"));
		System.out.println("Oldest guest: ");
		h.getOldestGuest().displayGuestInfo();
		System.out.println("Guests from Kuwait: ");
		Guest [] kuwait = h.getGuests("Kuwait");
		for(int i = 0; i < kuwait.length; i++)
		kuwait[i].displayGuestInfo();
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		Guest [] saudi = new Guest[NofS];
		Guest [] expat = new Guest[NofNonS];
		int nbExpat = h.splitGuests(saudi, expat);
		System.out.println("Saudi Guests: ");
		for(int i = 0; i < saudi.length; i++)
		saudi[i].displayGuestInfo();
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("Non Saudi Guests: ");
		for(int i = 0; i < expat.length; i++)
		expat[i].displayGuestInfo();
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Number of Non-Saudi guests: "+ nbExpat);
		System.out.println("Number of Saudi guests: "+ (NofS));
		}

	}
