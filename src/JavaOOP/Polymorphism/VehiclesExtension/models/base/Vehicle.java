package JavaOOP.Polymorphism.VehiclesExtension.models.base;

import  JavaOOP.Polymorphism.VehiclesExtension.models.Drivable;



import java.text.DecimalFormat;

public abstract class Vehicle implements Drivable {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;
    private double AC_FUEL_CONSUMPTION_INCREASE_VALUE;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity, double AC_FUEL_CONSUMPTION_INCREASE_VALUE) {
        this.setTankCapacity(tankCapacity);
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.AC_FUEL_CONSUMPTION_INCREASE_VALUE = AC_FUEL_CONSUMPTION_INCREASE_VALUE;
    }


    @Override
    public String drive(double distance) {
        double totalFuelConsumption = this.getFuelConsumption() + AC_FUEL_CONSUMPTION_INCREASE_VALUE;

        if (totalFuelConsumption * distance > this.getFuelQuantity()) {
            return this.getClass().getSimpleName() + " needs refueling";
        }

        this.setFuelQuantity(this.getFuelQuantity() - totalFuelConsumption * distance);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
    }

    @Override
    public void refill(double liters) {
        if(liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.setFuelQuantity(this.getFuelQuantity() + liters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.getFuelQuantity());
    }


    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) throws IllegalArgumentException{
        if(fuelQuantity > this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    protected void setAC_FUEL_CONSUMPTION_INCREASE_VALUE(double value){
        this.AC_FUEL_CONSUMPTION_INCREASE_VALUE = value;
    }
}