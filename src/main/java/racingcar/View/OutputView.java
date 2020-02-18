package racingcar.View;

import racingcar.Model.Car;

/**
 * 클래스 이름 : OutputView.java
 *
 * @author 작은곰
 * @version 1.0.1
 * <p>
 * 날짜 : 2020.02.16 일요일
 */

public class OutputView {
    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String CAR_NAMES_INPUT_GUIDE_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)";
    private static final String TRIAL_TIME_INPUT_GUIDE_MESSAGE = "시도할 횟수는 몇 회인가요?";

    public static final String DASH = "-";
    public static final String COLON = " : ";

    public static void printInputCarNamesMessage() {
        System.out.println(CAR_NAMES_INPUT_GUIDE_MESSAGE);
    }

    public static void printInputTrialTimeMessage() {
        System.out.println(TRIAL_TIME_INPUT_GUIDE_MESSAGE);
    }

    public static void printExceptionMessage(Exception e) {
        System.out.println(e.getMessage());
    }

    public static void printPositionByDash(Car car) {
        StringBuilder outputValue = new StringBuilder();
        outputValue.append(car.getName()).append(COLON);
        for (int i = 0; i < car.getPosition(); i++) {
            outputValue.append(DASH);
        }
        System.out.println(outputValue);
    }

    public static void printResultMessage() {
        System.out.println(RESULT_MESSAGE);
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void printWinners(String winners) {
        System.out.println(winners.substring(2) + "가 최종 우승했습니다.");
    }
}