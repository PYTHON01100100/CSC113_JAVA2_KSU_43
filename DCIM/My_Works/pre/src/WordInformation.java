
public class WordInformation {
	String word;
	LinkedList<WordOccurrence> occList = new LinkedList<WordOccurrence>();
	int size;
	
	public WordInformation(String w) {
		word=w;
		size=1;
		
	}
	
	
	public void setSize() {
		this.size = size++;
	}


	public String getWord() {
		return word;
	}
	
	public LinkedList<WordOccurrence> getOccList() {
		return occList;
	}

	@Override
	public String toString() {
		return "WordInformation [word=" + word + ", occList=" + occList + ", size=" + size + "]";
	}
	
	 
}
