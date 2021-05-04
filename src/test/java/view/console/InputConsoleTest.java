package view.console;

import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputConsoleTest {
	@Test
	void validateNameTest() throws InvalidNameException {
		InputConsole input = new InputConsole();

		assertThat(input.validateName("Lexus")).isTrue();

		InvalidNameException e = assertThrows(InvalidNameException.class, () -> input.validateName("Porche"));
		assertThat(e.getMessage()).isEqualTo("Porche");
	}

	@Test
	void validateNamesTest() throws InvalidNameException {
		InputConsole input = new InputConsole();

		assertThat(input.validateNames("pobi,crong,honux")).isTrue();

		InvalidNameException e = assertThrows(InvalidNameException.class, () -> input.validateNames("kia,hyundai,chevy"));
		assertThat(e.getMessage()).isEqualTo("hyundai");
	}
}
