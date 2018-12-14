import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RoundTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckWin() {
		Player p1 = new Player("a",1);
		p1.setScore(101);
		Player p2 = new Player("b",2);
		p2.setScore(50);
		Player p[] = new Player[2];
		p[0]=p1;
		p[1]=p2;
		Round r = new Round(p);
		assertEquals("True is returned",true,r.checkWin(p1));
		assertEquals("False is returned",false,r.checkWin(p2));
	}

	

}
