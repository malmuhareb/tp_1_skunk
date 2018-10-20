import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {
	

	public static void main(String[] args) {
		StdOut.print("Welcome to Skunk Game!");
		StdOut.print("Please Enter the Number of Players: [2 to 8]");
		Game skunk = new Game(StdIn.readInt());
		if (skunk.getNumOfPlayers() == -1){
			StdOut.print("Number of Players is invalid");
			StdOut.print("Please Enter the Number of Players: [2 to 8]");
			skunk = new Game(StdIn.readInt());
		}
		else {
			for (int i = 0; i < skunk.getNumOfPlayers(); i++){
				StdOut.print("Enter Player Number (" + i + ") Name:");
				skunk.addPlayer(StdIn.readLine(), i);
				
			}
			skunk.startRound();
			
		}
		

	}
	

}
