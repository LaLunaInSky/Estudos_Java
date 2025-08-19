public class MountainBike extends Bicycle {
    private int seatHeight;

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
    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(
        int newValue
    ) {
        seatHeight = newValue;
    }
}
