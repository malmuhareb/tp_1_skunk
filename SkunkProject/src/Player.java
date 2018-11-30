
public class Player {
	private String name;
	private int pID;
	private int chips = 50;
	private int score = 0;
	private boolean wFlag = false;
	private boolean active = true;
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean iswFlag() {
		return wFlag;
	}

	public void setwFlag(boolean wFlag) {
		this.wFlag = wFlag;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

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
