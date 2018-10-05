
public class Die
{
	private int lastRoll;
	private boolean isPredictable = false;
	private int[] rolls; 
	private int index_of_next_roll = 0;

	public Die()
	{
		this.roll();
	}
	
	public Die(int[] predictable_roll )
	{
		isPredictable = true;
		rolls = predictable_roll;
	}

	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}

	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		if (isPredictable){
			this.lastRoll = rolls[index_of_next_roll];
			index_of_next_roll++;
			if (index_of_next_roll >= rolls.length){
				index_of_next_roll = 0;
			}
			
		}
		else{
			this.lastRoll = (int) (Math.random() * 6 + 1);
			
		}
		
	}
	
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}

}
