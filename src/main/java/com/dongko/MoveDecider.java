package com.dongko;


public class MoveDecider {
    public static boolean canMove() {
        return ((int) ((Math.random() * 10000) % 10)) + 1 >= 4;
    }
}
