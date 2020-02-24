package com.company;

public class Bear implements Runner {
    public Bear() {

    }

    @Override
    public String toString() {
        return "Bear{}";
    }

    @Override
    public int getSpeed() {
        return 45;
    }
}
