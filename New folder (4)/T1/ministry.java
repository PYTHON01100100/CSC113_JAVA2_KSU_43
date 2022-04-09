
public abstract class ministry implements Finance {
	private String name;
	protected int nbe;
	public ministry(String nn,int n) {
		name=nn;
		nbe=n;
	}
	public ministry(ministry m) {
		this.name=m.name;
		this.nbe=m.nbe;
	}
	
	public void display() {
		System.out.println(nbe+"----"+name);
	}
	public int getNbe() {
		return nbe;
	}
	public String getName() {return name;}

}
