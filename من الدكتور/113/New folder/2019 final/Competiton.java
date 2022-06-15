import java.io.*;
public class Competiton {
private String name;
Player arrplayers[];
private int counter;
public Competiton(String nsme, int size) {
arrplayers= new Player[size];
name=nsme;
counter=0;
}
public Player getwinner(String d) {
int max=0;
for(int i=0;i<counter;i++)
if(arrplayers[i].gethaihestScore(d)>arrplayers[max].gethaihestScore(d))
max=i;
return arrplayers[max];
}
public int savemaleplayer(String filename) throws IOException{
File f= new File(filename);
FileOutputStream outcheck= new FileOutputStream(f);
ObjectOutputStream theoutcheck = new ObjectOutputStream(outcheck);
int n=0;
for(int i=0;i<counter;i++)
if(arrplayers[i]instanceof Male) {
theoutcheck.writeObject(arrplayers[i]);
n++;}
theoutcheck.close();
outcheck.close();
return n;
}
public void insertmaleplayers(String filename, double x) throws
IOException {
File f= new File(filename);
FileInputStream instream=new FileInputStream(f);
ObjectInputStream theobj= new ObjectInputStream(instream);
try{
while(true){
try{
Player p= (Player) theobj.readObject();
if(p instanceof Male)
arrplayers[counter++]= (Player) p;
}
catch(ClassNotFoundException e){
System.out.println(e);
}}
}
catch(EOFException e){
System.out.println("Finished reading");
}
theobj.close();
instream.close();
}
}