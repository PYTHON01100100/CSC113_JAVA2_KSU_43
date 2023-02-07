
public class ArrayQueue<T> implements Queue<T> {
	private int max,size,head,tail;
	private T[] nodes;
	public ArrayQueue(int max) {
		this.max = max;
		this.size = 0;
		this.head = 0;
		this.tail = 0;
		this.nodes = (T[]) new Object[max];
	}
	public T serve() {
		T e=nodes[head];
		head=(head+1)%max;
		size--;
		return e;
	}
	public void enqueue(T v) {
		nodes[tail]=v;
		tail=(tail+1)%max;
		size++;
	}
	public int length() {return size;} public boolean full() {return size==max;}
}
