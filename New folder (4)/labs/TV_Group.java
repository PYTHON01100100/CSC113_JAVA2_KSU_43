
public class TV_Group {
private TV_Channel arTV[];
private String name;
private int nbt;

public TV_Group( String name) {
	this.arTV = new TV_Channel[25];
	this.name = name;
	nbt=0;
}

public boolean add(TV_Channel t)
{
	if(nbt==arTV.length)
		return false;
	
	
	if(t instanceof News){
		arTV[nbt++]=new News((News)t);
		return true;
	}
	else if(t instanceof Sports){
		arTV[nbt++]=new Sports((Sports)t);
		return true;
	}
	
	else{
		arTV[nbt++]=new TV_Channel(t);
		return true;
	}

	}
public int countLiveSport() { 
	int c=0; 
	
	for(int i=0; i < nbt; i++) 
		if(( arTV[i] instanceof Sports ) && arTV[i].isLive())  
			c++; 

	return c; 
}

public void display(int n) { 
	for(int i=0; i < nbt; i++) 
		if( ( arTV[i] instanceof Sports && ((Sports)arTV[i]).getNbMaches() > n) ) 
				arTV[i].display();
}
public News[] getNews(int b) {  
	News[] t = new News[nbt]; 
	int c=0; 
	
	for(int i=0; i < nbt; i++) 
		if( ( arTV[i] instanceof News ) && 
			( ((News)arTV[i]).getBreakingNews() > b ) ) 
			{
				t[c++] = (News) arTV[i]; 
			}
	

return t;

}
public void splitChannels(TV_Channel []t1,TV_Channel t2[] ){
	int j=0, k=0; 
	
	for(int i=0; i < nbt; i++) { 
		if( ( arTV[i] instanceof Sports ) && 
			( ((Sports) arTV[i]).getNbMaches() > 20 ) ) { 
				t1[j++] = arTV[i]; 
		}
		else  { 
			if(arTV[i].getViews() > 3000) { 
				t2[k++] = (News) arTV[i]; 
			}

	
		}
	
}
	
}
public Sports mostPopularChannel(){
	Sports m=null;
	for(int i=0; i < nbt; i++) {
		if( m==null||( arTV[i] instanceof Sports ) && 
			( ((Sports) arTV[i]).getNbMaches() > m.getNbMaches() ) ) {
			//composition
			m=new Sports((Sports) arTV[i]);
	}
	}
	return m;
}




}
