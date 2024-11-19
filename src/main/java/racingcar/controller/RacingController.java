package racingcar.controller;

import java.util.List;
import racingcar.service.CarService;
import racingcar.domain.Car;
import racingcar.utils.InputParser;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private final CarService carService;

    public RacingController(InputView inputView, OutputView outputView, CarService carService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.carService = carService;
    }
    public void run() {
        List<Car> racingCars = carService.getRacingCars(inputView.getCarNames());
        int number = InputParser.numberParser(inputView.getNumber());

        for (int i = 0; i < number; i++) {
            carService.goCarsForward(racingCars);
            outputView.printRacingResult(racingCars);
        }
        outputView.printWinner(carService.getWinner(racingCars));
    }

}
