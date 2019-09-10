package JavaOOP.Polymorphism.Vehicles;
import  JavaOOP.Polymorphism.Vehicles.models.Car;
import  JavaOOP.Polymorphism.Vehicles.models.Truck;
import  JavaOOP.Polymorphism.Vehicles.models.base.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Vehicle car = createVehicle(bufferedReader);
        Vehicle truck = createVehicle(bufferedReader);

        int numberOfCommands = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] lines = bufferedReader.readLine().split("\\s+");
            String command = lines[0];
            String vehicleType = lines[1];
            double value = Double.parseDouble(lines[2]);

            if (command.equals("Drive")) {
                if (vehicleType.equals("Car")) {
                    System.out.println(car.drive(value));
                } else if (vehicleType.equals("Truck")) {
                    System.out.println(truck.drive(value));
                }
            } else if (command.equals("Refuel")) {
                if (vehicleType.equals("Car")) {
                    car.refill(value);
                } else if (vehicleType.equals("Truck")) {
                    truck.refill(value);
                }
            } else {
                break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
    }

    private static Vehicle createVehicle(BufferedReader bufferedReader) throws IOException {
        String[] lines = bufferedReader.readLine().split("\\s+");

        String vehicleType = lines[0];
        double fuelQuantity = Double.parseDouble(lines[1]);
        double fuelConsumption = Double.parseDouble(lines[2]);

        switch (vehicleType) {
            case "Car":
                return new Car(fuelQuantity, fuelConsumption);

            case "Truck":
                return new Truck(fuelQuantity, fuelConsumption);
            default:
                return null;
        }
    }
}