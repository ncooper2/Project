import java.util.ArrayList;

public class Combatant {
	
	//Name of the combatant
	private String name;
	//The max number of hp this combatant can have
	private int maxHp;
	//The number of health points this combatant currently has.
	private int hp;
	//The armor class of this combatant
	private int ac;
	//Actions this combatant can perform
	private ArrayList<Action> actions;
	
	public Combatant(String name, int hp, int ac, ArrayList<Action> actions) {
		this.name = name;
		this.maxHp = hp;
		this.hp = hp;
		this.ac = ac;
		this.actions = actions;
	}
	
	public void use(int a, Combatant target) {
		Action action = actions.get(a);
		if (action instanceof AttackAction) {
			((AttackAction)action).use(this, target);
		}
	}
	
	/**
	 * Inflicts p points of damage on the combatant
	 * @param p is the number of points of damage to inflict.
	 * @return 
	 */
	public void damage(int p) {
		hp -= p;
		if (hp < 0) {
			hp = 0;
		}
	}
	
	public void heal(int p) {
		hp += p;
		if (hp > maxHp) {
			hp = maxHp;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}
	
	
}
