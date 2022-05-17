public class LinkedListOfEmployees {
private Node head;
public LinkedListOfEmployees(){
head = null;
}
public void insertAtEnd(Employee e){
Node newNode = new Node(e);
if(head == null){
head = newNode;
return;
}
Node current = head;
while(current.getNext() != null)
current = current.getNext();
current.setNext(newNode);
}
public void insertAtFront(Employee e){
Node newNode = new Node(e);
newNode.setNext(head);
head = newNode;
}
public int countEmployees(String g){
int count = 0;
Node current = head;
while(current != null){
if(current.getData().getGender().equalsIgnoreCase(g))
count++;
current = current.getNext();
}
return count;
}
public Employee getOldestEmployee(){
if(head == null) return null;
Employee oldest = head.getData();
Node current = head.getNext();
while(current != null){
if(current.getData().getAge() > oldest.getAge())
oldest = current.getData();
current = current.getNext();
}
return oldest;
}
public LinkedListOfEmployees getEmployee(String g){
LinkedListOfEmployees temp = new LinkedListOfEmployees();
Node current = head;
while(current != null){
if(current.getData().getGender().equalsIgnoreCase(g))
temp.insertAtEnd(current.getData());
current = current.getNext();
}
return temp;
}
public void splitEmployees(LinkedListOfEmployees male,
LinkedListOfEmployees female){
Node current = head;
while(current != null){
if(current.getData().getGender().equalsIgnoreCase("Male"))
male.insertAtEnd(current.getData());
else
female.insertAtFront(current.getData());
current = current.getNext();
}
}
public void display(){
Node current = head;
while(current != null){
current.getData().display();
current = current.getNext();
}
}
}
