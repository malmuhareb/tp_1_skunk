
public class Player {
	private String name;
	private int pID;
	private int chips = 50;
	public int getChips() {
		return chips;
	}

	public void setChips(int chips) {
		this.chips = chips;
	}


	//roll score, turn score, and round score 
	private int rollScore = 0; 
	private int turnScore = 0;
	private int roundScore = 0;
	public int getRollScore() {
		return rollScore;
	}

	public void setRollScore(int rollScore) {
		this.rollScore = rollScore;
	}

	public int getTurnScore() {
		return turnScore;
	}

	public void setTurnScore(int turnScore) {
		this.turnScore = turnScore;
	}

	public int getRoundScore() {
		return roundScore;
	}

	public void setRoundScore(int roundScore) {
		this.roundScore = roundScore;
	}


	
	
	public Player(String s, int ID){
		name = s;
		pID = ID;
		
	}

	public String getName() {
		return name;
	}


	public int getpID() {
		return pID;
	}

	

}
