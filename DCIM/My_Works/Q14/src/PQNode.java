
public class PQNode<T> {
	public T data;
	public int priority;
	public PQNode<T> next;
	public PQNode() {this.data=null; this.next=null; this.priority=0;}
	public PQNode(T v, int priority) {this.data=v; next=null;this.priority=priority;}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public PQNode<T> getNext() {
		return next;
	}
	public void setNext(PQNode<T> next) {
		this.next = next;
	}
}
