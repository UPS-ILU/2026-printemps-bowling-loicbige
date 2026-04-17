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
	
	private void skipRoll(int times, int nomberRolled) {
		for (int i = 0; i < times; i++) {
			game.roll(nomberRolled);
		}
	}
}
