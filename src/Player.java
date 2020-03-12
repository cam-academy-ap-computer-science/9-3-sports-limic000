
public class Player {
	private String name;
	private int age;
	private String sport;
	
	public Player (String name1, int age1, String sport1) {
		name = name1;
		age = age1;
		sport = sport1;
	}
	
	public String toString() {
		String playerToString = name+ " " + age + " " + sport;
		return playerToString;
	}
	
	public boolean equals (Object o) {
		Player p = (Player)o;
		if (o instanceof Player) {
			int equal = 0;
			if (name.equals(p.name)) {
				equal +=1;
			}
			if (age == p.age) {
				equal +=1;
			}
			if (sport == p.sport) {
				equal +=1;
			}
			if (equal == 3) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
