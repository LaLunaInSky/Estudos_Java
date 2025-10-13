package wildcards;

import java.util.List;
import java.util.Arrays;

public class Wildcards {
    public static void process(
        List<? extends Number> list
    ) {
        for (
            Number elem : list
        ) {
            IO.println(
                elem
            );
        }
    }

    public static double sumOfList(
        List<? extends Number> list
    ) {
        double  s = 0.0;

        for (
            Number n : list
        ) {
            s += n.doubleValue();
        }

        return s;
    }

    public static void printList(
        List<?> list
    ) {
        for (
            Object elem : list
        ) {
            IO.println(
                elem + " "
            );
        }

        IO.println();
    }

    public static void addNumbers(
        List<? super Integer> list
    ) {
        for (
            int i = 1;
            i <= 10;
            i++
        ) {
            list.add(
                i
            );
        }
    }

    void main() {
        List<Integer> li = Arrays.asList(
            1, 2, 3
        );

        List<Double> ld = Arrays.asList(
            1.2, 2.3, 3.5
        );

        System.out.printf(
            "sum li = %.1f\nsum ld = %.1f\n",
            sumOfList(
                li
            ),
            sumOfList(
                ld
            )
        );

        List<String> ls = Arrays.asList(
            "one", "two", "three"
        );

        printList(
            li
        );

        printList(
            ls
        );
    }
}