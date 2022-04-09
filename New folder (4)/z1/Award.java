
public class Award {
	private String name ; 
	private int awradYear; 
	private double cash;
	public Award(String name, int awradYear,double cash){
		this.name=name;
		this.awradYear=awradYear;
		this.cash=cash;
	}
	public Award(Award a) {
		this.name=a.name;
		this.awradYear=a.awradYear;
		this.cash=a.cash;
	}

	public int getYear() {
		return awradYear;
	}
	public double getCash() {
		return cash;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCahs(double cash) {
		this.cash=cash;
	}
	
	
}
