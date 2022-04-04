
public class College {
	private String name;
	private Project arp[];
	private int nbp;
	public College(String n) {
		name=n;
		nbp=0;
		arp=new Project[20];
	}
	public boolean addproject(Project p) {
		if(nbp==arp.length)
			return false;
		arp[nbp++]=new Project(p);
		return true;
		
	}
}
