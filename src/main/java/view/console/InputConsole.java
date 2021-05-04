package view.console;

import controller.dto.CarNameRequest;
import controller.dto.NumTrialRequest;
import view.Input;

import javax.naming.InvalidNameException;
import java.util.Arrays;
import java.util.Scanner;

public class InputConsole implements Input {

	private final Scanner scanner = new Scanner(System.in);

	private final String CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n";
	private final String NUM_TRIAL_MESSAGE = "시도할 회수는 몇회인가요?\n";

	@Override
	public CarNameRequest getCarNameRequest() throws InvalidNameException {
		System.out.print(CAR_NAME_MESSAGE);
		String rawInput = scanner.nextLine();
		validateNames(rawInput);
		return new CarNameRequest(Arrays.asList(rawInput.split(",")));
	}

	@Override
	public NumTrialRequest getNumTrialRequest() {
		System.out.print(NUM_TRIAL_MESSAGE);
		int numTrial = scanner.nextInt();
		return new NumTrialRequest(numTrial);
	}

	public boolean validateName(String name) throws InvalidNameException {
		if (name.length() > 5) {
			throw new InvalidNameException(name);
		}
		return true;
	}

	public boolean validateNames(String names) throws InvalidNameException {
		String[] nameArray = names.split(",");
		for (String name : nameArray) {
			validateName(name);
		}
		return true;
	}
}
