package racingcar.domain;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private final String name;
    private int forwardNumber;

    public Car(String name) {
        this.name = name;
        this.forwardNumber = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getForwardNumber() {
        return this.forwardNumber;
    }

    public void setForwardNumber(int number) {
        this.forwardNumber = number;
    }
}
