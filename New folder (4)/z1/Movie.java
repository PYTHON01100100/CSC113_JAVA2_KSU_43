public class Movie {
	private Award arrAwards[];
	private int nba;
	private String name;
	private int year;
	public Movie(String name, int year, int size) {
		this.name=name;
		this.year=year;
		arrAwards =new Award[size];
		nba=0;
	}
	public boolean addAward(Award a) {
		if(nba==arrAwards.length)
			return false;
		else {
			arrAwards[nba++]=new Award(a);
			return true;
		}
		
	}
	
	public int computeTotalCash(int y) {
		int sum=0;
		for(int i=0;i<nba;i++)
			if(arrAwards[i].getYear()==y)
				sum+=arrAwards[i].getCash();
		
		return sum;
		
		
	}
	public Award getHighestAward() {
		Award a=null;
		for(int i=0;i<nba;i++)
			if(a==null||arrAwards[i].getCash()>a.getCash())
				a=arrAwards[i];
		
		
		return a;
	}
	
	
	public int getYear() {
		//System.out.println();
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	
	
}
