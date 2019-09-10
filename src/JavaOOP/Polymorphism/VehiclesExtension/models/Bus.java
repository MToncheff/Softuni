package JavaOOP.Polymorphism.VehiclesExtension.models;

import  JavaOOP.Polymorphism.VehiclesExtension.models.base.Vehicle;


public class Bus extends Vehicle implements Drivable {

    private boolean isEmpty = false;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, 1.4);
    }

    @Override
    public String drive(double distance) {
        if(this.isEmpty){
            super.setAC_FUEL_CONSUMPTION_INCREASE_VALUE(0);
            this.isEmpty = false;
        }

        String result = super.drive(distance);

        super.setAC_FUEL_CONSUMPTION_INCREASE_VALUE(1.4);

        return result;
    }


    public void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }
}