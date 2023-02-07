
public class test {
	public static <T> boolean search ( Stack <T> st , T e ) {
		if ( st . empty () )
		return false;
		T top = st . pop () ;
		boolean found ;
		if ( top . equals ( e ) )
		found = true ;
		else
		found = search ( st , e ) ;
		st.push ( top ) ;
		return found ;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
