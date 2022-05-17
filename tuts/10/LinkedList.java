public class LinkedList {
private Node head;
public LinkedList(){
this.head = null;
}
public boolean isEmpty(){
return head == null;
}
public void insertAtFront(Student s){
Node newNode = new Node(s);
newNode.setNext(head);
head = newNode;
}
public void insertAtEnd(Student s){
Node newNode = new Node(s);
if(isEmpty()){
head = newNode;
return;
}
Node current = head;
while(current.getNext() != null)
current = current.getNext();
current.setNext(newNode);
}
public void removeFromFront(){
if(!isEmpty())
head = head.getNext();
}
public Student removeFromFront2(){
Student temp = null;
if(!isEmpty()){
temp = head.getData();
head = head.getNext();
}
return temp;
}
public void removeFromBack(){
if(isEmpty()) return;
if(head.getNext() == null){
head = null;
return;
}
Node current = head;
Node previous = null;
while(current.getNext() != null){
previous = current;
current = current.getNext();
}
previous.setNext(null);
}
public Student removeFromBack2(){
if(isEmpty()) return null;
if(head.getNext() == null){
Student temp = head.getData();
head = null;
return temp;
}
Node current = head;
Node previous = null;
while(current.getNext() != null){
previous = current;
current = current.getNext();
}
Student temp = current.getData();
previous.setNext(null);
return temp;
}
public int size(){
int size = 0;
Node current = head;
while(current != null){
size++;
current = current.getNext();
}
return size;
}
public void display(){
Node current = head;
while(current != null){
current.getData().display();
current = current.getNext();
}
}
public boolean searchById(int id){
Node current = head;
while(current != null){
if(current.getData().getId() == id)
return true;
current = current.getNext();
}
return false;
}
} 