import java.util.Arrays;
public class Channel {
private String name;
private Playlist playlists[];
private int nPlay;
public Channel(String name, int size){
this.name = name;
playlists = new Playlist[size];
nPlay = 0;
}
public int getIndex(Playlist p){
	for(int i = 0; i < nPlay; i++)
		if(playlists[i].equals(p))
			return i;
	return -1;
}
public boolean addPlaylist(Playlist p){
	int index = getIndex(p);
	if(index != -1 || nPlay >= playlists.length)
		return false;
	playlists[nPlay++] = new Playlist(p);
	return true;
}
public boolean deletePlaylist(Playlist p ){
	int index = getIndex(p);
	if(index == -1)
		return false;
	playlists[index] = playlists[nPlay-1];
	playlists[nPlay-1] = null;
	nPlay--;
	return true;
}
public boolean flipShared(Playlist p){
	int index = getIndex(p);
	if(index == -1)
		return false;
	playlists[index].setShared(!playlists[index].isShared());
	return true;
}
public Playlist getPlaylist(Category cat){
	if(nPlay == 0)
		return null;
	Playlist max = playlists[0];
	for(int i = 1; i < nPlay; i++)
		if(playlists[i].countVideosOf(cat) >max.countVideosOf(cat))
			max = playlists[i];
	return max;
}
public void sortPlaylists(){
	for(int i = 0; i < nPlay; i++)
		playlists[i].sortOnDuration();
	}
@Override
public String toString() {
	return "Channel [name=" + name + ", playlists=" +Arrays.toString(playlists) + ", nPlay=" + nPlay + "]";
}

}