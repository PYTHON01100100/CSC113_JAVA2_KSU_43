public class Test {
public static void main(String[] args) {
Channel c1 = new Channel("KSU", 10);
Playlist p1 = new Playlist("CCIS", true, 15);
p1.addVideo(new Video (1, "CCIS_Seminar", 350, Category.EDUCATION));
p1.addVideo(new Video (2, "CCIS_Football", 200, Category.SPORTS));
p1.addVideo(new Video (3, "CCIS_Public_Lecture", 300, Category.EDUCATION));
p1.removeVideo(new Video (3, "CCIS_Public_Lecture", 300, Category.EDUCATION));
c1.addPlaylist(p1);
Playlist p2 = new Playlist("Business", false, 10);
p2.addVideo(new Video (1, "Bussiness_Tennis_Tournament", 800, Category.SPORTS));
p2.addVideo(new Video (2, "Bussiness_Comedy_Club", 400, Category.COMEDY));
p2.addVideo(new Video (3, "Bussiness_Seminar", 200, Category.EDUCATION));
c1.addPlaylist(p2);
Playlist p3 = new Playlist("Engineering", true, 20);
p3.addVideo(new Video (1, "ENG_Field_Work", 300, Category.OTHER));
p3.addVideo(new Video (2, "ENG_Gaming_Competition", 700, Category.ENTERTAINMENT));
c1.addPlaylist(p3);
c1.sortPlaylists();
//c1.flipShared(p2);
//c1.flipSharedStatusOf(p2);
Playlist temp = c1.getPlaylist(Category.ENTERTAINMENT);
System.out.println("Channel Info:");
System.out.println(c1.toString());
System.out.println("Playlist with the most ENTERTAINMENT videos is:");
System.out.println(temp);
}
}