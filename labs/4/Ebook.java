public class Ebook extends WrittenBook{
private int size;
public Ebook(String title, String author, int nPages, int size) {
super(title, author, nPages);
this.size = size;
}
public int getSize() {
return size;
}
public PrintedBook print(){
PrintedBook temp = new PrintedBook(title,author, getnPages());
return temp;
}
@Override
public String toString() {
return super.toString() + ", Ebook, size: "+ size + "MB";
}
}