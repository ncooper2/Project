
public class Roll {

	public static int roll(int n, int sides) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += (int) (Math.ceil(Math.random() * sides));
		}
		
		return result;
	}
	
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
