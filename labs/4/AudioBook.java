public class AudioBook extends Book{
private int duration;
private String narrator;
public AudioBook(String title, String author,
int duration, String narrator) {
super(title, author);
this.duration = duration;
this.narrator = narrator;
}
public int getDuration() {
return duration;
}
public String getNarrator() {
return narrator;
}
@Override
public String toString() {
return super.toString() + ", Format: Audio, Duration: "
+ duration + ", Narrator: " + narrator;
}
}