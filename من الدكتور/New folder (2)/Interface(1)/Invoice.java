
public class Invoice implements Payable{

	private int qtity;
	private double price;
	
	public Invoice(int qq, double pp)
	{
		qtity= qq;
		price = pp;
	}
	
	public double getPaymentAmount()
	{
		return qtity * price;
	}
}
