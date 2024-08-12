package com.example.Challange_97;

public enum Day {
    SATURDAY(false),
    SUNDAY(true),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THRUSDAY(true),
    FRIDAY(false);

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "Weekday" : "Weekend";
    }
}
