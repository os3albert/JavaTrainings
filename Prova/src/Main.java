import java.awt.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle box = new Rectangle(0, 0, 20, 20);	
		System.out.println(box);
		System.out.println(box.height);
		box.translate(15, 25);
		System.out.println(box);
		box.setSize(20, 40);
		System.out.println(box);
		
		
	}

}
