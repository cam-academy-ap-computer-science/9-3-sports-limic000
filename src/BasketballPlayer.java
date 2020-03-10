
public class BasketballPlayer extends Player{
	private int teamNum;
	private String position;
	private int yearsPlayed;
	
	public BasketballPlayer (String name1, int age1, int teamNum1, String position1, int yearsPlayed1) {
		super(name1, age1, "Basketball");
		teamNum = teamNum1;
		position = position1;
		yearsPlayed = yearsPlayed1;
	}
	
	public String toString() {
		return super.toString() + " " + teamNum + " " + position + " " + yearsPlayed;
	}
	
	public boolean equals(BasketballPlayer o) {
		if (super.equals(o) == false) {
			return false;
		}
		if (super.equals(o) != false) {
			int equal = super.equal;
		}
		
	}
}
