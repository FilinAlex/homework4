public interface Offroad extends Car {
    String carType = "Offroad";

    @Override
    default void drive() {
        Car.super.drive();
    }

    @Override
    default void brake() {
        Car.super.brake();
    }

    @Override
    default void turn(String direction) {
        Car.super.turn(direction);
    }
}
