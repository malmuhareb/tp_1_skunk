import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_Initialization_of_predictable_die() {
		int[] init_values = new int[] {1,2,3,4,5,6};
		Die die = new Die(init_values);
		
		
		die.roll();
		int value = die.getLastRoll();
		assertEquals("value is not 1", init_values[0], value);
		
		
		
	}

	@Test
	public void test_rolling_of_predictable_die() {
		int[] init_values = new int[] {1,2,3,4,5,6,5,4,3,2,1};
		Die die = new Die(init_values);
		
		
		for (int i = 0; i < init_values.length; i++){
			die.roll();
			int value = die.getLastRoll();
			assertEquals("value is not " + init_values[i], init_values[i], value);
		}
		
		
	}
	
	@Test
	public void test_wrapping_of_predictable_die() {
		int[] init_values = new int[] {1,2,3};
		Die die = new Die(init_values);
		// 4 rolls, should be one
		die.roll();
		die.roll();
		die.roll();
		die.roll();
		
		int value = die.getLastRoll();
		assertEquals("value is not 1", init_values[0], value);
		
		
		
	}

}
