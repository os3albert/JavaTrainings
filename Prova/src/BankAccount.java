
public class BankAccount {
	
	private double cash;
	
	public BankAccount() {
		super();
	}

	/**
	 * @param initialCash your actual cash
	 */
	public BankAccount(double initialCash) {
		this.cash = initialCash;
	}
	
	/**
	 * @param cash deposit cash on bankaccount
	 */
	public void deposit(double cash) {
		this.cash = this.cash + cash;
	}
	
	/**
	 * @param cash remove cash from bankaccount
	 */
	public void withdraw(double cash) {
		this.cash = this.cash - cash;
	}
	
	/**
	 * @return current value of bankaccount
	 */
	public double getBalance() {
		
		return this.cash;
		
	}
	
	

}
