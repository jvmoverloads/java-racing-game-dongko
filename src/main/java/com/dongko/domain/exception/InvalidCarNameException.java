package com.dongko.domain.exception;

public class InvalidCarNameException extends RacingCarDomainException {

    public InvalidCarNameException(String carName) {
        super(carName + "은 잘못된 이름입니다.");
    }
}
