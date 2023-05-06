package com.dongko.service;

public class RandomThresholdMovingStrategy implements Movable{

    private static final int THRESHOLD = 4;
    @Override
    public boolean canMove() {
        return ((int) ((Math.random() * 10000) % 10)) + 1 >= THRESHOLD;
    }
}
