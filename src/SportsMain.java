
public class SportsMain {
	
	public static void main(String[] args) {
		//tests toString and initialization
		Player newPlayer = new BasketballPlayer ("Bob", 16, 18, "center", 5);
		String np1 = newPlayer.toString();
		System.out.println(np1);
		System.out.println();
		
		//tests equals for Player class
		Player newPlayer2 = new BasketballPlayer ("Katie", 12, 16, "center", 2);
		Player newPlayer3 = new BasketballPlayer ("Katie", 12, 16, "center", 2);
		System.out.println(newPlayer2.equals(newPlayer3));
		System.out.println();
		
		//tests the Sports array
		Player[] somePlayers = {newPlayer, newPlayer2, newPlayer3};
		Sports arrayOfPlayers = new Sports ("Basketball", "team");
		arrayOfPlayers.loadPlayers(somePlayers);
		System.out.println(arrayOfPlayers.toString());
		arrayOfPlayers.printRoster();
		System.out.println();
		
		Player[] somePlayers2 = {new Player("Max", 7, "Swimming"), new Player("Jane", 12, "Swimming")};
		Sports arrayOfPlayers2 = new Sports ("Swimming", "individual");
		arrayOfPlayers2.loadPlayers(somePlayers2);
		System.out.println(arrayOfPlayers2.toString());
		arrayOfPlayers2.printRoster();
		
	}
}
