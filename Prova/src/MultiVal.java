import java.util.ArrayList;

public class MultiVal {
	
	ArrayList<Integer> element;

	/**
	 * @param element
	 */
	public MultiVal(int... elements) {
		element = new ArrayList<>();
		for (int i : elements) {
			this.element.add(i);
		}
	}
	
	public void add(int... objects) {
		for (int elem : objects) {
			this.element.add(elem);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		for (int val : element) {
			str += val + "|";
		}
		return str;
	}
	
	

}
