package com.dongko.domain.model;

import com.dongko.GameView;
import com.dongko.MoveDecider;

public class Car {
    private final CarName name;
    private String positionIndicator = "";

    public Car(String name) {
        this.name = new CarName(name);
    }

    public void move() {
        boolean canMove = MoveDecider.canMove();
        if (canMove) {
            System.out.println("canMove : " + canMove);
            this.positionIndicator += "-";
        }
    }

    public void printCurrPosition() {
        GameView.print(this.name + " : " + positionIndicator);
    }

    public int getCurrentPosition() {
        return this.positionIndicator.length();
    }

    public String getNameIfWin(int winnerPosition) {
        if (this.positionIndicator.length() == winnerPosition) {
            return this.name + ", ";
        }
        return "";
    }
}