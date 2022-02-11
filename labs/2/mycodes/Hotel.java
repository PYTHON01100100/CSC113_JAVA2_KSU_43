public class Hotel {
private Guest arrGuests[];
private int nbg;
private String hotelName;
public Hotel(String hotelName,int size ){
	this.hotelName =hotelName;
	arrGuests = new Guest[size];
	nbg = 0;
}
public boolean addGuest(Guest g)
{
	if(nbg < arrGuests.length)
	{
		arrGuests[nbg] = g;
		nbg++;
		return true;
	}
	else
		return false;
}
public int countGuests(String n) {
	int count=0;
	for(int i=0;i<nbg;i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase(n))
			count+=1;
		}
	return count;
}

public Guest getOldestGuest(){
	Guest oldest = arrGuests[0];
	for(int i = 1; i < nbg; i++) {
		if(arrGuests[i].getAge() > oldest.getAge())
			oldest = arrGuests[i];
		}
	/*
	 Guest oldest = null;
	 for(int i = 0; i < nbg; i++){
	 if(oldest == null ||arrGuests[i].getAge() > oldest.getAge())
	 oldest = arrGuests[i];
	 }
	 
	 */
return oldest;
}
public Guest[] getGuests(String n){
	int size = countGuests(n);
	Guest [] temp = new Guest[size];
	int counter = 0;
	for(int i = 0; i < nbg; i++){
		if(arrGuests[i].getNationality().equalsIgnoreCase(n))
			temp[counter++] = arrGuests[i];
		}
	return temp;
}
public int splitGuests(Guest [] saudi, Guest expat[]){
	int countS = 0, countE = 0;
	for(int i = 0; i < nbg; i++) {
		if(arrGuests[i].getNationality().equalsIgnoreCase("Saudi"))
			saudi[countS++] = arrGuests[i];
		else
			expat[countE++] = arrGuests[i];
	}
	return countE;
}
public int countg() {
	int count=0;
	for(int i=0;i<nbg;i++) {
			count+=1;
		}
	return count;
}
}