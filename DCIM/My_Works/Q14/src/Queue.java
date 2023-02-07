
public interface Queue<T> {
	public T serve(); public void enqueue(T v); public int length(); public boolean full();
/*
1. Method Enqueue (Type e)
requires: Queue Q is not full. input: Type e.
results: Element e is added to the queue at its tail. output: none.
2. Method Serve (Type e)
requires: Queue Q is not empty. input: none
results: the element at the head of Q is removed and its value
assigned to e. output: Type e.
3. Method Length (int length)
requires: none. input: none
results: The number of element in the Queue Q is returned.
output: length.
4. Method Full (boolean flag).
requires: none. input: none
results: If Q is full then flag is set to true, otherwise flag is set to
false. output: flag.
 
 
 
 */
}
