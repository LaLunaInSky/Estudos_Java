package polymorphism;

public class Subclass extends Superclass {
    public void printMethod() {
        super.printMethod();

        IO.println(
            "Printed in Subclass.\n"
        );
    }

    void main() {
        Subclass subClass = new Subclass();
        
        subClass.printMethod();
    }
}
