
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
	
	public boolean equals(Player o){
		int equal = 0;
		if (name.equals(o.name)) {
			equal +=1;
		}
		if (age == o.age) {
			equal +=1;
		}
		if (sport == o.sport) {
			equal +=1;
		}
		if (equal == 3) {
			return true;
		}
		else {
			return false;
		}
	}
}
