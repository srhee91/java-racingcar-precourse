package controller.dto;

import java.util.List;

public class CarNameRequest {
	private List<String> carNames;

	public CarNameRequest(List<String> carNames) {
		this.carNames = carNames;
	}

	public List<String> getCarNames() {
		return carNames;
	}
}
