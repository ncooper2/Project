
public enum DamageType {
	ACID, BLUDGEONING, COLD, FIRE, FORCE, LIGHTNING, NECROTIC, PIERCING, 
	POISON, PSYCHIC, RADIANT, SLASHING, THUNDER;
	
	public String toString(DamageType e) {
		switch (e) {
		case ACID: return "ACID";
		case BLUDGEONING: return "BLUDGEONING";
		case COLD: return "COLD";
		case FIRE: return "FIRE";
		case FORCE: return "FORCE";
		case LIGHTNING: return "LIGHTNING";
		case NECROTIC: return "NECROTIC";
		case PIERCING: return "PIERCING";
		case POISON: return "POISON";
		case PSYCHIC: return "PSYCHIC";
		case RADIANT: return "RADIANT";
		case SLASHING: return "SLASHING";
		case THUNDER: return "THUNDER";
		}
		return null;
	}
	
	public DamageType toDamageType(String s) {
		switch (s) {
		case "ACID": return ACID;
		case "BLUDGEONING": return BLUDGEONING;
		case "COLD": return COLD;
		case "FIRE": return FIRE;
		case "FORCE": return FORCE;
		case "LIGHTNING": return LIGHTNING;
		case "NECROTIC": return NECROTIC;
		case "PIERCING": return PIERCING;
		case "POISON": return POISON;
		case "PSYCHIC": return PSYCHIC;
		case "RADIANT": return RADIANT;
		case "SLASHING": return SLASHING;
		case "THUNDER": return THUNDER;
		}
		return null;
	}
}
