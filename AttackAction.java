
/**
 * 
 * @author Nathan
 *
 */
public class AttackAction extends Action {
	
	private int[][] damage;
	
	public AttackAction(String description, int[][] damage) {
		super(description);
		this.damage = damage;
	}
	
	public void use(Combatant target) {
		int targetAc = target.getAc();
		if (Roll.roll(1, 20) >= targetAc) {
			int totDamage = Roll.roll(damage);
			target.damage(Roll.roll(damage));
			System.out.println("Hit. Deal " + totDamage + " damage.");
		} else {
			System.out.println("Miss.");
		}
	}
}
