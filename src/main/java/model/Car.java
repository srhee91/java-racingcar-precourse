package model;

import java.util.Random;

public class Car {
	private static Random random = new Random();

	private int position;

	public int getPosition() {
		return position;
	}

	public void move() {
		position++;
	}

	public void moveRandomly() {
		int value = random.nextInt(10);
		if (value >= 4) {
			move();
		}
	}
}
