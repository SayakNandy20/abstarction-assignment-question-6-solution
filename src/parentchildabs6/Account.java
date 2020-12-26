package parentchildabs6;

public abstract class Account {
	protected int accNumber;
	protected String holderName;
	protected double balance;
	public Account(int accNumber, String holderName, double balance) {
	
		this.accNumber = accNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	abstract public double calculateInterest();
	
	

}
