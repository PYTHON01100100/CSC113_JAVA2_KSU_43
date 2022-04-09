
public class PlayGround {
	private String name;
	private int audCapacity, nMatchesPlayed;
	public PlayGround(String name, int nMatchesPlayed, int audCapacity) {
		this.audCapacity=audCapacity;
		this.nMatchesPlayed=nMatchesPlayed;
		this.name=name;
	}
	public PlayGround(PlayGround p) {
		this.audCapacity=p.audCapacity;
		this.nMatchesPlayed=p.nMatchesPlayed;
		this.name=p.name;
	}
	public int getAudCapacity() {
		return audCapacity;
	}
	public int getNMatchesPlayed() {
		return nMatchesPlayed;
	}
}
