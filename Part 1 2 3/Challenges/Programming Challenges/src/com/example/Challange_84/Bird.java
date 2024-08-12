package com.example.Challange_84;

public abstract class Bird implements Flyable {
    private final String breed;

    protected Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
