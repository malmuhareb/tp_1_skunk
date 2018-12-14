import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RollTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsDoubleSkunk() {
		int[] init_values = new int[] {1,2,3,4,5,6};
		int[] init_values2 = new int[] {1,2,3,4,5,6};
		Die die = new Die(init_values);
		Die die2 = new Die(init_values2);
		Dice dice = new Dice(die,die2);
		Roll r = new Roll(dice);
		r.setIndivisualDies();
		assertEquals("true should be returned",true,r.isDoubleSkunk());
	}

	@Test
	public void testIsSkunk() {
		int[] init_values3 = new int[] {1,2,3,4,5,6};
		int[] init_values4 = new int[] {6,2,3,4,5,6};
		Die die = new Die(init_values3);
		Die die2 = new Die(init_values4);
		Dice dice = new Dice(die,die2);
		Roll r = new Roll(dice);
		r.setIndivisualDies();
		assertEquals("true should be returned",true,r.isSkunk());
	}

	@Test
	public void testIsSkunkDuce() {
		int[] init_values5 = new int[] {2,2,3,4,5,6};
		int[] init_values6 = new int[] {1,2,3,4,5,6};
		Die die = new Die(init_values5);
		Die die2 = new Die(init_values6);
		Dice dice = new Dice(die,die2);
		Roll r = new Roll(dice);
		r.setIndivisualDies();
		assertEquals("true should be returned",true,r.isSkunkDuce());
	}

}
