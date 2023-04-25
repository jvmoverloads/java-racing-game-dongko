package com.dongko;

public class Car {
    private final String name;
    private String positionIndicator = "";

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        boolean canMove = MoveDecider.canMove();
        if (canMove) {
            this.positionIndicator += "-";
        }
        System.out.println("새롭게 작업한 내용");
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