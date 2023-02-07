
public class test {
	public static <T > void split ( Queue <T > q , Queue <T > oq , Queue <T > eq ) {
		recSplit (q , oq , eq , q.length() , 1) ;
		}
		private static <T> void recSplit ( Queue <T > q , Queue <T > oq , Queue <T>	eq , int count , int pos ) {
		if ( pos > count )
		return;
		T element = q.serve () ;
		q.enqueue ( element ) ;
		if ( pos % 2 == 1) {
		if (oq.full () )
		oq . enqueue ( element ) ;
		}
		else {
		if (! eq.full () )
		eq . enqueue ( element ) ;
		}
		recSplit (q , oq , eq , count , pos + 1) ;
		}
		public static <T > void remove(priorityQueue <T> pq,int k) {
			int count=pq.length();
			priorityQueue <T> tmp=new priorityQueue <T>();
			for(int i=0;i<count;i++) {
			PQElement<T> e=pq.serve1();
			if(e.priority>=k) {tmp.enqueue(e.data, e.priority);}
			}
			count=tmp.length();
			for(int i=0;i<count;i++) {
				PQElement<T> e=tmp.serve1();
				pq.enqueue(e.data, e.priority);
			}
		
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
