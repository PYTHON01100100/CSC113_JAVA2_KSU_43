import java.util.Arrays;
public class Group {
	private String name;
	private Contact contacts[];
	private int nbc;
	public Group(String name, int size) {
		this.name = name;
		contacts=new Contact[size];
		nbc=0;
	}
	public boolean addContact(Contact c)
	{
		//a contact to the group if there’s space
		if(nbc==contacts.length) {
			return false;
		}
		else {
			contacts[nbc++]=c;
			return true;
		}
	}
	public boolean removeContact(Contact c) {
		// removes a contact from the group if it’s
		//there by replacing it with the last contact in the group
		for(int i=0;i<nbc;i++) {
			if(c.getName().equalsIgnoreCase(contacts[i].getName())&&c.getNumber().equalsIgnoreCase(contacts[i].getNumber())) {
					contacts[i]=contacts[nbc-1];
					contacts[nbc-1]=null;
					nbc--;
					return true;
		}
			
		}
		return false;
	}
	
	public boolean removeContact2(Contact c) {
		// removes a contact from the group if it’s
		//there by replacing it with the last contact in the group
		for(int i=0;i<nbc;i++) {
			if(contacts[i].equals(c)) {
					contacts[i]=contacts[nbc-1];
					contacts[nbc-1]=null;
					nbc--;
					return true;
		}
			
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void printContactAt(int position) {
		//prints the information of the contact at a
		//certain position (e.g. first contact, second, etc)
		if(position>0 && position<=nbc) {
			System.out.println(contacts[position-1]);
	 
		}
		else {
			
			System.out.println("Wrong index");
		}
	}
	public String toString(){
		//this method returns a string representation of the group
		String temp = "Name: " + name;
		temp += "\nContacts: \n";
		for(int i = 0; i < nbc; i++)
		temp += contacts[i].toString() + "\n";
		return temp;
		}
	public String toString2(){
		//this method returns a string representation of the group
		return  "Name: " + name + "\nContacts: \n"+ Arrays.toString( contacts) ;
		}
	public Contact[] concat(Group g){
		//: concatenates the contact list of the two groups into
				//one list and returns it
		Contact temp[] = new Contact[nbc + g.nbc];
		int counter = 0;
		for(int i = 0; i < nbc; i++)
		temp[counter++] = contacts[i];
		for(int i = 0; i < g.nbc; i++)
		temp[counter++] = g.contacts[i];
		return temp;
		}
	
}
