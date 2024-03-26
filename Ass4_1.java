import java.util.Scanner;

class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency(double distance, double fuelConsumed) {
        return distance / fuelConsumed;
    }

    public double calculateDistance(double time, double speed) {
        return time * speed;
    }

    public double calculateMaxSpeed() {
// Implementation varies for different types of vehicles
        return 0.0;
    }
}

class Truck extends Vehicle {
    private double maxLoadCapacity;

    public Truck(String make, String model, int year, String fuelType, double maxLoadCapacity) {
        super(make, model, year, fuelType);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public double calculateMaxSpeed() {
// Example implementation for calculating max speed of a truck
        return 65.0; // miles per hour
    }
}

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String make, String model, int year, String fuelType, int numberOfSeats) {
        super(make, model, year, fuelType);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateMaxSpeed() {
// Example implementation for calculating max speed of a car
        return 120.0; // miles per hour
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateMaxSpeed() {
// Example implementation for calculating max speed of a motorcycle
        return 150.0; // miles per hour
    }
}

public class Ass4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Example usage
        Car myCar = new Car("BMW", "M5 Compitition", 2020, "Gasoline", 5);
        System.out.println("My car's max speed is: " + myCar.calculateMaxSpeed() + " mph");
    }
}
