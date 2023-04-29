package com.dongko.domain.model;

import java.util.Objects;

public class Position {
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        this.position = position;
    }

    public void increase() {
        this.position++;
    }

    public String getCurrentPosition() {
        StringBuilder result = new StringBuilder();
        result.append("-".repeat(Math.max(0, position)));
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "Position{" +
            "position=" + position +
            '}';
    }
}
