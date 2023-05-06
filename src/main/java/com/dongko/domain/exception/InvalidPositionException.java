package com.dongko.domain.exception;

public class InvalidPositionException extends RacingCarDomainException{
    public InvalidPositionException() {
        super("Position 값은 음수일 수 없습니다.");
    }
}
