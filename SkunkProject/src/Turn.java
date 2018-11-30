import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Turn {
	private int turnScore = 0;
	private Roll roll;
	private int turnKitty = 0;

	public int getTurnScore() {
		return turnScore;
	}

	public Turn(Player player) {
		if (player.isActive())
			TurnStart(player);
		else
			StdOut.println("Skipping Inactive player, " + player.getName());
			
	}

	private void TurnStart(Player player) {
		int b = 1; // flag used if player wants to roll again
		StdOut.println("Hi, " + player.getName());
		StdOut.println("Would you like to start your turn? (Enter 1 or 2) [1:YES | 2:NO ]");
		int a = StdIn.readInt();
		do {
			if (a == 1) {

				roll = new Roll();
				if (roll.isDoubleSkunk()) {
					// player.setChips(player.getChips() - 4);

					turnScore = -1;
					StdOut.println(
							"You Rolled, 1st Die:  " + roll.getDie1Roll() + "   2nd Die:  " + roll.getDie2Roll());
					StdOut.println("Sorry " + player.getName() + ", Double Skunk Rolled!! ");
					chipsSettler(player, 4);
					if (!chipsChecker(player)) {
						StdOut.println("Sorry " + player.getName() + ", You Have been Disqulified!! ");
						StdOut.println("You Don't Have Enough Chips to Play!! ");
						
					}
					b = 0;
				} else if (roll.isSkunk()) {
					// player.setChips(player.getChips() - 1);
					turnScore = 0;
					StdOut.println(
							"You Rolled, 1st Die:  " + roll.getDie1Roll() + "   2nd Die:  " + roll.getDie2Roll());
					StdOut.println("Sorry " + player.getName() + ", Skunk Rolled!! ");
					chipsSettler(player, 1);
					if (!chipsChecker(player)) {
						StdOut.println("Sorry " + player.getName() + ", You Have been Disqulified!! ");
						StdOut.println("You Don't Have Enough Chips to Play!! ");
						

					}
					b = 0;

				} else if (roll.isSkunkDuce()) {
					// player.setChips(player.getChips() - 2);
					turnScore = 0;
					StdOut.println(
							"You Rolled, 1st Die:  " + roll.getDie1Roll() + "   2nd Die:  " + roll.getDie2Roll());
					StdOut.println("Sorry " + player.getName() + ", Skunk & Duce Rolled!! ");
					chipsSettler(player, 2);
					if (!chipsChecker(player)) {
						StdOut.println("Sorry " + player.getName() + ", You Have been Disqulified!! ");
						StdOut.println("You Don't Have Enough Chips to Play!! ");
						

					}
					b = 0;

				} else {
					turnScore += roll.getRollScore();
					StdOut.println(
							"You Rolled, 1st Die:  " + roll.getDie1Roll() + "   2nd Die:  " + roll.getDie2Roll());
					StdOut.println("Total: " + roll.getRollScore());
					StdOut.println("You Turn Score: " + this.turnScore);
					StdOut.println("Would you like to roll again? (Enter 1 or 2) [1:YES | 2:NO ]");
					b = StdIn.readInt();
				}
			}

		} while (b == 1);

		StdOut.println("End of " + player.getName() + " Turn....");
		// StdOut.println(player.getName() + " Current Score: " +
		// player.getScore());

	}

	private boolean chipsChecker(Player p) {

		if (p.getChips() >= 4)
			return true;
		else{
			p.setActive(false);
			return false;
		}

	}

	private void chipsSettler(Player p, int change) {
		int cChips = p.getChips();
		if (cChips >= change) {
			p.setChips(p.getChips() - change);
			payKitty(change);
		} else {
			p.setChips(0);
			payKitty(cChips);
		}

	}

	public int getTurnKitty() {
		return turnKitty;
	}

	private void payKitty(int c) {
		this.turnKitty += c;

	}

}
