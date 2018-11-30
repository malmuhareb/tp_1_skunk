import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {
	

	public static void main(String[] args) {
		StdOut.println("Welcome to Skunk Game!");
		StdOut.println("Please Enter the Number of Players: [2 to 8]");
		Game skunk = new Game(StdIn.readInt());
		// to consume the line
		StdIn.readLine();
		
		while (skunk.getNumOfPlayers() == -1) {
			
			StdOut.println("Number of Players is invalid");
			StdOut.println("Please Enter the Number of Players: [2 to 8]");
			skunk = new Game(StdIn.readInt());
			// to consume the line
			StdIn.readLine();
			
		}
		
		

			for (int i = 1; i <= skunk.getNumOfPlayers(); i++){
				StdOut.println("Enter Player Number (" + i + ") Name:");
				//StdIn.readLine();
				skunk.addPlayer(StdIn.readLine(), i - 1);
			}
			
			skunk.startRound();
			
		
		

	}
	

}
