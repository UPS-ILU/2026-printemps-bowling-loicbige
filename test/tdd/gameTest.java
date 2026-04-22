package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class gameTest {

	Game game;
	
	@BeforeEach
	void init() throws Exception{
		game = new Game();
	}

	
	@Test
	void scoreWithoutRollTest() {
		assertEquals(0, game.score());
	}
	
	@Test
	void roll20times0Test() {
		skipRoll(20, 0);
		assertEquals(0, game.score());
	}
	
	
	@Test
	void roll20Times1Test() {
		skipRoll(20, 1);
		assertEquals(20, game.score());
	}
	
	@Test
	void roll10Times1n10Times2Test() {
		skipRoll(10, 1);
		skipRoll(10, 2);
		assertEquals(30, game.score());
	}
	
	@Test
	void spareTest() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		skipRoll(17, 0);
		assertEquals(18, game.score());
	}
	
	@Test
	void Striketest() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		skipRoll(16, 0);
		assertEquals(24, game.score());
	}
	
	@Test 
	void casualGame() {
		game.roll(1);
		game.roll(2);
		game.roll(10);
		game.roll(0);
		game.roll(10);
		game.roll(4);
		game.roll(2);
		game.roll(0);
		game.roll(10);
		game.roll(6);
		game.roll(2);
		game.roll(0);
		game.roll(10);
		game.roll(6);
		game.roll(4);
		game.roll(8);
		game.roll(2);
		game.roll(2);
		game.roll(7);
		assertEquals(122, game.score());
	}
	
	
	@Test
	void anotherCasualGame() {
		game.roll(1);
		game.roll(2);
		
		game.roll(10);
		
		game.roll(0);
		game.roll(10);
		
		game.roll(4);
		game.roll(2);
		
		game.roll(0);
		game.roll(10);
		
		game.roll(6);
		game.roll(2);
		
		game.roll(0);
		game.roll(10);
		
		game.roll(6);
		game.roll(4);
		
		game.roll(8);
		game.roll(2);
		
		game.roll(2);
		game.roll(8);
		
		game.roll(8);
		assertEquals(131, game.score());
	}
	
	
	
	private void skipRoll(int times, int nomberRolled) {
		for (int i = 0; i < times; i++) {
			game.roll(nomberRolled);
		}
	}
}
