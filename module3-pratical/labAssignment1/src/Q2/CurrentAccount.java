package Q2;

public class CurrentAccount extends Account{
	private float minimumBalance;
	
	public CurrentAccount(Owner owner, String number, float balance, float minimumBalance) {
		super(owner, balance ,number);
		this.minimumBalance = minimumBalance;
	}
	
	@Override
	public String toString(){
		return super.toString()+" Type: Current Account.";
	}
	
	public float getCharges() {
		return minimumBalance;
	}
}
