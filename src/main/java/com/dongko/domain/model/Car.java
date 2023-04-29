package com.dongko.domain.model;

import com.dongko.GameView;
import com.dongko.MoveDecider;

public class Car {
    private final CarName name;
    private Position position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
    }

    public void move() {
        boolean canMove = MoveDecider.canMove();
        if (canMove) {
            System.out.println("canMove : " + canMove);
            this.position.increase();
        }
    }

    public void printCurrPosition() {
        GameView.print(this.name + " : " + this.position.getCurrentPosition());
    }

    public int getCurrentPosition() {
        return this.position.getCurrentPosition().length();
    }

    public String getNameIfWin(int winnerPosition) {
        if (this.position.getCurrentPosition().length() == winnerPosition) {
            return this.name + ", ";
        }
        return "";
    }
}
