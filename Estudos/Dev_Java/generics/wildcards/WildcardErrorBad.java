package wildcards;

import java.util.List;
import java.util.Arrays;

public class WildcardErrorBad {
    void swapFirst(
        List<? extends Number> l_01,
        List<? extends Number> l_02
    ) {
        Number temp = l_01.get(
            0
        );

        l_01.set(
            0,
            l_02.get(
                0
            )
        );

        l_02.set(
            0,
            temp
        );
    }

    void main() {
        List<Integer> li = Arrays.asList(
            1, 2, 3
        );

        List<Double> ld = Arrays.asList(
            10.10, 20.20, 30.30
        );

        swapFirst(
            li, ld
        );
    }
}
