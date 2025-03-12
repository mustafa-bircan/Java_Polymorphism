package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + ": The car's engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + ": The car is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + ": The car is breaking";
    }

    public String toString() {
        return name;
    }
}
