//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2024, 4);

        ElectricCar electricCar =
                new ElectricCar("Tesla", 2025, 4, 90);

        System.out.println(" Regular Car ");
        car.describe();
        car.accelerate(30);
        car.showTypes();

        System.out.println("Electric Car ");
        electricCar.describe();
        electricCar.accelerate(20);
        electricCar.describe();
        electricCar.showTypes();

        System.out.println(" Testing Invalid Values ");
        car.setSpeed(-10);
        car.setDoors(3);

        // These direct accesses are not allowed because the fields
        // are private. Access them through public getters and setters.
        // car.brand = "Honda";
        // car.speed = -10;
        // car.doors = 3;

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Doors: " + car.getDoors());
    }
}