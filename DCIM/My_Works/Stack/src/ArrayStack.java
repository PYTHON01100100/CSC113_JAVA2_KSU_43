
public class ArrayStack<T> implements Stack<T> {
	private T[] Nodes;
	private int max;
	private int top;
	public  ArrayStack(int n) {
		max=n;
		top=-1;
		Nodes=(T[])new Object[max];
	}
	public void push(T e) { Nodes[++top]=e; } public T pop() { return Nodes[top--]; }
	 public boolean empty() {return top==-1;} public boolean full() {return top==max-1;}
}
