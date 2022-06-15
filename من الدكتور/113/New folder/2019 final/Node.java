public class Node {
private Competiton data;
private Node next;
Node(Competiton C){
data=C;
this.next= null;
}
public Competiton getData() {
return data;
}
public void setData(Competiton data) {
this.data = data;
}
public Node getNext() {
return next;
}
public void setNext(Node next) {
this.next = next;
}
}