public class TV_Program {
private double audienceRate;
public TV_Program(double audienceRate) {
this.audienceRate = audienceRate;
}
public TV_Program(TV_Program tvP){
this.audienceRate = tvP.audienceRate;
}
public double getAudienceRate() {
return audienceRate;
}
public void display(){
System.out.println("Audience Rate: " + audienceRate);
}
}