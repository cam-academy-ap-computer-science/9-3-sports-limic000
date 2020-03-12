
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
	
	public boolean equals(Object o) {
		boolean equalToEachOther = false;
		BasketballPlayer p = (BasketballPlayer)o;
		if (p instanceof BasketballPlayer) {
			if (super.equals(o) == false) {
				equalToEachOther = false;;
			}
			if (super.equals(o) != false) {
				int equal = 0;
				if (teamNum == p.teamNum) {
					equal++;
				}
				if (position.equals(p.position)) {
					equal++;
				}
				if (yearsPlayed == p.yearsPlayed) {
					equal++;
				}
				if(equal == 3) {
					equalToEachOther = true;
				}
				else {
					equalToEachOther = false;
				}
			}
		}
		return equalToEachOther; 
		
	}
}
