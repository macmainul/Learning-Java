package com.example.Challange_102;

public enum TrafficColor {

    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeMills;

    TrafficColor(int onTimeMills) {
        this.onTimeMills = onTimeMills;
    }

    public int getOnTimeMills() {
        return onTimeMills;
    }
}
