package dependencyInversionPrinciple;

public class Mall {
	
	BankCard bankCard;
	
	public Mall ( BankCard bankcard )
	{
		this.bankCard = bankcard; 
	}
	
	public void doPayments()
	{
		bankCard.doTransaction();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall orion = new Mall( new DebitCard() );
		orion.doPayments();
	}

}
