package view;

import model.Cars;

public interface Output {
	void notifyGameResultResponse();
	void showRacingProgressResponse(Cars cars);
	void showWinnerResponse(Cars cars);
}
