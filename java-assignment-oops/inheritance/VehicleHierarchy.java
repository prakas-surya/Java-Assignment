package assignment;

abstract class Vehicle {
    String brand;
    int wheels;

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    abstract void displayDetails();

    public void start() {
        System.out.println("Starting the " + brand + " vehicle...");
    }
}

class Car extends Vehicle {
    int seats;
    boolean isAutomatic;

    public Car(String brand, int wheels, int seats, boolean isAutomatic) {
        super(brand, wheels);
        this.seats = seats;
        this.isAutomatic = isAutomatic;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
        System.out.println("Seats: " + seats);
        System.out.println("Automatic: " + (isAutomatic ? "Yes" : "No"));
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    public Bike(String brand, int wheels, boolean hasGear) {
        super(brand, wheels);
        this.hasGear = hasGear;
    }
    
    public void displayDetails() {
        System.out.println("Bike Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}

public class VehicleHierarchy {

	public static void main(String[] args) {
		Vehicle bike = new Bike("Plusar", 2, true);
		Vehicle car = new Car("Volvo", 4, 6, true);
		
		bike.start();
		bike.displayDetails();
		
		System.out.println();
		car.start();
		car.displayDetails();

	}

}
