package overriding_and_hiding_methods;

public class Pegasus extends Horse implements Flyer, Mythical {
    public static void main(
        String... args
    ) {
        Pegasus myPegasus = new Pegasus();
        
        System.out.printf(
            "%n%s%n%n",
            myPegasus.indentifyMySelf()
        );
    }
}
