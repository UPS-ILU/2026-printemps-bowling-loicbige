package tdd;

public class Game {
	
	private int[] score;
	private int tour;
	private static int NB_TOUR_MAX = 21;
	
	public Game() {
		this.score = new int[NB_TOUR_MAX];
		this.tour = 0;
	}

	public void roll(int numberRolled) {
		score[tour] = numberRolled;
		 
		if (isSrike(tour)) {
			this.tour++;
		}
		this.tour++;
	}

	private boolean isSpare(int i) {
		return i%2 == 1 && score[i-1]+score[i] == 10;
	}
	
	private boolean isSrike(int i) {
		return i%2==0 && score[i] == 10;
	}
	
	
	public int score() {
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			if(isSrike(i)) {
				sum += score[i]+score[i+2]+score[i+3];
				i++;
			}
			else if (isSpare(i)) {
				sum += score[i] + score[i+1];
			}
			else {
				sum += score[i];
			}
		}
		return sum;
	}
	}


