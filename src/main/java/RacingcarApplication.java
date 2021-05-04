import controller.RacingcarController;
import view.console.InputConsole;
import view.console.OutputConsole;

import javax.naming.InvalidNameException;

public class RacingcarApplication {
	public static void main(String[] args) throws InvalidNameException {
		RacingcarController racingcarController = RacingcarController.of(
				new InputConsole(),
				new OutputConsole()
		);
		racingcarController.run();
	}
}
