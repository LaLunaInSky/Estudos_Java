package strings;

public class ToStringDemo {
    public static void main(
        String... args
    ) {
        double d = 858.48;

        String s = Double.toString(
            d
        );

        int dot = s.indexOf(
            '.'
        );

        System.out.printf(
            "\n%d digits before decimal point.\n" +
            "%d digits after decimal point.\n\n",
            dot,
            (s.length() - dot - 1)
        );
    }
}
