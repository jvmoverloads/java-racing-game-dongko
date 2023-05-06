package com.dongko;

import com.dongko.domain.exception.RacingCarDomainException;

public class InvalidGameCountStringException extends RacingCarDomainException {
    public InvalidGameCountStringException() {
        super("올바른 시도 횟수를 입력하시오.");
    }
}
