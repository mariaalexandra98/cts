package com.company;

public class Human implements Runner {
    private int age;

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{}";
    }

    @Override
    public int getSpeed() {
        return age < 50 ? 10 : 7;
    }
}
