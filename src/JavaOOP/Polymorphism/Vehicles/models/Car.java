package JavaOOP.Polymorphism.Vehicles.models;


import  JavaOOP.Polymorphism.Vehicles.models.base.Vehicle;

public class Car extends Vehicle implements Drivable {

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption, 0.9);
    }
}