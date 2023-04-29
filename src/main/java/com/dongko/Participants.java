package com.dongko;

import com.dongko.domain.model.Car;
import com.dongko.service.Movable;

import java.util.Arrays;
import java.util.List;

public class Participants {

    private final List<Car> cars;

    public Participants(String carNames) {
        cars = initCars(carNames);
    }

    private List<Car> initCars(String carNames) {
        StringValidator.validateCarNamesString(carNames);
        return Arrays.stream(carNames.split(",")).map(Car::new).toList();
    }

    public void move(Movable movingStrategy) {
        cars.forEach(car-> car.move(movingStrategy));
    }

    public void printMoveResult() {
        GameView.print("실행 결과");
        cars.forEach(Car::printCurrPosition);
        GameView.printLine();
    }

    public void printSummary() {
        int winnerPosition = cars.stream().mapToInt(Car::getCurrentPosition).max().getAsInt();
        StringBuilder result = new StringBuilder();
        cars.forEach(
            car -> result.append(car.getNameIfWin(winnerPosition))
        );
        GameView.print(result.substring(0, result.length() - 2) + "가 최종 우승했습니다.");
    }
}
