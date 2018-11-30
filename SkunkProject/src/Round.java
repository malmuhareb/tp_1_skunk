import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Round {

	// private int rID = 0;
	private int roundScore = 0;
	private int kitty = 0;
	private Turn turn;
	boolean winner = false;

	public Round(Player[] playerArray) {
		// rID++;
		startRound(playerArray);

	}

	public void startRound(Player[] playerArray) {

		// turn = new Turn(player);

		int n = playerArray.length;
		int s;
		int index;

		for (int i = 0; i < n; i++) {

			turn = new Turn(playerArray[i]);
			s = turn.getTurnScore();
			updateScore(playerArray[i], s);
			kitty += turn.getTurnKitty();
			if (checkWin(playerArray[i])) {

				for (int z = 1; z < playerArray.length; z++) {
					index = i++ % playerArray.length;
					turn = new Turn(playerArray[index]);
					s = turn.getTurnScore();
					updateScore(playerArray[i], s);

				}
				finalScoreCheck(playerArray);

			}

		}

	}

	private void updateScore(Player player, int s) {

		if (s == -1) {
			player.setScore(0);
			StdOut.println(player.getName() + " Total Score = " + player.getScore());

		} else {
			player.setScore(player.getScore() + s);

			StdOut.println(player.getName() + " Total Score = " + player.getScore());

		}

	}

	private boolean checkWin(Player player) {
		// player.getScore();
		if (player.getScore() >= 100) {
			StdOut.println(player.getName() + " Won The Round. Would you like to "
					+ "stop or continue and raise the Goal?" + "(Enter 1 or 2) [1:STOP | 2:CHANGE GOAL]");
			StdIn.readInt();
			if (StdIn.readInt() == 1) {
				winner = true;
			}

		}
		return winner;

	}

	private void finalScoreCheck(Player[] playerArray) {
		int max = playerArray[0].getScore();
		for (int i = 1; i < playerArray.length; i++) {

			if (max < playerArray[i].getScore()) {
				max = playerArray[i].getScore();
			}

		}
		for (int i = 0; i < playerArray.length; i++) {
			if (max == playerArray[i].getScore()) {
				playerArray[i].setwFlag(true);

			}

		}

	}
}
