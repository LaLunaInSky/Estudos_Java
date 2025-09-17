public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(
        int startCadence,
        int startGear,
        int startSpeed
    ) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }

    // methods
    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCadence(
        int newValue
    ) {
        cadence = newValue;
    }

    public void setGear(
        int newValue
    ) {
        gear = newValue;
    }

    public void applyBrake(
        int decrement
    ) {
        speed -= decrement;
    }

    public void speedUp(
        int increment
    ) {
        speed += increment;
    }
}
