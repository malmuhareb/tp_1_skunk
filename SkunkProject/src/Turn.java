import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Turn {
	private int turnScore = 0;
	private Roll roll;

	public Turn(Player player) {
		TurnStart(player);
	}

	private void TurnStart(Player player) {
		StdOut.println("Hi, " + player.getName());
		StdOut.println("Would you like to start your turn? (Enter 1 or 2) [1:YES | 2:NO ]");
		int a = StdIn.readInt();
		if (a == 1) {
			roll = new Roll();
			if (roll.isDoubleSkunk()) {
				player.setChips(player.getChips() - 4);
				StdOut.println("Sorry " + player.getName() + ", Double Skunk Rolled!! ");
			} else if (roll.isSkunk()) {
				player.setChips(player.getChips() - 1);

			} else if (roll.isSkunkDuce()) {

			}
			else{
				turnScore += roll.getRollScore();
				StdOut.println("You Rolled: " + roll.getRollScore());
				StdOut.println("You Turn Score: " + this.turnScore);
				StdOut.println("Would you like to roll again? (Enter 1 or 2) [1:YES | 2:NO ]");
			}
			
			int b = StdIn.readInt();
			while (b == 1) {
				roll = new Roll();
				turnScore += roll.getRollScore();
				StdOut.println("Would you like to roll again? (Enter 1 or 2) [1:YES | 2:NO ]");
				b = StdIn.readInt();

			}

		}

	}

}
