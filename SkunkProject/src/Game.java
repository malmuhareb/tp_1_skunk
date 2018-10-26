
public class Game {
	// private int gameID;
	private int numOfPlayers;
	private Player[] playerArray;
	private Round round;

	public Game(int n) {
		if (checkNumOfPlayers(n)){
		numOfPlayers = n;
		playerArray = new Player[n];
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
