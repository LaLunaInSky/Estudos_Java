public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;

    public Bicycle(
        int startCadence,
        int startGear,
        int startSpeed
    ) {
        this.cadence = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;
        this.id = ++numberOfBicycles;
    }

    // methods
    public static int getNumberOfBicyles() {
        return Bicycle.numberOfBicycles;
    }

    public int getID() {
        return this.id;
    }

    public int getCadence() {
        return this.cadence;
    }

    public int getGear() {
        return this.gear;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setCadence(
        int newValue
    ) {
        this.cadence = newValue;
    }

    public void setGear(
        int newValue
    ) {
        this.gear = newValue;
    }

    public void applyBrake(
        int decrement
    ) {
        this.speed -= decrement;
    }

    public void speedUp(
        int increment
    ) {
        this.speed += increment;
    }
}
