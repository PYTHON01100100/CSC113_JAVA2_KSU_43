
public class WordOccurrence {
	@Override
	public String toString() {
		return "WordOccurrence [lineNo=" + lineNo + ", position=" + position + "]";
	}

	int lineNo;
	int position;
	
	public WordOccurrence(int line, int pos) {
		lineNo =line;
		position = pos;
	}

	public int getLineNo() {
		return lineNo;
	}

	public int getPosition() {
		return position;
	}
	
	
}
