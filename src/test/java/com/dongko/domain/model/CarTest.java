package com.dongko.domain.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("movingStrategy의 canMove가 true면 움직인다")
    void test() {
        var car = new Car("dong");
        car.move(() -> true);

        assertEquals(1, car.getCurrentPosition());
    }

    @Test
    @DisplayName("movingStrategy의 canMove가 false면 움직이지 않는다")
    void test2() {
        var car = new Car("dong");
        car.move(() -> false);

        assertEquals(new Car("asd").getCurrentPosition(), car.getCurrentPosition());
    }
}