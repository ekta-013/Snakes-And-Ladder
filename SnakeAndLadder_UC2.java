package snakesAndLadder;

import java.util.Random;

public class SnakeAndLadder_UC2 {
	static void rollTheDice() {
        Random random = new Random();
        int rollTheDice = random.nextInt(6)+1;
        System.out.println("After rolling the dice : "+rollTheDice);
	 }
	public static void main(String[] args) {
	        rollTheDice();

	}
}
