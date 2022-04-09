
public class News extends TV_Channel {
private int newsSegments;
private int breakingNews;
public News(boolean live, int views, int newsSegments, int breakingNews) {
	super(live, views);
	this.newsSegments = newsSegments;
	this.breakingNews = breakingNews;
}
public News(News n) {
	super(n);
	this.newsSegments = n.newsSegments;
	this.breakingNews = n.breakingNews;
}
public int getNewsSegments() {
	return newsSegments;
}
public int getBreakingNews() {
	return breakingNews;
}

	
	
}
