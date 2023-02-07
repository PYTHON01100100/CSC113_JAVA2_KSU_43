
public class linkedQueue<T> implements Queue<T> {
	private Node<T> head, tail;
	private int size;
	public linkedQueue() {
		head=tail=null;
		size=0;
	}
	public void enqueue(T e) {
		Node<T> t=new Node<T>(e);
		if(head==null)
			head=tail=t;
		else {
			tail.next=t;
			tail=t;//tail=tail.next;
		}
		size++;
			
	}
	public T serve() {
		T t=head.data;
		head=head.next;
		size--;
		if(size==0)
			tail=null;
		return t;
	}
	public int length() {return size;} public boolean full() {return false;}
}