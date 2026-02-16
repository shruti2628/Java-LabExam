package Q2;

public class Account {
	protected Owner owner;
	protected float balance;
	protected String number;
	
	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance=balance;
		this.number = number;
	}
	
	public String toString() {
		return "Owner: "+owner+" Balance: "+balance+" Number: "+number;
	}
	
	public void deposit(float amount) {
		if (amount>0) {
			balance+=amount;
			System.out.println("Amount added successfully");
		}
		else {
			System.out.println("Error. Negative value");
		}
	}
	public void withdraw(float amount) {
		if (amount>0) {
			balance-=amount;
			System.out.println("Amount added successfully");
		}
		else {
			System.out.println("Error. Negative value");
		}
	}
	
	public float getBalance() {
		return balance;
	}
}
