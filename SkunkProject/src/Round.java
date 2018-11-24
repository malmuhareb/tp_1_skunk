
public class Round {
	
private int rID = 0;
private int RoundScore = 0;
private Turn turn;


public Round(Player[] playerArray){
	rID++;
	startRound(playerArray);
	
	
}

public void startRound(Player[] playerArray){
	int n = playerArray.length;
	
	for (int i = 0; i < n; i++){
		
		turn = new Turn(playerArray[i]);
		
	}
	
	
	
}

}
