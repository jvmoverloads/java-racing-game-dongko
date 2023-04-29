package com.dongko.domain.model;

import com.dongko.InvalidCarNamesStringException;
import com.dongko.service.Movable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @ParameterizedTest
    @ValueSource(strings = {"ko", ",ko, ho", "ko, ho, seung,"})
    @DisplayName("잘못된 자동차 이름들 인풋 테스트")
    void test(String carNames) {
        assertThrows(InvalidCarNamesStringException.class, () -> new Cars(carNames));
    }

    @Test
    @DisplayName("getWinnerPosition 가장 멀리간 자동차의 position은 winnerPosition이다")
    void test2() {
        Cars cars = new Cars("ko,ho,seung");
        cars.play(() -> true);
        assertEquals(cars.getWinnerPosition(), 1);
    }

    @Test
    @DisplayName("getWinnerNames 우승자의 position으로 우승자들의 이름을 가져온다.")
    void test3() {
        Movable movable = () -> true;
        var ko = new Car("ko");
        ko.move(movable);

        var ho = new Car("ho");
        ho.move(movable);
        ho.move(movable);

        var seung = new Car("seung");
        seung.move(movable);
        seung.move(movable);

        var cars = new Cars(List.of(ko, ho, seung));
        assertTrue(cars.getWinnerNames(2).toString().contains("ho, seung"));
    }
}
