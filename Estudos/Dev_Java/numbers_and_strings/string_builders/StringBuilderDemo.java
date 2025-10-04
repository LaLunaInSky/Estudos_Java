package string_builders;

public class StringBuilderDemo {
    public static void main(
        String... args
    ) {
        StringBuilder sB = new StringBuilder();

        sB.append(
            "Greetings"
        );

        System.out.printf(
            "%n%s%n%n",
            sB
        );
    }
}
