
public class dd<T> implements list<T> {
	private Node<T> head, current;
	public dd() {head=current=null;}
	public boolean empty() {return head==null;} public boolean full(){return false;} public boolean last() {return current.next==null;}
	public boolean first() {return current.previous==null; /* return current==head; */} 
	public void findFirst() {current=head;} public void findPrevious() {current=current.previous;}
	public T retrieve() {return current.data;} 	public void findNext() {current=current.next;} public void update(T v) {current.data=v;}
	public void insert(T v) {
		Node<T> t=new Node<T>(v);
		if(empty()) {
			head=t;
		}
		else {
			t.next=current.next;
			t.previous=current;
			if(current.next!=null) 
				current.next.previous=t;
		current.next=t;
		current=t;
		}
	}
	public void remove(){
		if(current==head)
		{
			head=head.next;
			if(head!=null)
				head.previous=null;
		}
		else {
			current.previous.next=current.next;
			if(current.next!=null)
				current.next.previous=current.previous;
		}
		if(current.next==null)
			current=head;
		else 
			current=current.next;
	}
	public void removeBetween ( T e1 , T e2 ) {
		Node <T > p = head ;
		while (( p != null ) && (! p . data . equals ( e1 ) ) )
		p = p . next ;
		if ( p == null ) return;
		Node <T> q = p.next ;
		while (( q!= null ) && (! q.data.equals ( e2 ) ) )
		q = q . next ;
		if ( q == null )
		return;
		p . next = q ;
		q.previous = p ;
		current = head ;
		}
	
	
}
