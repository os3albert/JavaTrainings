import java.awt.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c = new Counter();
		
		c.count();
		c.count();
		c.count();
		c.reset();
		
		System.out.println(c.getValue());
		
		Clock time = new Clock();
		time.getHours();
		time.getMinutes();
		
		BankAccount harry = new BankAccount();
		
	}

}
