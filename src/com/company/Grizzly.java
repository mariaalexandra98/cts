package com.company;

public class Grizzly extends Bear {
    private static final int GRIZZLY_SPEED = 65;

    public Grizzly() {
    }

    @Override
    public int getSpeed() {
        return GRIZZLY_SPEED;
    }

    @Override
    public String toString() {
        return "Grizzly{}";
    }
}
