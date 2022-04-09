public class TV_Program {
	private double audienceRate;

	public TV_Program(double audienceRate) {

		this.audienceRate = audienceRate;
	}
	public TV_Program(TV_Program tp) {
		this.audienceRate = tp.audienceRate;
	}
	
	
	public double getAudienceRate() {
		return audienceRate;
	}
	public void setAudienceRate(double audienceRate) {
		this.audienceRate = audienceRate;
	}
	@Override
	public String toString() {
		return "TV_Program [audienceRate=" + audienceRate + "]";
	}
	
	public void display()
	{
		
		System.out.println("Audience Rate: "+audienceRate);
	}

	

	

}
