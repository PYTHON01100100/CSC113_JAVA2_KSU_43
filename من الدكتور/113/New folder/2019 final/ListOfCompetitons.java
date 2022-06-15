public class ListOfCompetitons {
Node head;
ListOfCompetitons(){
head=null;
}
public void insertatback(Competiton c) {
Node newone= new Node(c);
Node current= head;
if(head==null)
head=newone;
else
while(current.getNext()!=null) {
current=current.getNext();
current.setNext(newone);}
}
ListOfCompetitons getit(String d) {
Node current= head;
ListOfCompetitons s= new ListOfCompetitons();
while(current!=null)
if(current.getData().getwinner(d)instanceof Male)
if(((Male)current.getData().getwinner(d)).getAge()>30)
s.insertatback(current.getData());
return s;
}
}