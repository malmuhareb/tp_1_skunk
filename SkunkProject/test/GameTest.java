import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_init_and_checkNumOfPlayers() {
		Game g = new Game(2);
		assertEquals("Number of Players is 2",2,g.getNumOfPlayers());
		g = new Game(1);
		assertEquals("Number of Players is -1",-1,g.getNumOfPlayers());
		g = new Game(9);
		assertEquals("Number of Players is -1",-1,g.getNumOfPlayers());
	}
	
	@Test
	public void testGetKitty() {
		Game g = new Game(2);
		g.setKitty(100);
		assertEquals("Kitty should have 100",100,g.getKitty());
	}

	

	

	@Test
	public void testHighScore() {
		Game g = new Game(2);
		Player[] p = new Player[2];
		Player p1 = new Player("a",1);
		Player p2 = new Player("b",2);
		p1.setScore(50);
		p2.setScore(10);
		p[0] = p1;
		p[1] = p2;
		assertEquals("Player a should be returned","a",g.highScore(p).getName());
	}

}
