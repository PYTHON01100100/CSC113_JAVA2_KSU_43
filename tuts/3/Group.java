import java.util.Arrays;
public class Group {
private String name;
private Contact [] contacts;
private int nbCont;
public Group(String name, int size){
this.name = name;
contacts = new Contact[size];
nbCont = 0;
}
public int getIndexOf(Contact c){
for(int i = 0; i < nbCont; i++)
if(contacts[i].equals(c))
return i;
return -1;
}
public boolean addContact(Contact c){
if(getIndexOf(c) != -1 || nbCont == contacts.length)
return false;
contacts[nbCont++] = c;
return true;
}
public boolean removeContact(Contact c){
int index = getIndexOf(c);
if(index == -1)
return false;
contacts[index] = contacts[nbCont-1];
contacts[nbCont-1] = null;
nbCont--;
return true;
}
public void printContactAt(int pos){
int index = pos - 1;
if(index >= 0 & index < nbCont)
System.
out.println(contacts[index]);
else
System.
out.println("Wrong index");
}
public Contact[] concat(Group g){
Contact temp[] = new Contact[nbCont + g.nbCont];
int counter = 0;
for(int i = 0; i < nbCont; i++)
temp[counter++] = contacts[i];
for(int i = 0; i < g.nbCont; i++)
temp[counter++] = g.contacts[i];
return temp;
}
/*
@Override
public String toString() {
return "Group [name=" + name + ", contacts=" +
Arrays.toString(contacts) + "]";
}
*/
public String toString(){
String temp = "Name: " + name;
temp += "\nContacts: \n";
for(int i = 0; i < nbCont; i++)
temp += contacts[i].toString() + "\n";
return temp;
}}