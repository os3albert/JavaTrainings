
/**
 * @author alber
 * people counter
 *
 */
public class Counter {
	
	private int value;
	
	/**
	 * start the counter
	 */
	public Counter() {
		this.value = 0;
		
	}
	
	/**
	 *  Increment the counter
	 */
	public void count() {
		this.value++;
	}
	
	/**
	 * @return the value of all increments
	 */
	public int getValue() {
		return this.value;
	}
	
	public void reset() {
		this.value = 0;
	}

}
