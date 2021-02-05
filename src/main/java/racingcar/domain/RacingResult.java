package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class RacingResult {

  private static final String ENTER = "\n";
  private static final String LOG_FORM = "%s : %s" + ENTER;
  private static final String DISTANCE_SIGN = "-";
  private static final int DEFAULT_MAX_POSITION = 0;
  private final StringBuilder log = new StringBuilder();
  private final Participants participants;

  public RacingResult(final Participants participants) {
    this.participants = participants;
  }

  public void appendLog() {
    participants.getCars()
        .forEach(car -> log.append(
            String.format(LOG_FORM, car.getName(), convertToDistanceSign(car.getPosition()))
        ));
    log.append(ENTER);
  }

  private String convertToDistanceSign(final int position) {
    StringBuilder sign = new StringBuilder();
    for (int i = 0; i < position; i++) {
      sign.append(DISTANCE_SIGN);
    }
    return sign.toString();
  }

  public String getLog() {
    return log.toString();
  }

  public String getWinner() {
    int maxPosition = participants.getCars().stream()
        .mapToInt(Car::getPosition)
        .max()
        .orElse(DEFAULT_MAX_POSITION);

    List<Car> winners = participants.getCars().stream()
        .filter(car -> car.getPosition() == maxPosition)
        .collect(Collectors.toList());
    return new Winner(winners).getWinnerName();
  }
}
