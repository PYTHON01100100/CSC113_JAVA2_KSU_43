public class PrintedBook extends WrittenBook{
private int ISBN;
private boolean hardcover;
public PrintedBook(String title, String author, int nPages,
int iSBN, boolean hardcover) {
super(title, author, nPages);
ISBN = iSBN;
this.hardcover = hardcover;
}
public PrintedBook(String title, String author, int nPages) {
super(title, author, nPages);
ISBN = 0;
hardcover = false;
}
public int getISBN() {
return ISBN;
}
public String getCoverType(){
return hardcover ? "Hardcover" : "Paperback";
}
@Override
public String toString() {
return super.toString() + ", Printed, ISBN: " + ISBN + ", "
+ getCoverType();
}
}