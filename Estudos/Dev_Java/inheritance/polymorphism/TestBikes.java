package polymorphism;

public class TestBikes {
    public static void main(
        String... args
    ) {
        Bicycle bike_01, bike_02, bike_03;

        bike_01 = new Bicycle(
            20,
            10,
            1
        );

        bike_02 = new MountainBike(
            20,
            10,
            5,
            "Dual"
        );

        bike_03 = new RoadBike(
            40,
            20,
            8,
            23
        );

        bike_01.printDescription();
        bike_02.printDescription();
        bike_03.printDescription();

        IO.println();
    }
}
