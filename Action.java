/**
 * 
 * @author Nathan
 *
 */
public class Action {
	
	private String name;
	private Effect[] effects;
	private int cost;
	
	public Action(String name, Effect[] effects, int cost) {
		this.name = name;
		this.effects = effects;
	}
	
	public Action(String name, Effect effect) {
		this(name, new Effect[] {effect}, 0);
	}
	
	public Action(String name, Effect effect, int cost) {
		this(name, new Effect[] {effect}, cost);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Effect[] getEffects() {
		return effects;
	}

	public void setEffects(Effect[] effects) {
		this.effects = effects;
	}
	
	
}
