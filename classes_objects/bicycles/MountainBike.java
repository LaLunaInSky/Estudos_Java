public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(
        int startHeight,
        int startCadence,
        int startGear,
        int startSpeed
    ) {
        super(
            startCadence,
            startGear,
            startSpeed
        );

        seatHeight = startHeight;
    }

    // method
    public void setHeight(
        int newValue
    ) {
        seatHeight = newValue;
    }
}
