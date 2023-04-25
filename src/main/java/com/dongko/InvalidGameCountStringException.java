package com.dongko;

public class InvalidGameCountStringException extends RacingCarException{
    public InvalidGameCountStringException() {
        super("올바른 시도 횟수를 입력하시오.");
    }
}
