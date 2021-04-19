import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger.getGlobal().setLevel(Level.OFF);
		
		
		Counter c = new Counter();
		
		Logger.getGlobal().setLevel(Level.INFO);
		
		Logger.getGlobal().info("ciao a tutti");
		
		c.count();
		c.count();
		c.count();
		c.reset();
		
		System.out.println(c.getValue());
		
		Clock time = new Clock();
		time.getHours();
		time.getMinutes();
		
		System.out.println(Clock.type.minuti);
		
		String ciao = "Ciao Mondo!";
		
		System.out.println(ciao.substring(5, 5+5));
		System.out.println("\uD835");
		
//		System.out.println("inserisci un numero");
//		Scanner in = new Scanner(System.in);
//		String numero = in.next();
//		System.out.printf("%s", numero);
		
//		String input = JOptionPane.showInputDialog("inserisci il numero");
//		JOptionPane.showMessageDialog(null, input);
//		System.exit(0);
//		Math.abs(0);
		
		String dao = "ciao";
		System.out.println(dao.compareTo("aiao"));
		
	}

}
