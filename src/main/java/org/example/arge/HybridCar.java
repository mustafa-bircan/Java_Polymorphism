package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private double batterySize;
    private int cylinders;


    public HybridCar(String name, String description, double avgKmPerLitre,double batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid car engine is starting with battery size " + batterySize + " and " + cylinders + " cylinders.");
    }
}
