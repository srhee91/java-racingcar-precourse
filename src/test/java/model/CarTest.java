package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
	@Test
	void moveTest() {
		Car car = new Car("Porch", 0);

		int position = car.getPosition();
		car.move();

		assertThat(car.getPosition()).isEqualTo(position + 1);
	}
}
