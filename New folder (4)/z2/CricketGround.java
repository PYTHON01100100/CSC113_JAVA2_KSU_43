
public class CricketGround extends PlayGround {
	private int runsScored; 
	public CricketGround(String n,int nm, int au, int r) {
		super(n,nm,au);
		runsScored=r;
	}
	public int getRunsScored() {
		return runsScored;
	}
	

}
