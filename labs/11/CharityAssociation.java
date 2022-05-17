import java.io.*;
public class CharityAssociation implements IOInterface{
private String name;
private Donation [] arrDon;
private int nbDon;
public CharityAssociation(String name, int size){
this.name = name;
arrDon = new Donation[size];
nbDon = 0;
}
public boolean addDonation(Donation d){
if(nbDon >= arrDon.length)
return false;
if(d instanceof Cash)
arrDon[nbDon++] = new Cash((Cash) d);
else
arrDon[nbDon++] = new Check((Check) d);
return true;
}
public double avgCashDonations(String cur){
double sum = 0;
int nb = 0;
for(int i = 0; i < nbDon; i++){
if(arrDon[i] instanceof Cash && ((Cash)arrDon[i]).getCurrency().equals(cur)){
try{
sum += arrDon[i].getAmount();
nb++;
} catch(Exception e){
System.out.println(e);
}
}
}
if(nb != 0)
return sum / nb;
return 0;
}
public Check getCheck(String bName){
for(int i = 0; i < nbDon; i++)
if(arrDon[i] instanceof Check &&
((Check)arrDon[i]).getBankName().equals(bName))
return (Check) arrDon[i];
return null;
}
public void saveToFile(String filename, String donor) throws IOException{
File f = new File(filename);
FileOutputStream outStream = new FileOutputStream(f);
ObjectOutputStream outCash = new ObjectOutputStream(outStream);
for(int i = 0; i < nbDon; i++){
if(arrDon[i] instanceof Cash &&
arrDon[i].getDonorName().equals(donor))
outCash.writeObject(arrDon[i]);
}
outCash.close();
outStream.close();
}
//extra method for testing
public void saveAll(String filename) throws IOException{
File f = new File(filename);
FileOutputStream outStream = new FileOutputStream(f);
ObjectOutputStream outDon = new ObjectOutputStream(outStream);
for(int i = 0; i < nbDon; i++)
outDon.writeObject(arrDon[i]);
outDon.close();
outStream.close();
}
public void loadFromFile(String filename, Check[] arrCheck) throws
IOException{
int counter = 0;
File f = new File(filename);
FileInputStream inStream = new FileInputStream(f);
ObjectInputStream inDon = new ObjectInputStream(inStream);
try{
while(true){
try{
Donation d = (Donation) inDon.readObject();
if(d instanceof Check)
arrCheck[counter++] = (Check) d;
} catch(ClassNotFoundException e){
System.out.println(e);
}
}
}catch(EOFException e){
System.out.println("Finished reading");
inDon.close();
inStream.close();
}
}
}