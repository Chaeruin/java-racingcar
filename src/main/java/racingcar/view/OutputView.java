package racingcar.view;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import racingcar.domain.Car;

public class OutputView {

    public void printRace(Car car) {
        System.out.print(car.getName() + " : ");
        System.out.print("-".repeat(car.getForwardNumber()) + "\n");
    }

    public void printRacingResult(List<Car> racing) {
        for (Car car: racing) {
            printRace(car);
        }
        System.out.println();
    }

    public void printWinner(List<Car> winner) {
        System.out.print("최종 우승자 : ");
        for (Car cw : winner) {
            System.out.print(cw.getName());
            if (winner.indexOf(cw) != winner.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
