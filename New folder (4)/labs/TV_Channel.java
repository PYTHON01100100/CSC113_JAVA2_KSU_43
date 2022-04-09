public class TV_Channel {
	protected int npg;
	private boolean live;
	private int views ;
	private TV_Program []arProg;
	public TV_Channel( boolean live, int views) {
		//this.npg = npg;
		this.live = live;
		this.views = views;
		this.arProg = new TV_Program[20];
		npg=0;
	}


	public TV_Channel(TV_Channel tc) {
		this.live = tc.live;
		this.views = tc.views;
		this.arProg=tc.arProg;
		this.arProg = new TV_Program[tc.arProg.length];
		for(int i=0;i<tc.npg;i++)
		{
			arProg[i] = new TV_Program(tc.arProg[i]);
		}
	}
	
	
	public boolean isLive() {
		return live;
	}
	public int getViews() {
		return views;
	}
	
	//public double CalculateRating(){
		
		
	//}
	public void display() { 
		System.out.println(views);
		System.out.println(live);

		for(int i=0; i<npg; i++) 
			arProg[i].display();	
	}
}


