public class Bicycle {
    private int cadence;
    private int speed;
    private int gear;

    public Bicycle() {
        this.cadence = 0;
        this.speed = 0;
        this.gear = 0;
    }

    public void changedCadence(
        int newValue
    ) {
        cadence = newValue;
    }

    public void changedGear(
        int newValue
    ) {
        gear = newValue;
    }

    public void speedUp(
        int increment
    ) {
        speed += increment;
    }

    public void applyBreak(
        int decrement
    ) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println(
            "\ncadence.: " + cadence + 
            "\nspeed...: " + speed + 
            "\ngear....: " + gear +
            "\n"
        );
    }
}