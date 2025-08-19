public class BicycleDemo {
    public static void main(
        String[] args
    ) {
        Bicycle bike_1 = new Bicycle();
        Bicycle bike_2 = new Bicycle();

        bike_1.changedCadence(50);
        bike_1.speedUp(10);
        bike_1.changedGear(2);
        bike_1.printStates();

        bike_2.changedCadence(50);
        bike_2.speedUp(10);
        bike_2.changedGear(2);
        bike_2.printStates();
        bike_2.changedCadence(40);
        bike_2.speedUp(10);
        bike_2.changedGear(3);
        bike_2.printStates();
    }
}