package com.dongko.domain.model;

import com.dongko.domain.exception.InvalidCarNameException;


public class CarName {
    private final String name;

    private static final int CAR_NAME_MAX_LENGTH = 5;

    public CarName(String name) {
        if (name == null) {
            throw new InvalidCarNameException(name);
        }

        if (name.isEmpty()) {
            throw new InvalidCarNameException(name);
        }

        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new InvalidCarNameException(name);
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
