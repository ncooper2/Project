
public class RollTest {

	public static void main(String[] args) {
		test01OneRoll();
		test02MultipleRolls();
	}
	
	public static void test01OneRoll() {
		int total = 0;
		for (int i = 0; i < 100; i++) {
			total += Roll.roll(4, 6);
		}
		
		System.out.println(total / 100);
	}
	
	public static void test02MultipleRolls() {
		int total = 0;
		int[][] rolls = {{2, 4}, {3, 8}, {5, 10}};
		for (int i = 0; i < 100; i++) {
			total += Roll.roll(rolls);
		}
		
		System.out.println(total / 100);
	}

}
