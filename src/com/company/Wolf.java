package com.company;

public class Wolf implements Runner {
    private static final int WOLF_SPEED = 55;

    public Wolf() {
    }

    @Override
    public String toString() {
        return "Wolf{}";
    }

    @Override
    public int getSpeed() {
        return WOLF_SPEED;
    }
}
