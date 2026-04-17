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
}
