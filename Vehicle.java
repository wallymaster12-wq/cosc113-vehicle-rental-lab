public class Vehicle {
    private String brand;
    private int year;
    private int speed;

    String type = "Vehicle";

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Invalid speed! Speed cannot be negative.");
        } else {
            this.speed = speed;
        }
    }

    public void describe() {
        System.out.println("Vehicle: " + brand + " (" + year + ")");
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            speed += amount;
            System.out.println("Speed increased to " + speed);
        } else {
            System.out.println("Acceleration amount must be positive.");
        }
    }
}

class Car extends Vehicle {
    private int doors;

    String type = "Car";

    public Car(String brand, int year, int doors) {
        super(brand, year);
        setDoors(doors);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Doors: " + doors);
    }

    public void showTypes() {
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            System.out.println("Invalid doors! A car must have 2 or 4 doors.");
        }
    }
}

class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int year, int doors, int batteryLevel) {
        super(brand, year, doors);

        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 100;
            System.out.println("Invalid battery level. Set to 100%.");
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Battery level must be between 0 and 100.");
        }
    }


    public void accelerate(int amount) {
        super.accelerate(amount);

        if (amount > 0 && batteryLevel > 0) {
            batteryLevel--;
        }
    }


    public void describe() {
        super.describe();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}