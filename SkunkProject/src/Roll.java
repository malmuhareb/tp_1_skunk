
public class Roll {
	//private int rollID = 0;
	private int rollScore = 0;
	public int getRollScore() {
		return rollScore;
	}

	private boolean isSkunk = false;
	private boolean isDoubleSkunk = false;
	private boolean isSkunkDuce = false;
	private int die1Roll;
	public int getDie1Roll() {
		return die1Roll;
	}
	public int getDie2Roll() {
		return die2Roll;
	}

	private int die2Roll;
	
	
	private Dice dice = new Dice();
	
	public Roll(){
		//rollID++;
		dice.roll();
		rollScore = dice.getLastRoll();
		setIndivisualDies();
	}
	public void setIndivisualDies() {
		die1Roll = dice.getDie1().getLastRoll();
		die2Roll = dice.getDie2().getLastRoll();
	
	}
	public boolean isDoubleSkunk(){
		
		if (rollScore == 2){
			isDoubleSkunk = true;	
		}
		return isDoubleSkunk;
		
	}
public boolean isSkunk(){
		
		if (die1Roll == 1 || die2Roll == 1){
			isSkunk = true;	
		}
		return isSkunk;
		
	}

public boolean isSkunkDuce(){
	
	if ((die1Roll == 1 && die2Roll == 2) || (die1Roll == 2 && die2Roll == 1)){
		isSkunkDuce = true;	
	}
	return isSkunkDuce;
	
}


}
