public interface Car extends ManualTransmission,AutomaticTransmission{

        default void drive (){
            System.out.println("Car is driving");
        };
        default void brake (){
            System.out.println("Car is braking");
        };
        default void turn(String direction){
            System.out.println("Car is turning" + direction);
        }
    }


