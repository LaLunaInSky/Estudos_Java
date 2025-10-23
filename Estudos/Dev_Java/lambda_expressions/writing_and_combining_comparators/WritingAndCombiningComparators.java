package writing_and_combining_comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class WritingAndCombiningComparators {

    void main() {
        // Comparator<Integer> comparator = (
        //     i1, i2
        // ) -> Integer.compare(
        //     i1, i2
        // );
    
        // or
        
        Comparator<Integer> comparator01 = Integer::compare;


        //
        // Comparator<String> comparator02 = (
        //     s1, s2
        // ) -> Integer.compare(
        //     s1.length(), s2.length()
        // );
    
        // or

        // Function<String, Integer> toLength = String::length;

        // Comparator<String> comparator02 = (
        //     s1, s2
        // ) -> Integer.compare(
        //     toLength.apply(s1),
        //     toLength.apply(s2)
        // );

        // or

        Comparator<String> comparator02 = Comparator.comparing(String::length);


        //
        Comparator<String> byLengthThenAlphabetically = Comparator.comparing(
            String::length
        ).thenComparing(
            Comparator.naturalOrder()
        );

        List<String> strings = Arrays.asList(
            "one", "two", "three", "four", "five"
        );

        strings.sort(byLengthThenAlphabetically);

        IO.println(
            strings
        );


        //
        // Comparator<Integer> comparator03 = (
        //     i1, i2
        // ) -> {
        //     if (
        //         i1 == null && i2 != null
        //     ) {
        //         return 1;
        //     } else if (
        //         i1 != null && i2 == null
        //     ) {
        //         return -1;
        //     } else {
        //         return Integer.compare(
        //             i1, i2
        //         );
        //     }
        // };

        // or

        Comparator<Integer> naturalOrder = Comparator.naturalOrder();

        Comparator<Integer> naturalOrderNullsLast = Comparator.nullsLast(
            naturalOrder()
        );
    }
}