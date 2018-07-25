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
	private int str;
	private int dex;
	private int con;
	private int intel;
	private int wis;
	private int cha;
	private int proficiencyBonus;
	private boolean caster;
	private int[] spellSlots;
	private Condition[] conditionImmunities;
	private DamageType[] damageImmunities;
	private DamageType[] vulnerabilities;
	private DamageType[] resistances;
	private Ability[] savingThrows;
	//Actions this combatant can perform
	private Action[] actions;
	private Action[] bonusActions;
	private int nActions;
	private int nBonusActions;
	private int nAttackActions;
	private int nSpellAttackActions;
	
	public Combatant(String name, int hp, int ac) {
		this.name = name;
		this.maxHp = hp;
		this.hp = hp;
		this.ac = ac;
		this.str = 10;
		this.dex = 10;
		this.con = 10;
		this.intel = 10;
		this.wis = 10;
		this.cha = 10;
		this.proficiencyBonus = 0;
		this.caster = false;
		this.spellSlots = new int[9]; 
		this.conditionImmunities = null;
		this.damageImmunities = null; 
		this.vulnerabilities = null;
		this.resistances = null; 
		this.savingThrows = null;
		this.actions = null;
		this.bonusActions = null;
		this.nActions = 1;
		this.nBonusActions = 1;
	}
	
	public Combatant(String name, int hp, int ac, int str, int dex, int con, int intel, int wis, int cha, int proficiencyBonus, 
			boolean caster, int[] spellSlots, Condition[] conditionImmunities, DamageType[] damageImmunities, 
			DamageType[] vulnerabilities, DamageType[] resistances, Ability[] savingThrows, Action[] actions, Action[] bonusActions,
			int nActions, int nBonusActions) {
		this(name, hp, ac);
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
		this.proficiencyBonus = proficiencyBonus;
		this.caster = caster;
		this.spellSlots = spellSlots; 
		this.conditionImmunities = conditionImmunities;
		this.damageImmunities = damageImmunities; 
		this.vulnerabilities = vulnerabilities;
		this.resistances = resistances; 
		this.savingThrows = savingThrows;
		this.actions = actions;
		this.bonusActions = bonusActions;
		this.nActions = nActions;
		this.nBonusActions = nBonusActions;
	}
	
	/**
	 * This Combatant uses an action on the specified target
	 * @param a is the action to perform
	 * @param target 
	 */
	public void use(Action a, Combatant target) {
		Effect[] e = a.getEffects();
		Effect curr;
		for (int i = 0; i < e.length; i++) {
			curr = e[i];
			//TODO: add isMelee, isRanged, isFiness, ... methods to Effect and replace this system
			if (curr.getType()[0] == EffectType.MELEE) {
				target.damage(curr.getRoll().roll());
			} else if (curr.getType()[0] == EffectType.HEAL) {
				target.heal(curr.getRoll().roll());
			}
		}
	}
	
	public void use(int n, Combatant target, int mult) {
		Action a = actions[n];
		Effect[] e = a.getEffects();
		Effect curr;
		for (int i = 0; i < e.length; i++) {
			curr = e[i];
			if (curr.getType()[0] == EffectType.MELEE) {
				target.damage(curr.getRoll().roll() * mult);
			} else if (curr.getType()[0] == EffectType.HEAL) {
				target.heal(curr.getRoll().roll() * mult);
			}
		}
	}
	
	public void useRandom(int n) {
		int acts = actions.length;
		Action a;
		for (int i = 0; i < n; i++) {
			a = actions[(int) (Math.ceil(Math.random() * acts)) - 1];
			//a.use(a, target);
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

	/*public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}*/

	public int getStr() {
		return str;
	}

	public Action[] getActions() {
		return actions;
	}

	public void setActions(Action[] actions) {
		this.actions = actions;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public int getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	public boolean isCaster() {
		return caster;
	}

	public void setCaster(boolean caster) {
		this.caster = caster;
	}

	public int[] getSpellSlots() {
		return spellSlots;
	}

	public void setSpellSlots(int[] spellSlots) {
		this.spellSlots = spellSlots;
	}

	public Condition[] getConditionImmunities() {
		return conditionImmunities;
	}

	public void setConditionImmunities(Condition[] conditionImmunities) {
		this.conditionImmunities = conditionImmunities;
	}

	public DamageType[] getDamageImmunities() {
		return damageImmunities;
	}

	public void setDamageImmunities(DamageType[] damageImmunities) {
		this.damageImmunities = damageImmunities;
	}

	public DamageType[] getVulnerabilities() {
		return vulnerabilities;
	}

	public void setVulnerabilities(DamageType[] vulnerabilities) {
		this.vulnerabilities = vulnerabilities;
	}

	public DamageType[] getResistances() {
		return resistances;
	}

	public void setResistances(DamageType[] resistances) {
		this.resistances = resistances;
	}

	public Ability[] getSavingThrows() {
		return savingThrows;
	}

	public void setSavingThrows(Ability[] savingThrows) {
		this.savingThrows = savingThrows;
	}
}
