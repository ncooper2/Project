
/**
 * This class is used to generate random numbers that simulate rolling dice.
 * @author Nathan
 *
 */
public class Roll {

	/**
	 * Roll a single type of die a certain number of times. 
	 * Used to calculate rolls such as 4d6.
	 * @param n is the number of dice to roll.
	 * @param sides is the type of die to roll.
	 * @return
	 */
	public static int roll(int n, int sides) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += (int) (Math.ceil(Math.random() * sides));
		}
		
		return result;
	}
	
	/**
	 * Executes a series of rolls and sums the results.
	 * @param rolls is a two dimensional array of where each entry is an instruction to roll
	 * 	One type of die a certain number of times.
	 * @return
	 */
	public static int roll(int[][] rolls) {
		int result = 0;
		for (int i = 0; i < rolls.length; i++) {
			if (rolls[i].length == 2) {
				result += roll(rolls[i][0], rolls[i][1]);
			}
		}
		
		return result;
	}
}
