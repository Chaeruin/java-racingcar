package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.LinkedList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.utils.InputParser;

public class CarService {
    public List<Car> getRacingCars(String input) {
        List<String> name = InputParser.nameParser(input);
        List<Car> cars = new LinkedList<>();
        for (String n: name) {
            cars.add(new Car(n));
        }
        return cars;
    }

    public boolean isForward() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }

    public void goForward(Car car) {
        if (isForward()) {
            car.setForwardNumber(car.getForwardNumber() + 1);
        }
    }

    public void goCarsForward(List<Car> cars) {
        for (Car car: cars) {
            goForward(car);
        }
    }

    public List<Car> getWinner(List<Car> cars) {
        List<Car> winner = new LinkedList<>();
        int max = -1;
        for (Car car: cars) {
            max = Math.max(max, car.getForwardNumber());
        }
        for (Car car: cars) {
            if (car.getForwardNumber() == max) {
                winner.add(car);
            }
        }
        return winner;
    }
}
