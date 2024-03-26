// Main class to create objects
public class Main {
    public static void main(String[] args) {
        // Creating a Vehicle object
        Vehicle v1 = new Vehicle("s100", "petrol", 4, 2023);

        // Testing methods of the Vehicle class
        System.out.println(v1.accelerate());
        System.out.println(v1.getCapacity());
        System.out.println(v1.start());
        System.out.println(v1.stop());

        // Creating a Car object
        Car car = new Car("petrol", "ds120", 2022, 4, 4);

        // Testing methods of the Car class
        System.out.println(car.getModel());
        System.out.println(car.start());

        // Creating a MotorBike object
        MotorBike bike = new MotorBike("petrol", "123", 2021, 2, false, "single");

        // Testing methods of the MotorBike class
        System.out.println(bike.accelerate());
        System.out.println(bike.stop());
    }
}

// Parent class representing a Vehicle
class Vehicle {
    private String model;
    private String fuelType;
    private int capacity;
    private int year;

    // parameterized Constructor for Vehicle class
    public Vehicle(String model, String fuelType, int capacity, int year) {
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.model = model;
        this.year = year;
    }

    // Methods for Vehicle class
    public String start() {
        return "The vehicle is starting";
    }

    public String stop() {
        return "The vehicle is stopped";
    }

    public String accelerate() {
        return "The vehicle is accelerated";
    }

    // Getters and setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getYear() {
        return year;
    }
}

// Subclass representing a Car
class Car extends Vehicle {
    private int numDoors;

    // Constructor for Car class
    public Car(String fuelType, String model, int year, int capacity, int numDoors) {
        super(fuelType, model, year, capacity);
        this.numDoors = numDoors;
    }

    // Overridden methods of Vehicle class
    @Override
    public String start() {
        return "The car is starting";
    }

    @Override
    public String stop() {
        return "The car is stopped";
    }

    @Override
    public String accelerate() {
        return "The car is accelerated";
    }

    // Additional method for Car class
    public String openTrunk() {
        return "The Car Trunk is opemed";
    }
}

// Subclass representing a MotorBike
class MotorBike extends Vehicle {
    private boolean hasRoof;
    private String engineType;

    // Constructor for MotorBike class
    public MotorBike(String fuelType, String model, int year, int capacity, boolean hasRoof, String engineType) {
        super(fuelType, model, year, capacity);
        this.hasRoof = hasRoof;
        this.engineType = engineType;
    }

    // Additional method for MotorBike class
    public void wheelie() {
        System.out.println("Performing a wheelie.");
    }
}
