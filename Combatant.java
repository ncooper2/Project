
public class Combatant {
	
	//The max number of hp this combatant can have
	private int maxHp;
	//The number of health points this combatant currently has.
	private int hp;
	//The armor class of this combatant
	private int ac;
	
	public Combatant(int hp, int ac) {
		this.maxHp = hp;
		this.hp = hp;
		this.ac = ac;
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
}
