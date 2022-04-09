
public class CitySportsClub {
	private String cityName;
	private PlayGround arGrounds[];
	private int nbg;
	public CitySportsClub(String cityName,int size){
	this.cityName=cityName;
	arGrounds=new PlayGround[size];
	nbg=0;
	}
	public CitySportsClub(CitySportsClub c){
		this.cityName=c.cityName;
		this.arGrounds=new PlayGround[c.arGrounds.length];
		this.nbg=c.nbg;
		for(int i=0;i<c.nbg;i++) {
			if(arGrounds[i] instanceof FootballGround)
				arGrounds[i]=new PlayGround((FootballGround) c.arGrounds[i]);
			else if(arGrounds[i] instanceof CricketGround)
				arGrounds[i]=new PlayGround((CricketGround) c.arGrounds[i]);
			else
				arGrounds[i]=new PlayGround(c.arGrounds[i]);
		}
		
		}
		
	
	
}
