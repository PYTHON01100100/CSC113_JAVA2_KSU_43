import java.util.Arrays;
public class Playlist {
private String name;
private boolean shared;
private Video videos[];
private int nbVid;
public Playlist(){
videos = new Video[0];
}
public Playlist(Playlist p){ 
	//Copy constructor
	this.name = p.name;
	this.shared = p.shared;
	this.videos = new Video[p.videos.length];
	for(int i = 0; i < p.nbVid; i++)
		this.videos[i] = p.videos[i];
	this.nbVid = p.nbVid;
}
public Playlist(String name, boolean shared, int size){
	this.name = name;
	this.shared = shared;
	videos = new Video[size];
	nbVid = 0;
}
public int getIndexOf(Video v){
for(int i = 0; i < nbVid; i++)
if(videos[i].equals(v))
return i;
return -1;
}
public boolean addVideo(Video v){
int index = getIndexOf(v);
if(index != -1 || nbVid == videos.length)
return false;
videos[nbVid++] = v;
return true;
}
public boolean removeVideo(Video v){
int index = getIndexOf(v);
if(index == -1) return false;
for(int i = index; i < nbVid-1; i++)
videos[i] = videos[i+1];
videos[nbVid-1] = null;
nbVid--;
return true;
}
public int countVideosOf(Category cat){
int counter = 0;
for(int i = 0; i < nbVid; i++)
if(videos[i].getCategory() == cat)
counter++;
return counter;
}
public void sortOnDuration(){ //Bubble Sort
for(int i = 0; i < nbVid - 1; i++){
for(int j = 0; j < nbVid - 1 - i; j++){
if(videos[j].getDuration() >
videos[j+1].getDuration()){
Video temp = videos[j];
videos[j] = videos[j+1];
videos[j+1] = temp;
}
}
}
}
public String getName() {
return name;
}
public boolean isShared() {
return shared;
}
public void setShared(boolean shared) {
this.shared = shared;
}
public boolean equals(Playlist p){
return this.name.equalsIgnoreCase(p.name);
}
@Override
public String toString() {
return "Playlist [name=" + name + ", shared=" + shared
+ ", videos=" + Arrays.toString(videos) + "]";
}
}