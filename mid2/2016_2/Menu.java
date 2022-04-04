
public class Menu {
private Meal arrMeal[];
private String name;
private int nbm;
public Menu(String name,int size) {
	this.name=name;
	nbm=0;
	arrMeal=new Meal[size];
}
public Meal mostExpensive() {
Meal res = arrMeal[0];
for (int i = 1; i < nbm; i++) { 
if (arrMeal[i].getPrice() > res.getPrice()) 
res = arrMeal[i];
}
return res;
}

public boolean add(Meal m) {
	if(nbm==arrMeal.length)
		return false;
	arrMeal[nbm++]=m;
	return true;
}
/*
public Meal secondMostExpensive() {
	if(mostExpensive()==null) {
		return null;
	}
	Meal f=mostExpensive();
	Meal sec=arrMeal[0];
	for(int i=0;i<nbm;i++)
		if((sec.getPrice()>arrMeal[i].getPrice()&&sec!=f))
			sec=arrMeal[i];
	return sec;
	
}
*/
public Meal secondMostExpensive() { 
Meal most = arrMeal[0];
Meal second = null; 
for (int i = 1; i < nbm; i++) {
if (arrMeal[i].getPrice() > most.getPrice()) {
second = most;
most = arrMeal[i];
}
else {
if ( second == null ||
arrMeal[i].getPrice() > second.getPrice())
second = arrMeal[i]; 
}
}
return second;
}
public void splitMeals(HomeDelivery []arHL,DineIn []arD,int d, double p) 
	throws Exception { 
		int j = 0, k=0; 
		for (int i=0; i < nbm; i++) { 
		if (arrMeal[i] instanceof HomeDelivery) { 
		if (((HomeDelivery) arrMeal[i]).getDistance() == d) { 
		if (j < arHL.length)
		arHL[j++] = (HomeDelivery) arrMeal[i];
		else
		throw new 
		Exception("Number of HomeDeliv. exceeded!");
		}
		}
		else {
		if (arrMeal[i].getPrice() >= p) {
		if (k < arD.length)
		arD[k++] = (DineIn) arrMeal[i];
		else
		throw new
		Exception("Number of Dine-In exceeded!");
	
	
}
		}
		}
}
}