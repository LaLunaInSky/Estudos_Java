package polymorphism;

public class Subclass extends Superclass {
    public void printMethod() {
        super.printMethod();

        IO.println(
            "Printed in Subclass.\n"
        );
    }

    public static void main(
        String... args
    ) {
        Subclass subClass = new Subclass();
        
        subClass.printMethod();
    }
}
