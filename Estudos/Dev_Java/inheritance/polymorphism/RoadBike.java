package polymorphism;

public class RoadBike extends Bicycle {
    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(
        int startCadence,
        int startSpeed,
        int startGear,
        int newTireWidth
    ) {
        super(
            startCadence,
            startSpeed,
            startGear
        );

        this.setTireWidth(
            newTireWidth
        );
    }

    // Sets
    public void setTireWidth(
        int newTireWidth
    ) {
        this.tireWidth = newTireWidth;
    }

    // Gets
    public int getTireWidth() {
        return this.tireWidth;
    }

    // Others Methods
    public void printDescription() {
        super.printDescription();

        System.out.printf(
            "The RoadBike has %d MM tires.%n",
            this.getTireWidth()
        );
    }
}