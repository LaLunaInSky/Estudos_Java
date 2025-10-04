package autoboxing_and_unboxing;

import java.util.List;
import java.util.ArrayList;

public class Unboxing {
    public static void main(
        String... args
    ) {
        Integer i = Integer.valueOf(
            -8
        );

        int absVal = absoluteValue(
            i
        );

        System.out.printf(
            "%nabsolute value of %d = %d%n",
            i, absVal
        );

        List<Double> doubles = new ArrayList<>();

        doubles.add(
            3.1416
        );

        double pi = doubles.get(
            0
        );

        System.out.printf(
            "pi = %f%n%n",
            pi
        );
    }

    public static int absoluteValue(
        int i
    ) {
        return (
            i < 0
        ) ? -i : i;
    }
}
