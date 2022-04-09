public class Contact {
	private String name;
	private String number;
	
	
	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public boolean equals2(Object obj) {
		if(this == obj)
			return true;
			if(obj == null)
			return false;
			Contact temp;
			if(obj instanceof Contact)
			// OR if(this.getClass() == obj.getClass())
			temp = (Contact) obj;
			else
			return false;
			if(this.number.equalsIgnoreCase(temp.number)
			&& this.name.equalsIgnoreCase(temp.name))
			return true;
			return false;
		}
	public boolean equals(Contact c) {
		return (this.name.equalsIgnoreCase(c.name)&&this.number.equalsIgnoreCase(c.number));
		}
	
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + "]\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
