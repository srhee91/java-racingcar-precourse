package controller;

import controller.dto.CarNameRequest;
import controller.dto.NumTrialRequest;
import model.Cars;
import model.RacingcarService;
import view.Input;
import view.Output;

import javax.naming.InvalidNameException;

public class RacingcarController {
	private Input input;
	private Output output;
	private RacingcarService racingcarService;

	private RacingcarController(Input input, Output output) {
		this.input = input;
		this.output = output;
		racingcarService = new RacingcarService();
	}

	public static RacingcarController of(Input input, Output output) {
		return new RacingcarController(input, output);
	}

	public void run() throws InvalidNameException {
		CarNameRequest carNameRequest = input.getCarNameRequest();
		NumTrialRequest numTrialRequest = input.getNumTrialRequest();

		racingcarService.startRacing(carNameRequest);
		output.notifyGameResultResponse();
		for (int i = 0; i < numTrialRequest.getNumTrial(); i++) {
			Cars cars = racingcarService.move();
			output.showRacingProgressResponse(cars);
		}
		output.showWinnerResponse(racingcarService.findWinner());
	}
}
