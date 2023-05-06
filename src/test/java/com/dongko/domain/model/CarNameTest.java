package com.dongko.domain.model;

import com.dongko.domain.exception.InvalidCarNameException;
import com.dongko.domain.exception.RacingCarDomainException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;


class CarNameTest {

    @ParameterizedTest
    @ValueSource(strings = {"dongko", "", "null"})
    @DisplayName("자동차 이름은 공백 이거나 5글자 이상은 사용 불가")
    void test(String carName) {
        if (carName.equals("null")) {
            assertThrows(InvalidCarNameException.class, () -> new CarName(null));
        } else {
            assertThrows(InvalidCarNameException.class, () -> new CarName(carName));
        }
    }
}