public class Sports extends TV_Channel{
private int nbMatches;
public Sports(int views, boolean live, int nbMatches) {
super(views, live);
this.nbMatches = nbMatches;
}
public int getNbMatches() {
return nbMatches;
}
public double calculateRatings(){
if(nbMatches == 0) return -1;
return getViews() / nbMatches * 1.5;
}
@Override
public void display(){
super.display();
System.out.println("Number of matches: " + nbMatches);
}
}