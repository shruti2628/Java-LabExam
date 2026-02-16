package Q2;

public class SavingsAccount extends Account {
	private float interestRate;
	
	
	public SavingsAccount(Owner owner, String number, float balance, float interestRate) {
		super(owner, balance ,number);
		this.interestRate=interestRate;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Type: Savings Account";
	}
	public float getInterest() {
		float interest = super.balance*interestRate;
		super.balance +=interest;
		return interest;
	}
}
