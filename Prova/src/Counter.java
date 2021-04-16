
public class Counter {
	
	private int value;
	
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
