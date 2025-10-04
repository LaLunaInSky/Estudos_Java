package autoboxing_and_unboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoboxAndUnbox {
    Character ch = 'a';

    public static void main(
        String... args
    ) {
        List<Integer> ints = new ArrayList<>();

        for (
            int i = 1;
            i < 50;
            i += 2
        ) {
            ints.add(
                i
            );
        }
    }

    public static int sumEven(
        List<Integer> ints
    ) {
        int sum = 0;

        for (
            Integer i: ints
        ) {
            if (
                i % 2 == 0
            ) {
                sum += i;
            }
        }

        return sum;
    }
}