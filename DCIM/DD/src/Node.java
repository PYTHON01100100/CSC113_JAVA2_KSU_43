
public class Node<T> {
	public T data;
	public Node<T> next,previous;
	public Node() {this.data=null; this.next=null;this.previous=null;}
	public Node( T data) {this.data=data; this.next=null;this.previous=null;}
	//public Node(Node<T> data, Node<T> next) {this.data=null; this.next=null;}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
