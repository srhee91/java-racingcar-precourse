package view.console;

import model.Car;
import model.Cars;
import view.Output;

public class OutputConsole implements Output {
	private final String NOTIFY_GAME_RESULT_MESSAGE = "\n실행 결과\n";
	private final String SHOW_WINNER_MESSAGE = "가 최종 우승했습니다.\n";

	@Override
	public void notifyGameResultResponse() {
		System.out.print(NOTIFY_GAME_RESULT_MESSAGE);
	}

	@Override
	public void showRacingProgressResponse(Cars cars) {
		for (Car car : cars.getCars()) {
			System.out.print(car.getName() + " : ");
			printPosition(car);
			System.out.println();
		}
		System.out.println();
	}

	private void printPosition(Car car) {
		for (int i = 0; i < car.getPosition(); i++) {
			System.out.print("-");
		}
	}

	@Override
	public void showWinnerResponse(Cars cars) {
		String carNames = "";
		for (Car car : cars.getCars()) {
			carNames += car.getName() + ",";
		}
		carNames = carNames.substring(0, carNames.length() - 1);
		System.out.print(carNames + SHOW_WINNER_MESSAGE);
	}
}
