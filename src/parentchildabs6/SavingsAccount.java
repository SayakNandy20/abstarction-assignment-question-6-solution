package parentchildabs6;

public class SavingsAccount extends Account {
	private double minimumBalance;

	public SavingsAccount(int accNumber, String holderName, double balance, double minimumBalance) {
		super(accNumber, holderName, balance);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		double interest=(double) ((super.balance*5)/100);
		return interest;
	}
	

}
