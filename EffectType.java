
public enum EffectType {
	MELEE, RANGED, HEAL, CONDITION, FINESS, VERSATILE;
	
	public String toString(EffectType e) {
		switch (e) {
		case MELEE: return "MELEE";
		case RANGED: return "RANGED";
		case HEAL: return "HEAL";
		case CONDITION: return "CONDITION";
		case FINESS: return "FINESS";
		case VERSATILE: return "VERSATILE";
		}
		return null;
	}
	
	public EffectType toEffectType(String s) {
		switch (s) {
		case "MELEE": return MELEE;
		case "RANGED": return RANGED;
		case "HEAL": return HEAL;
		case "CONDITION": return CONDITION;
		case "FINESS": return FINESS;
		case "VERSATILE": return VERSATILE;
		}
		return null;
	}
}
