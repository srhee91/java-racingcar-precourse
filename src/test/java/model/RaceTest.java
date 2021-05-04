package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {
	@Test
	void findWinnerTest() {
		Car kia = new Car("Kia", 0);
		Car benz = new Car("Benz", 2);
		Car horse = new Car("Horse", 1);

		Cars cars = new Cars();
		cars.add(kia);
		cars.add(benz);
		cars.add(horse);
		
		Race race = new Race(cars);
		
		Cars expected = new Cars();
		expected.add(benz);
		
		Cars result = race.findWinner();
		assertThat(result.getCars()).isEqualTo(expected.getCars());
	}
}
