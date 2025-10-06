package overriding_and_hiding_methods;

public class Dragon implements EggLayer, FireBreather {
    public static void main(
        String... args
    ) {
        Dragon myDragon = new Dragon();

        System.out.printf(
            "%n%s%n%n",
            myDragon.indentifyMySelf()
        );
    }
}
