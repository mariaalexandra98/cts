package com.company;

public class PolarBear extends Bear {
    private static final int POLAR_BEAR_SPEED = 90;

    public PolarBear() {
    }

    @Override
    public int getSpeed() {
        return POLAR_BEAR_SPEED;
    }

    @Override
    public String toString() {
        return "PolarBear{}";
    }
}
