package bicycles;

public class BicycleDemo {
    public static void main(
        String... args
    ) {
        Bicycle bicycle_1 = new Bicycle(
            0, 0, 0
        );

        Bicycle bicycle_2 = new Bicycle(
            0, 0, 0
        );

        IO.println(
            "Bicycle_1 is id: " + bicycle_1.getID() + 
            "\nBicycle_2 is id: " + bicycle_2.getID() + 
            "\nBicycle class have " + Bicycle.getNumberOfBicyles() + 
            " bicycles."
        );
    }
}
