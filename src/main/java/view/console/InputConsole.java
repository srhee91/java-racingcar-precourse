package view.console;

import javax.naming.InvalidNameException;

public class InputConsole {
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
