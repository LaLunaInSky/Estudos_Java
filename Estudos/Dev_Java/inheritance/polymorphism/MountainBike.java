package polymorphism;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
        int startCadence,
        int startSpeed,
        int startGear,
        String suspensionType
    ) {
        super(
            startCadence,
            startSpeed,
            startGear
        );

        this.setSuspension(
            suspensionType
        );
    }

    // Sets
    public void setSuspension(
        String suspensionType
    ) {
        this.suspension = suspensionType;
    }

    // Gets
    public String getSuspension() {
        return this.suspension;
    }

    // Other Methods
    public void printDescription() {
        super.printDescription();

        System.out.printf(
            "The MountainBike has a %s suspension.%n",
            this.getSuspension()
        );
    }
}
