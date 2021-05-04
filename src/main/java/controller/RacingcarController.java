package controller;

import controller.dto.CarNameRequest;
import controller.dto.NumTrialRequest;
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
	}

	public static RacingcarController of(Input input, Output output) {
		return new RacingcarController(input, output);
	}

	public void run() throws InvalidNameException {
		CarNameRequest carNameRequest = input.getCarNameRequest();
		NumTrialRequest numTrialRequest = input.getNumTrialRequest();


	}
}
