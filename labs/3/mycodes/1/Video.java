public class Video {
private int id;
private String title;
private int duration;
private Category category;
public Video(int id, String title, int duration, Category category) {
this.id = id;
this.title = title;
this.duration = duration;
this.category = category;
}
public int getDuration(){
return duration;
}
public Category getCategory() {
return category;
}
public boolean equals(Object obj){
if(this == obj)
return true;
if(obj == null)
return false;
Video temp;
if(obj instanceof Video)
temp = (Video) obj;
else
return false;
if(this.id == temp.id)
return true;
return false;
}
@Override
public String toString() {
return "Video [id=" + id + ", title=" + title+ ", duration=" + duration + ", category=" + category + "]";
}
}