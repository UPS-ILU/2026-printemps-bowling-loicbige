package tdd;

public class Game {
	private int score = 0;
	

	public void roll(int numberRolled) {
		score+=numberRolled;
	}
	
	public int score() {
		return score;
	}
}
