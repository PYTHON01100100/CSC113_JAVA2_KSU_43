
public class Contract {
	private String date;
	private String nompanyName;
	private int id;
	private Clause arrClauses[];
	private int nbc;
	
	public Contract(String date, String nompanyName, int id) {
		this.date = date;
		this.nompanyName = nompanyName;
		this.id = id;
		arrClauses=new Clause[20];
		nbc=0;
	}
	public double computeContractRevenue() {
		double sum=0;
		for(int i=0;i<nbc;i++)
			sum+=arrClauses[i].getRevenue();
		
		return sum;
	}
	public boolean addClause(Clause c) {
		if(nbc==arrClauses.length)
			return false;
		else {
			arrClauses[nbc++]=new Clause(c);
			return true;
		}
	}
	public Clause[] getClauses(double r) {
		int size=0;
		for(int i=0;i<nbc;i++)
			if(arrClauses[i].getRevenue()<r)
				size++;
		
		int c=0;
		Clause temp[]=new Clause[size];
		for(int i=0;i<nbc;i++)
			if(arrClauses[i].getRevenue()<r)
				temp[c++]=arrClauses[i];
		
		
		return temp;
	}
	
	public Clause getSmallestRevenue() {
		Clause min=null;
		for(int i=0;i<nbc;i++) {
			if(min==null||arrClauses[i].getRevenue()<min.getRevenue())
				min=arrClauses[i];
		}
		return min;
	}
	
	
}
