import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private static Connection con;
	private static boolean hasData = false;
	
	public ResultSet displayUsers() throws ClassNotFoundException, SQLException {
		if (con == null) {
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT id, Name FROM Combatant");
		
		return res;
	}
	
	private void getConnection() throws ClassNotFoundException, SQLException {
		con = DriverManager.getConnection("jdbc:sqlite:CRCalc.db");
		initialize();
	}
	
	private void initialize() throws SQLException {
		if (!hasData) {
			hasData = true;
			Statement state = con.createStatement();
			ResultSet res = state.executeQuery("SELECT name FROM sqlite_master "
					+ "WHERE type='table' AND name='Combatants'");
			if (!res.next()) {
				try {
					System.out.print("Building the User table with prepopulated values");
					//build table
					Statement state2 = con.createStatement();
					state2.execute("CREATE TABLE Combatant ( id INTEGER, Name TEXT UNIQUE, HP INTEGER, "
							+ "AC INTEGER, STR INTEGER, DEX INTEGER, CON INTEGER, INT INTEGER, "
							+ "WIS INTEGER, CHA INTEGER, ProficiencyBonus INTEGER, Caster BOOLEAN, "
							+ "SpellSlots ARRAY, Actions ARRAY, DamageImmunities ARRAY, "
							+ "ConditionImmunities ARRAY, Vulnerabilities ARRAY, Resistances ARRAY, "
							+ "SavingThrows ARRAY, "
							+ "primary key(id));");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * Add a combatant to the database
	 * @param firstName
	 * @param lastName
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void addCombatant(Combatant c) throws ClassNotFoundException, SQLException {
		
		if (con == null) {
			getConnection();
		}
		
		try {
			Statement state = con.createStatement();
			state.execute("INSERT INTO Combatant (Name, HP, AC, STR, DEX, CON, INT, WIS, CHA, ProficiencyBonus) values ('" 
					+ c.getName() + "', '" 
					+ c.getHp() + "', '"
					+ c.getAc() + "', '"
					+ c.getStr() + "', '"
					+ c.getDex() + "', '"
					+ c.getCon() + "', '"
					+ c.getIntel() + "', '"
					+ c.getWis() + "', '"
					+ c.getCha() + "', '"
					+ c.getProficiencyBonus()
					+ "');");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
