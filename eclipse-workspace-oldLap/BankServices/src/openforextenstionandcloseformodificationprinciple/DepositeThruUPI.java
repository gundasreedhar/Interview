package openforextenstionandcloseformodificationprinciple;

public class DepositeThruUPI implements Deposite{

	private double amount;
	
	@Override
	public void depositeAmount(double amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}
	
}
