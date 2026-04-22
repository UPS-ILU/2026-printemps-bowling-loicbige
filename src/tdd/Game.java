package tdd;

public class Game {
	
	private int[] score;
	private int tour;
	private boolean spare = false;
	private boolean strike = false;

	private static int NB_TOUR_MAX = 20;
	
	public Game() {
		this.score = new int[NB_TOUR_MAX];
		this.tour = 0;
	}

	public void roll(int numberRolled) {
		if (!spare) {
			score[tour] = numberRolled;
		}
		else {
			score[tour-1]+= numberRolled;
			score[tour] = numberRolled;
		}
		if (tour%2 == 1 && score[tour-1]+score[tour] == 10) {
			spare = true;
		}
		this.tour++;
	}
	
	public int score() {
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
	}


