import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Game {
	// private int roundID;
	private int numOfPlayers;
	private Player[] playerArray;
	private Round round;
	private int kitty;

	public int getKitty() {
		return kitty;
	}

	public void setKitty(int kitty) {
		this.kitty = kitty;
	}

	public Game(int n) {
		if (checkNumOfPlayers(n)) {
			numOfPlayers = n;
			playerArray = new Player[n];
			kitty = 0;
		} else
			numOfPlayers = -1;
	}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}

	public boolean checkNumOfPlayers(int n) {
		if (n < 2 || n > 8)
			return false;
		else
			return true;

	}

	public void addPlayer(String name, int pID) {
		playerArray[pID] = new Player(name, pID);

	}

	public void startRound() {
		round = new Round(this.playerArray);
		StdOut.println("Play another Round? (Enter 1 or 2) [1:YES | 2:NO ]");
		int a = StdIn.readInt();
		if (a == 1){
			startRound();	
		}
		
		/*int n = playerArray.length;
		for (int i = 0; i < n; i++) {
			round = new Round(playerArray[i]);
			playerArray[i].getScore();
		}*/
	}
	public void printWinner(){
		
	}
}
