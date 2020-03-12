
public class SportsMain {
	
	public static void main(String[] args) {
		//tests toString and initialization
		Player newPlayer = new BasketballPlayer ("Bob", 16, 18, "center", 5);
		String np1 = newPlayer.toString();
		System.out.println(np1);
		
		//tests equals for Player class
		Player newPlayer2 = new BasketballPlayer ("Katie", 12, 16, "center", 2);
		Player newPlayer3 = new BasketballPlayer ("Katie", 12, 16, "center", 2);
		System.out.println(newPlayer2.equals(newPlayer3));
	}
}
