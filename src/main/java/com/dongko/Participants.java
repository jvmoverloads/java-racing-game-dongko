package com.dongko;

import com.dongko.domain.model.Cars;
import com.dongko.service.Movable;


public class Participants {

    private final Cars cars;

    public Participants(String carNames) {
        this.cars = new Cars(carNames);
    }

    public void move(Movable movingStrategy) {
        cars.play(movingStrategy);
    }

    public void printMoveResult() {
        cars.printCurrPositions();
    }

    public void printSummary() {
        int winnerPosition = cars.getWinnerPosition();
        StringBuilder result = new StringBuilder();
        result.append(cars.getWinnerNames(winnerPosition));
        GameView.print(result.substring(0, result.length() - 2) + "가 최종 우승했습니다.");
    }
}
