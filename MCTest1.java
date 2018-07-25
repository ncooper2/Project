import java.util.Scanner;

public class MCTest1 {

	public static void main(String[] args) {
		Effect e1 = new Effect(EffectType.MELEE, new Roll(new int[][] {{1, 8}}));
		Action sword = new Action("Sword", e1);
		Combatant player = new Combatant("Player", 10, 12, 1, 2, 3, 4, 5, 6, 3, false, null, null, null, null, null, null, new Action[] {sword}, null, 1, 1);
		
		Effect e2 = new Effect(EffectType.MELEE, new Roll(new int[][] {{1, 6}}));
		Action spear = new Action("Spear", e2);
		Combatant goblin = new Combatant("Goblin", 12, 17, 1, 2, 3, 4, 5, 6, 3, false, null, null, null, null, null, null, new Action[] {spear}, null, 1, 1);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the player's current health: ");
		int c1HP = Integer.parseInt(in.nextLine());
		System.out.println("Enter the enemy's current health: ");
		int c2HP = Integer.parseInt(in.nextLine());
		int dcStart = 9;
		int pAtkMod = 4;
		int gAtkMod = 2;
		
		calculateOdds(player, goblin, c1HP, c2HP, dcStart, pAtkMod, gAtkMod);
	}

	public static void calculateOdds(Combatant c1, Combatant c2, int c1HP, int c2HP, int dcStart, int c1AtkMod, int c2AtkMod) {
		int nDraw = 0;
		int nWin = 0;
		int nLose = 0;
		
		for (int i = 0; i < 10000; i++) {
			int result = mortalCombat(c1, c2, c1HP, c2HP, dcStart, c1AtkMod, c2AtkMod);
			switch (result) {
			case 0: nDraw++; break;
			case 1: nLose++; break;
			case 2: nWin++; break;
			}
		}
		Double chanceDraw = nDraw / 10000.0 * 100;
		Double chanceLose = nLose / 10000.0 * 100;
		Double chanceWin = nWin / 10000.0 * 100;
		System.out.println("The chance of you winning is " + chanceWin + "%\n"
				+ "The chance of you dying is " + chanceLose + "%\n"
				+ "The chance of you both living is " + chanceDraw + "%");
	}
	
	public static int mortalCombat(Combatant c1, Combatant c2, int c1HP, int c2HP, int dcStart, int c1AtkMod, int c2AtkMod) {
		c1.setHp(c1HP);
		c2.setHp(c2HP);
		int dc = dcStart;
		int mult = 1;
		//Player has scored a nat 20 and chooses to initiate mortal combat.
		while (true) {
			//Assuming player attacks first
			c1.use(0, c2, mult);
			if (c2.getHp() == 0) {
				return 2;
			}
			
			int r = Roll.roll(1, 20);
			if (r + 4 < dc) {
				//Player fails
				if (r == 1) {
					c2.use(0, c1, 2);
				} else {
					c2.use(0, c1, 1);
				}
				
				if (c1.getHp() == 0) {
					return 1;
				} else {
					return 0;
				}
			} else if (r == 20) {
				if (dc < 15) {
					mult *= 2;
				} else {
					dc = dcStart;
				}
			}
			
			dc++;
		}
	}

}
