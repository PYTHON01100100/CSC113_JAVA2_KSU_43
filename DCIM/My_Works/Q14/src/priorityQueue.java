
public class priorityQueue <T> {
	private PQNode<T> head;
	private int size;
	public priorityQueue() {
		head=null;
		size=0;
	}
	public void enqueue(T v,int x) {
		PQNode<T> e=new PQNode(v,x);
		if((size==0)||x>head.priority) {
			e.next=head;
			head=e;
	}
		else {
			PQNode<T> p,q;
			p=head;
			q=null;
			while((p!=null)&&(x<p.priority)) {q=p;p=p.next;}
			e.next=p;
			q.next=e;
		}
		size++;
	}
	public T serve() {
	PQNode<T> e=head;
	head=head.next;
	size--;
	return e.data;
	}
	public PQElement<T> serve1(){
		PQNode<T> node=head;
		PQElement<T> ppe=new PQElement<T>(node.data,node.priority);
		head=head.next;
		size--;
		return ppe;
	}
	

	public int length() {return size;} public boolean full() {return false;} 
/*
Operations:
1. Method Enqueue (Type e, Priority p)
requires: PQ is not full. input: e, p.
results: Element e is added to the queue according to its priority.
output: none.
2. Method Serve (PQElement<Type> pqe)
requires: PQ is not empty. input: None
results: the element and the priority at the head of PQ is
removed and returned. output: pqe.
3. Method Length (int length)
input: results: The number of element in the PQ is returned.
output: length.
4. Method Full (boolean flag).
requires: input:
results: If PQ is full then flag is set to true, otherwise
flag is set to false. output: flag.
 
 */
}
