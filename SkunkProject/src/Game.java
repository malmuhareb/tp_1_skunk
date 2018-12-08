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
		printScores(this.playerArray);
		int a = 1;
		while (!round.isWinner() && a == 1) {

			StdOut.println("Play another Round? (Enter 1 or 2) [1:YES | 2:NO ]");
			a = StdIn.readInt();

			if (a == 1){
			round = new Round(this.playerArray);
			printScores(this.playerArray);
			}

		}
		roundChipsSettler(this.playerArray);

		printScores(this.playerArray);
		
		StdOut.println("Game Ended, Score Leader & winner is: ");
		StdOut.println(highScore(this.playerArray).getName());
		

		
	}

	public void printScores(Player[] p) {
		for (int i = 0; i < p.length; i++) {
			StdOut.println("Player Name: " + p[i].getName() + "    Player Current Score: " + p[i].getScore() + "    Player Current Chips: " + p[i].getChips());
			if (p[i].iswFlag()){
				StdOut.println(p[i].getName() + " IS a WINNER!!!");
			}
		}

	}
	public Player highScore(Player[] p){
		int max = p[0].getScore();
		int index = 0;
		for (int i = 1 ; i < p.length ; i++){
			if(p[i].getScore() > max){
				max = p[i].getScore();
				index = i;
			}
			
		}
		return p[index];
		
	}
	private void roundChipsSettler(Player[] p) {
		int wIndex = 0;
		for (int z = 0; z < p.length && p[z].iswFlag() ; z++)
			wIndex = z;
		for (int i = 0; i < p.length && i != wIndex  ; i++){
			if (p[i].getScore() == 0){
				if (p[i].getChips() < 10)
					p[i].setActive(false);
				p[wIndex].setChips(p[wIndex].getChips() + p[i].getChips() );
				p[i].setChips(0);
			}
			else if (p[i].getChips() < 5){
					p[i].setActive(false);
				p[wIndex].setChips(p[wIndex].getChips() + p[i].getChips() );
				p[i].setChips(0);
			}
			else{
				p[wIndex].setChips(p[wIndex].getChips() + 5 );
				p[i].setChips(p[i].getChips() - 5);
				
			}
			
			
		
		}

	}
}
