
public enum Condition {
	BLINDED, CHARMED, DEAFENED, FATIGUED, FRIGHTENED, GRAPPLED, INCAPACITATED, 
	INVISIBLE, PARALYZED, PETRIFIED, POISONED, PRONE, RESTRAINED, STUNNED, 
	UNCONSCIOUS, EXHAUSTION;
	
	public String toString(Condition e) {
		switch (e) {
		case BLINDED: return "BLINDED";
		case CHARMED: return "CHARMED";
		case DEAFENED: return "DEAFENED";
		case FATIGUED: return "FATIGUED";
		case FRIGHTENED: return "FRIGHTENED";
		case GRAPPLED: return "GRAPPLED";
		case INCAPACITATED: return "INCAPACITATED";
		case INVISIBLE: return "INVISIBLE";
		case PARALYZED: return "PARALYZED";
		case PETRIFIED: return "PETRIFIED";
		case POISONED: return "POISONED";
		case PRONE: return "PRONE";
		case RESTRAINED: return "RESTRAINED";
		case STUNNED: return "STUNNED";
		case UNCONSCIOUS: return "UNCONSCIOUS";
		case EXHAUSTION: return "EXHAUSTION";
		}
		return null;
	}
	
	public Condition toCondition(String s) {
		switch (s) {
		case "BLINDED": return BLINDED;
		case "CHARMED": return CHARMED;
		case "DEAFENED": return DEAFENED;
		case "FATIGUED": return FATIGUED;
		case "FRIGHTENED": return FRIGHTENED;
		case "GRAPPLED": return GRAPPLED;
		case "INCAPACITATED": return INCAPACITATED;
		case "INVISIBLE": return INVISIBLE;
		case "PARALYZED": return PARALYZED;
		case "PETRIFIED": return PETRIFIED;
		case "POISONED": return POISONED;
		case "PRONE": return PRONE;
		case "RESTRAINED": return RESTRAINED;
		case "STUNNED": return STUNNED;
		case "UNCONSCIOUS": return UNCONSCIOUS;
		case "EXHAUSTION": return EXHAUSTION;
		}
		return null;
	}
}
