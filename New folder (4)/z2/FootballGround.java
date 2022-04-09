
public class FootballGround extends PlayGround {
	private int goalsScored;
	public FootballGround(String name, int au,int nm, int gs) {
		super(name,nm,au);
		goalsScored=gs;
	}
	public int getGoalsScored() {
		return goalsScored;
	}
	
	
	
}
