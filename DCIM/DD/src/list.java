
public interface list<T> {
	public void update(T v); public void insert(T v); public void findFirst(); public void findNext(); 	public void remove();
	public T retrieve();
	public boolean empty(); public boolean full(); public boolean last();
	/*
	 Operations: We assume all operations operate on a list L.
1. Method FindFirst ( )
requires: list L is not empty. input: none
results: first element set as the current element. output: none.
2. Method FindNext ( )
requires: list L is not empty. Cur is not last. input: none
results: element following the current element is made the current
element.
output: none.
2. Method FindPrevious ( )
requires: list L is not empty. Cur is not Head. input: none
results: element Previous to the current element is made the current
element.
output: none.
3. Method Retrieve (Type e)
requires: list L is not empty. input: none
results: current element is copied into e. output: element e.
4. Method Update (Type e).
requires: list L is not empty. input: e.
results: the element e is copied into the current node.
output: none.
5. Method Insert (Type e).
requires: list L is not full. input: e.
results: a new node containing element e is created and inserted
after the current element in the list. The new element e is made
the current element. If the list is empty e is also made the head
element. output: none.
6. Method Remove ( )
requires: list L is not empty. input: none
results: the current element is removed from the list. If the
resulting list is empty current is set to NULL. If successor of the
deleted element exists it is made the new current element
otherwise first element is made the new current element. output:
none.
7. Method Full (boolean flag)
input: none. returns: if the number of elements in L has reached
the maximum number allowed then flag is set to true otherwise
false. output: flag.
8. Method Empty (boolean flag).
input: none. results: if the number of elements in L is
zero, then flag is set to true otherwise false. Output:
flag.
9. Method First (boolean flag).
input: none. requires: L is not empty. Results: if the
first element is the current element then flag is set to
true otherwise false. Output: flag
10. Method Last (boolean flag).
input: none. requires: L is not empty. Results: if the
last element is the current element then flag is set to
true otherwise false. Output: flag
	 
	 
	 
	 */
}
