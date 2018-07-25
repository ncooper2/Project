import java.util.ArrayList;

public class FightTest1 {

	public static void main(String[] args) {
		
		/*AttackAction sword = new AttackAction("Sword", new int[][] {{1, 8}});
		ArrayList<Action> playerActions = new ArrayList();
		playerActions.add(sword);
		Combatant player = new Combatant("Player", 20, 15);
		
		AttackAction spear = new AttackAction("Sword", new int[][] {{1, 6}});
		ArrayList<Action> goblinActions = new ArrayList();
		goblinActions.add(spear);
		Combatant goblin = new Combatant("Goblin", 12, 17);
		
		while (true) {
			//Assuming player attacks first
			player.use(0, goblin);
			if (goblin.getHp() == 0) {
				System.out.println("The goblin has been slain. The player is victorious!");
				break;
			}
			//Assuming player attacks first
			goblin.use(0, player);
			if (player.getHp() == 0) {
				System.out.println("The player has fallen. The mosnter wins!");
				break;
			}
		}
		
		int wins = 0;
		int fights = 10000;
		for (int i = 0; i < fights; i++) {
			player.setHp(player.getMaxHp());
			goblin.setHp(goblin.getMaxHp());
			if (fight(player, goblin)) {
				wins++;
			}
		}
		
		System.out.println("Player won " + wins + " out of " + fights + " fights. "
				+ "The player's chance of winning is " + ((double)wins / (double)fights * 100) + "%");*/
	}
	
	/*public static boolean fight(Combatant c1, Combatant c2) {
		while (true) {
			c1.use(0, c2);
			if (c2.getHp() == 0) {
				return true;
			}
			//Assuming player attacks first
			c2.use(0, c1);
			if (c1.getHp() == 0) {
				return false;
			}
		}
	}*/

}
