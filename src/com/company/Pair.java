package com.company;

import java.util.Objects;

public class Pair {
    private int key;
    private int value;

    @Override
    public String toString() {
        return "{"+key+"," + value + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return key == pair.key && value == pair.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
