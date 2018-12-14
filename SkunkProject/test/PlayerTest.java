import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testPlayerInit() {
		Player p = new Player("a",1);
		assertEquals("Player a should be returned","a",p.getName());
		assertEquals("Player 1 should be returned",1,p.getpID());
	}

}
