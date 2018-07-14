import java.util.ArrayList;

/**
 * This is a class for a die object with a specified number of sides. 
 * @author Nathan
 */
public class DieX {
	
	//The number of sides this die has.
	private int sides;
	
	public DieX(int sides) {
		this.sides = sides;
	}
	
	/**
	 * Rolls the die once, returns the result as an integer.
	 * @return the number "on top" of the die.
	 */
	public int roll() {
		int result = (int) (Math.ceil(Math.random() * sides));
		return result;
	}
	
	/**
	 * Rolls the die n times.
	 * @param n is the number of times to roll the die.
	 * @return the results of the n rolls in an ArrayList of integers.
	 */
	public ArrayList<Integer> roll(int n) {
		ArrayList<Integer> results = new ArrayList();
		for (int i = 0; i < n; i++) {
			results.add(roll());
		}
		return results;
	}

	public int getSides() {
		return sides;
	}
}
