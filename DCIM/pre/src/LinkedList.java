
public class LinkedList<T> {
	@Override
	public String toString() {
		return " [" + current.data + "]";
	}
	public void displayLinkedListInformation() {
		findfirst();
		int i=1;
		while(current != null) {
			System.out.println(" [" + current.data + "]");
			current = current.next;
			}
		findfirst();
		}
	public boolean First() {return current==head;}
		//System.out.println(	((WordInformation)current.data).word);
	private Node<T> head;
	private Node<T> current;
	private int size;

	public Node<T> getHead() {
		return head;
	}
	public void setHead(Node<T> head) {
		this.head = head;
	}
	public Node<T> getCurrent() {
		return current;
	}
	public void setCurrent(Node<T> current) {
		this.current = current;
	}
	public LinkedList () {
		head = current = null;
		size=0;
	}
	public void increaseSize() {
		size++;
	}

	public boolean  last() {
		return current.next==null  ;
		}
	
	public void findfirst () {
		current = head ;
		}
	public void findNext () {
		current = current.next ;
		}
	public void readall() {
		findfirst();
		while(current.next!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}

	public T retrieve () {
		if(current != null)
		return current.data;
		return null;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean empty () {
		return head == null;
	}
	
	public boolean findWord(String w) {
		findfirst();
		if(empty()) return false;
		while(current.next != null) {
			if(((WordInformation)current.data).getWord().equalsIgnoreCase(w))
				return true;
			current = current.next;
		}
		if(((WordInformation)current.data).getWord().equalsIgnoreCase(w))
			return true;
		
		return false;
	}
	
	/*public void insert(T val) {
	//	System.out.println(val.getClass());
		if (empty()) {
			if(val instanceof WordInformation) {
			current = head = new Node<T> (val);}
			else if(val instanceof WordOccurrence) {
				System.out.println("im mpty");
				current = head = (Node<T>) new Node<WordOccurrence> ((WordOccurrence) val);}
		}
		if(current != null) {
			if(val instanceof WordInformation) {
				System.out.println("im wordinfo");
			current.next = new Node<T>( val);
		current = current.next;}
		
		else if(val instanceof WordOccurrence) {
			System.out.print("im here ");
			current.next = (Node<T>) new Node<WordOccurrence> ((WordOccurrence) val);
			current = current.next;
		//	((WordInformation)current.data).occList.current.next = (Node<WordOccurrence>) new Node<T>( val);
			//((WordInformation)current.data).occList.current = ((WordInformation)current.data).occList.current.next;
			}}
		else System.out.println("sorry");
		}*/
	public void insert (T val) {
		
		if (empty()) {
			current = head = new Node<T> (val);
		}
		else {
			current.next = new Node<T> (val);
			current = current.next;
		}
	}
	
	public void headnext() {
		if(head != null)
		head = head.next;
	}
	public void findLast() {
		if(!empty()) {
			while(current.next != null)
				current = current.next;
		}
	}
	//to be sure that we insert them in the right way
	public void displayTheInformation() {
		findfirst();
		int i=1;
		while(current != null) {
			System.out.println("====================================================================================");
			System.out.println("word :"+i+" "+((WordInformation)current.data).word);
			System.out.println("size : "+((WordInformation)current.data).size);
			((WordInformation)current.data).occList.findfirst();
			while(((WordInformation)current.data).occList.current != null){
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("line: "+((WordInformation)current.data).occList.retrieve().lineNo);
				System.out.println("pos: "+((WordInformation)current.data).occList.retrieve().position);
				System.out.println("----------------------------------------------------------------------------");
				((WordInformation)current.data).occList.current =((WordInformation)current.data).occList.current.next;
			}
			i++;
		current = current.next;}
		//System.out.println(	((WordInformation)current.data).word);
	}
	
}
