public class WrittenBook extends Book{
private int nPages;
public WrittenBook(String title, String author, int nPages) {
super(title, author);
this.nPages = nPages;
}
public int getnPages() {
return nPages;
}
@Override
public String toString() {
return super.toString() + ", Format: Written, number of pages: "
+ nPages;
}
}