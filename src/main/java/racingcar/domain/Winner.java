package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Winner {

  private static final String WINNER_NAME_DELIMITER = ", ";
  private final List<Car> cars;

  public Winner(final List<Car> cars) {
    this.cars = cars;
  }

  public String getWinnerName() {
    return cars.stream()
        .map(Car::getName)
        .collect(Collectors.joining(WINNER_NAME_DELIMITER));
  }
}
