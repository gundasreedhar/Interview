package dependencyInversionPrinciple;

public class DebitCard implements BankCard{
	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("transaction succfull");
	}
}
