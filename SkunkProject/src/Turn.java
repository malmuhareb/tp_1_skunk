import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Turn {
	private int turnScore = 0;

	public Turn(Player player) {
		TurnStart(player);
	}

	private void TurnStart(Player player) {
		StdOut.print("Hi, " + player.getName());
		StdOut.print("Would you like to start your turn? (Enter 1 or 2) [1:YES | 2:NO ] " + player.getName());
		int a = StdIn.readInt();
		if(a == 1){
			
		}
		
	}

}
