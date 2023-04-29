package com.dongko.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void test() {
        Car dongko = new Car("dngko");
        dongko.move();
    }

}