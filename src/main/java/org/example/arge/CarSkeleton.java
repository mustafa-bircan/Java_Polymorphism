package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println(name + " is starting the engine");
    }

    public void drive() {
        System.out.println(name + " is driving");
        runEngine();
    }

    protected void runEngine() {
        System.out.println(name + " is running the engine");
    }
}
