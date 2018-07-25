
public enum Ability {
	STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA;
	
	public String toString(Ability e) {
		switch (e) {
		case STRENGTH: return "STRENGTH";
		case DEXTERITY: return "DEXTERITY";
		case CONSTITUTION: return "CONSTITUTION";
		case INTELLIGENCE: return "INTELLIGENCE";
		case WISDOM: return "WISDOM";
		case CHARISMA: return "CHARISMA";
		}
		return null;
	}
	
	public Ability toAbility(String s) {
		switch (s) {
		case "STRENGTH": return STRENGTH;
		case "DEXTERITY": return DEXTERITY;
		case "CONSTITUTION": return CONSTITUTION;
		case "INTELLIGENCE": return INTELLIGENCE;
		case "WISDOM": return WISDOM;
		case "CHARISMA": return CHARISMA;
		}
		return null;
	}
}
