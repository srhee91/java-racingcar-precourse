package model;

import controller.dto.CarNameRequest;

public class RacingcarService {
	private Race race;
	private Cars cars;

	public void startRacing(CarNameRequest carNameRequest) {
		cars = new Cars();
		for (String carName : carNameRequest.getCarNames()) {
			cars.add(new Car(carName, 0));
		}
		race = new Race(cars);
	}

	public Cars move() {
		for (Car car : cars.getCars()) {
			car.moveRandomly();
		}
		return cars;
	}

	public Cars findWinner() {
		return race.findWinner();
	}
}
