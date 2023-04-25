package com.dongko;

public class StringValidator {

    public static void validateCarNamesString(String carNames) {
        canSplitByComma(carNames);
        isNotStartsWithComma(carNames);
        isNotEndsWithComma(carNames);
        canSplitMoreThenTwoCars(carNames);
    }

    private static void canSplitMoreThenTwoCars(String carNames) {
        if(carNames.split(",").length < 2) {
            throw new InvalidCarNamesStringException();
        }
    }

    private static void isNotEndsWithComma(String carNames) {
        if (carNames.endsWith(",")) {
            throw new InvalidCarNamesStringException();
        }
    }

    private static void isNotStartsWithComma(String carNames) {
        if (carNames.startsWith(",")) {
            throw new InvalidCarNamesStringException();
        }
    }

    private static void canSplitByComma(String carNames) {
        if (!carNames.contains(",")) {
            throw new InvalidCarNamesStringException();
        }
    }

    public static int getValidGameCountOrThrow(String gameCountString) {
        try {
            return Integer.parseInt(gameCountString);
        } catch(Exception e) {
            throw new InvalidGameCountStringException();
        }
    }
}
