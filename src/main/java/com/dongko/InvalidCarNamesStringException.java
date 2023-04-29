package com.dongko;

public class InvalidCarNamesStringException extends RuntimeException {
    public InvalidCarNamesStringException() {
        super("올바른 자동차 이름들을 입력하시오.");
    }
}
