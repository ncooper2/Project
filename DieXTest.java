import java.util.ArrayList;

public class DieXTest {

	public static void main(String[] args) {
		test01RollOnce();
		test02RollMultiple();
		
	}
	
	private static void test01RollOnce() {
		int n = 20;
		DieX dn = new DieX(n);
		int[] counts = new int[n];
		
		for (int i = 0; i < n; i++) {
			counts[i] = 0;
		}
		
		for (int i = 0; i < 10000; i++) {
			int result = dn.roll();
			counts[result - 1] += 1;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ": " + counts[i]);
		}
	}
	
	private static void test02RollMultiple() {
		int n = 20;
		DieX dn = new DieX(n);
		int nRolls = 100;
		ArrayList<Integer> results = dn.roll(nRolls);
		
		for (int i = 0; i < results.size(); i++) {
			System.out.println((i + 1) + ": " + results.get(i));
		}
		
		System.out.println("Number of results: " + results.size());
	}

}
