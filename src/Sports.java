
public class Sports{
	Player [] myplayers;
	private String sportsType;
	private String team_individual;
	
	public Sports (String n_sportsType, String n_team_individual) {
		sportsType = n_sportsType;
		team_individual = n_team_individual;
	}

	public void loadPlayers(Player[] n_myPlayers) {
		myplayers = n_myPlayers;
	}

	public void printRoster() {
		for (int i = 0; i < myplayers.length; i++) {
			System.out.println(myplayers[i]);
	    		myplayers [i].toString();
		}
	}
	
	public String toString() {
		return "The sport " + sportsType + " is an " + team_individual + " sport.";
	}

}
