import java.sql.ResultSet;
import java.sql.SQLException;

public class CRCalculator {

	public static void main(String[] args) {
		
		Database db = new Database();
		
		ResultSet rs;
		
		try {
			Combatant c = new Combatant("Human Fighter lv. 5", 44, 19, 18, 9, 15, 13, 11, 14, 3, false, null, null, null, null, null,
					new Ability[] {Ability.STRENGTH, Ability.CONSTITUTION}, 
					new Action[] {new Action("Longsword", new Effect(EffectType.MELEE, new Roll(1, 8))),
							new Action("Pike", new Effect(EffectType.MELEE, new Roll(1, 10))),
							new Action("Javelin", new Effect(EffectType.MELEE, new Roll(1, 6)))},
					new Action[] {new Action("Second Wind", new Effect(EffectType.HEAL, new Roll(1, 10)))}, 2, 1);
			db.addCombatant(c);
			rs = db.displayUsers();
			while (rs.next()) {
				System.out.println(rs.getString("id") + ": " + rs.getString("Name"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
