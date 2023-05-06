package com.dongko.domain.model;

import com.dongko.GameView;
import com.dongko.InvalidCarNamesStringException;
import com.dongko.service.Movable;

import java.util.Arrays;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars(String carNames) {
        if (!carNames.contains(",")) {
            throw new InvalidCarNamesStringException();
        }

        if (carNames.startsWith(",")) {
            throw new InvalidCarNamesStringException();
        }

        if (carNames.endsWith(",")) {
            throw new InvalidCarNamesStringException();
        }

        if (carNames.split(",").length < 2) {
            throw new InvalidCarNamesStringException();
        }
        this.cars = Arrays.stream(carNames.split(",")).map(Car::new).toList();
    }

    public void play(Movable movingStrategy) {
        cars.forEach(car-> car.move(movingStrategy));
    }

    public void printCurrPositions() {
        GameView.print("실행 결과");
        cars.forEach(Car::printCurrPosition);
        GameView.printLine();
    }

    public int getWinnerPosition() {
        return cars.stream().mapToInt(Car::getCurrentPosition).max().getAsInt();
    }

    public StringBuilder getWinnerNames(int winnerPosition) {
        StringBuilder result = new StringBuilder();
        cars.forEach(
            car -> result.append(car.getNameIfWin(winnerPosition))
        );
        return result;
    }
}
