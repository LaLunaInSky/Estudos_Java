package polymorphism;

public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;

    public Bicycle(
        int startCadence,
        int startSpeed,
        int startGear
    ) {
        this.cadence = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;
        this.id = ++numberOfBicycles;
    }

    // Sets    
    public void setGear(
        int newValue
    ) {
        this.gear = newValue;
    }
        
    public void setCadence(
        int newValue
    ) {
        this.cadence = newValue;
    }

    // Gets
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

    // Other Methods
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

    public void printDescription() {
        System.out.printf(
            "%nDescription Bicyle object with id %d:%n" + 
            "Bike is in gear %d with a cadence of %d and travelling at a speed of %d.%n",
            this.id,
            this.gear,
            this.cadence,
            this.speed
        );
    }
}
            