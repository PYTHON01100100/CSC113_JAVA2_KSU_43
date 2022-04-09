
public class Sports extends TV_Channel {
	
	private int nbMaches;

	public Sports(boolean live, int views, int nbMaches) {
		super(live, views);
		this.nbMaches = nbMaches;
	}
	public Sports(Sports s){
		super(s);
		this.nbMaches = s.nbMaches;
	}

	public int getNbMaches() {
		return nbMaches;
	}
	
}
