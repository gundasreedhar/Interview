public class DeadLockDemo extends Thread {
	Account fromAccount;
	Account toAccount;
	int amount;

	public DeadLockDemo(int amount) {
		this.amount = amount;
	}

	public Account getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Account getToAccount() {
		return toAccount;
	}

	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}

	public static void main(String[] args) {
		Account fromAccount = new Account(24000);
		Account toAccount = new Account(30000);
		int amount = 2000;
		DeadLockDemo deadLockDemo1 = new DeadLockDemo(amount);
		deadLockDemo1.setFromAccount(fromAccount);
		deadLockDemo1.setToAccount(toAccount);
		deadLockDemo1.start();

		DeadLockDemo deadLockDemo2 = new DeadLockDemo(amount);
		deadLockDemo2.setFromAccount(toAccount);
		deadLockDemo2.setToAccount(fromAccount);
		deadLockDemo2.start();

	}

	@Override
	public void run() {
		transferMoney(fromAccount, toAccount, amount);
	}

	void transferMoney(Account fromAccount, Account toAccount, int amount) {

		synchronized (fromAccount) {
			synchronized (toAccount) {

				if (amount > fromAccount.salary) {
					System.out.println("Transfer not possible !! ");
				} else {
					fromAccount.debit(amount);
					toAccount.credit(amount);
					System.out.println("Amount Transferred !! ");
				}
			}
		}

	}
}

class Account {
	public int salary;

	public Account(int salary) {
		this.salary = salary;
	}

	void debit(int amount) {

		salary = salary - amount;
	}

	void credit(int amount) {
		salary = salary + amount;
	}

}