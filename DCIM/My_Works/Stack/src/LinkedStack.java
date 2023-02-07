
public class LinkedStack<T> implements Stack<T> {
	private Node<T> top;
	public LinkedStack() {top=null;}
	public void push(T e) {
		Node<T> tmp=new Node<T>(e);
		tmp.next=top;
		top=tmp;
	}
	public T pop() {
		T e=top.data;
		top=top.next;
		return e;
	}
	
	 public boolean empty() {return top==null;} public boolean full() {return false;}

}
