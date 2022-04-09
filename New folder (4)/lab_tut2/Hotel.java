public class Hotel {
private String name;
private Guest arrGuests[];
private int nbg;
public Hotel(String name, int size){
this.name = name;
arrGuests = new Guest[size];
nbg = 0;
}
public boolean addGuest(Guest g) {
	//this method adds a guest to the hotel. It returns true if the
	//Guest g is added; false otherwise
	if(nbg==arrGuests.length) {
		return false;
	}
	else {
		arrGuests[nbg]=g;
		nbg++;
		return true;
	}
}
public int countGuest(String n) {
	//this method returns the oldest guest of the hotel.
	int c=0;
	for(int i=0;i<nbg;i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase(n));
		c++;
	}
	return c;
}

public Guest getOldestGuest() {
	//this method returns the oldest guest of the hotel.

	Guest oldest=null;
	for(int i=0;i<nbg;i++) {
		if(oldest==null||arrGuests[i].getAge()>oldest.getAge()) {
			oldest =arrGuests[i];
		}
	}
	return oldest;
}
public Guest[] getGuests(String n) {
	//this method returns an array containing all guests of the hotel
		//who are of nationality n.
	int size=0;
	int c=0;
	for(int i=0;i<nbg;i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase(n))
		size++;
	}
	
	Guest temp[]=new Guest[size];
	
	for(int i=0;i<nbg;i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase(n))
			temp[c++]=arrGuests[i];
	}
	return temp;
}

public Guest[] getGuests1(String n) {
	//this method returns an array containing all guests of the hotel
		//who are of nationality n.
	int size=0;
	int c=0;
	for(int i=0;i<nbg;i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase(n))
		size++;
	}
	
	Guest temp[]=new Guest[size];
	
	for(int i=0;i<nbg;i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase(n))
			temp[c++]=arrGuests[i];
	}
	return temp;
}

public int splitGuests(Guest saudi[],Guest expat[]) {
	//this method returns an array containing all guests of the hotel
		//who are of nationality n.
	int countS = 0;
	int countE = 0;
	for(int i = 0; i < nbg; i++) {
	if(arrGuests[i].getNationality().equalsIgnoreCase("Saudi"))
	saudi[countS++] = arrGuests[i];
	else
	expat[countE++] = arrGuests[i];
	}
	return countE;
	/*
	int size=0;
	int c=0;
	int c2=0;
	for(int i=0;i<nbg;i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase("saudi"))
			size++;
	}
	 saudi=new Guest[size];
	 expat=new Guest[nbg-size];
	 
	for(int i=0;i<nbg;i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase("saudi")) {
			saudi[c++]=arrGuests[i];
		}
		else {
			expat[c2++]=arrGuests[i];
		}
	}
	return nbg-size;
	*/
}






























}
