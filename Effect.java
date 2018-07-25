/**
 * 
 * @author Nathan
 *
 */
public class Effect {
	
	private EffectType[] type;
	private Roll roll;
	private boolean profficient;
	
	public Effect(EffectType[] t, Roll r, boolean profficient) {
		type = t;
		roll = r;
		this.profficient = profficient;
	}
	
	public Effect(EffectType t, Roll r) {
		this(new EffectType[] {t}, r, false);
	}
	
	public Effect(EffectType t, Roll r, boolean profficient) {
		this(new EffectType[] {t}, r, profficient);
	}

	public EffectType[] getType() {
		return type;
	}

	public void setType(EffectType[] type) {
		this.type = type;
	}

	public Roll getRoll() {
		return roll;
	}

	public void setRoll(Roll roll) {
		this.roll = roll;
	}
}
