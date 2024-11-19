package racingcar;

import racingcar.controller.RacingController;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CarService carService = new CarService();

        RacingController racingController = new RacingController(inputView, outputView, carService);

        racingController.run();
    }
}
