
public class LinkedList {

	private Node head; 
	
	public LinkedList()
	{
		head = null;
	}
	
	public void insertAtFirst(int value)
	{
		Node pp = new Node(value);
		if(head == null)
			head = pp;
		else
		{
			pp.setNext(head);
			head = pp;
		}
		
	}
	
	public void display()
	{
		Node ss = head;
		
		while(ss != null)
		{
			System.out.print(ss.getData() + "----->");
			ss = ss.getNext();
		}
		
	}
	
	public void insertAtLast(int value)
	{
		Node pp = new Node(value);
		if(head == null)
			head = pp;
		else
		{
			Node SS = head;
			
			while(SS.getNext() !=null)
				SS = SS.getNext();
			
			SS.setNext(pp);
		}
	}
	
	public void deleteAtFirst()
	{
		Node ss = head;
		head = head.getNext();
		ss.setNext(null);
	}
	
	public void deleteAtLast()
	{
		Node curr = head; 
		Node prev = null;
		
		while(curr.getNext()!=null)
		{
			prev = curr;
			curr = curr.getNext();
		}
		
		prev.setNext(null);
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public int size()
	{
		int count = 0; 
		Node ss = head; 
		
		while(ss!= null)
		{
			count++;
			ss = ss.getNext();
		}
		
		return count;
	}
	
	public Node search(int value)
	{
		Node curr = head; 
		
		while(curr != null)
		{
			if(curr.getData() == value)
				return curr;
			curr = curr.getNext();
		}
		
		return null;
	}
}
