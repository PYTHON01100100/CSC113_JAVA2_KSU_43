
public class test {
	public static<T> void reversrcopy(dd<T> l1,dd<T> l2){
		if(l1.empty())return;
		while(!l1.last()) {
			l1.findNext();
		}
		while(!l1.first()) {
			l2.insert(l1.retrieve());
			l1.findPrevious();
		}
		l2.insert(l1.retrieve());
	}
		public static void main(String[] args) {

	}

}
