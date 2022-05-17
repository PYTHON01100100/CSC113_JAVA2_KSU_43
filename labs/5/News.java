public class News extends TV_Channel{
private int newsSegments;
private int breakingNews;
public News(int views, boolean live, int newsSegments, int breakingNews) {
super(views, live);
this.newsSegments = newsSegments;
this.breakingNews = breakingNews;
}
public int getBreakingNews() { return breakingNews; }
public double calculateRatings(){
if(breakingNews == 0 || nbProg == 0) return -1;
double sum = 0;
for(int i = 0; i < nbProg; i++)
sum += arProg[i].getAudienceRate();
return getViews()/breakingNews + sum/nbProg;
}
@Override
public void display(){
super.display();
System.out.println("News Segments: " + newsSegments);
System.out.println("Breaking News: " + breakingNews);
}
}