
public class Game {
	// private int gameID;
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
		if (checkNumOfPlayers(n)){
		numOfPlayers = n;
		playerArray = new Player[n];
		kitty = 0;
		}
		else numOfPlayers = -1;
	}

	

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}
	
	public boolean checkNumOfPlayers(int n){
		if (n < 2 || n > 8) return false;
		else return true;
		
	}
	
	public void addPlayer(String name, int pID){
		playerArray[pID] = new Player(name, pID);
		
	}



	public void startRound() {
		round = new Round(this.playerArray);
		
	}
}
