
public class CashRegister {
	
	private double cashRegAmount;
	private double payment;

	/**
	 * Open Cash register
	 */
	public CashRegister() {
		super();
	}

	/**
	 * @param purchase amount of things bought by costumer
	 */
	public void recordPurchase(double purchase) {
		this.cashRegAmount = this.cashRegAmount + purchase;
	}

	/**
	 * @param pay his payment
	 */
	public void enterPayment(double pay) {
		this.payment = this.payment - pay;
	}
	
	/**
	 * @return his change
	 */
	public double giveChange() {
		
		double change = this.payment - this.cashRegAmount;
		this.payment = 0;
		this.cashRegAmount = 0;
		return change;
	}
}
