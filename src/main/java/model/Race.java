package model;

public class Race {
	private Cars cars;

	public Race(Cars cars) {
		this.cars = cars;
	}

	public Cars findWinner() {
		int farthestPosition = findFarthestPosition();

		Cars winners = new Cars();
		for (Car car : cars.getCars()) {
			addIfMatch(winners, car, farthestPosition);
		}
		return winners;
	}

	private void addIfMatch(Cars winners, Car car, int farthestPosition) {
		if (car.getPosition() == farthestPosition) {
			winners.add(car);
		}
	}

	private int findFarthestPosition() {
		int farthest = Integer.MIN_VALUE;
		for (Car car : this.cars.getCars()) {
			farthest = comparePosition(farthest, car.getPosition());
		}
		return farthest;
	}

	private int comparePosition(int position1, int position2) {
		return Math.max(position1, position2);
	}
}
