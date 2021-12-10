public interface Sedan extends Car{
        String carType = "Sedan";

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

