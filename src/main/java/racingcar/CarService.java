package racingcar;

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
}
