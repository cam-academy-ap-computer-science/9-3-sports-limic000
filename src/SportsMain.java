
public class SportsMain {
	
	public static void main(String[] args) {
		//tests toString and initialization
		Player newPlayer = new BasketballPlayer ("Bob", 16, 18, "center", 5);
		String np1 = newPlayer.toString();
		System.out.println(np1);
		
		//tests equals for Player class
		Player newPlayer2 = new Player ("Katie", 12, "Baseball");
		Player newPlayer3 = new Player ("Katie", 12, "Baseball");
		System.out.println(newPlayer2.equals(newPlayer3));
	}
}
