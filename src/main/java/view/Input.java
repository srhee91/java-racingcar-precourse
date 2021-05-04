package view;

import controller.dto.CarNameRequest;
import controller.dto.NumTrialRequest;

import javax.naming.InvalidNameException;

public interface Input {
	CarNameRequest getCarNameRequest() throws InvalidNameException;
	NumTrialRequest getNumTrialRequest();
}
