package using_lambdas_expressions_in_your_application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class UsingLambdasExpressionsInYourApplication {
    void main() {
        Supplier<String> supplier = () -> "Hello Duke!";

        IO.println(
            supplier
        );

        //
        Random random = new Random(314L);

        Consumer<String> printer =s -> IO.println(s);

        IntSupplier newRandow = () -> random.nextInt(10);

        for (
            int index = 0;
            index < 5;
            index++
        ) {
            int nextRandom = newRandow.getAsInt();

            printer.accept(
                "next random = " + nextRandom
            );
        }

        //
        BiConsumer<Random, Integer> randomNumberPrinter = (
            randomInSide, number
        ) -> {
            for (
                int i = 0;
                i < number;
                i++
            ) {
                IO.println(
                    "next random = " + randomInSide.nextInt()
                );
            }
        };

        randomNumberPrinter.accept(
            new Random(314L),
            5
        );

        //
        BiPredicate<String, Integer> isOfLength = (
            wordInSide, lenghtInSide
        ) -> wordInSide.length() == lenghtInSide;

        String wordTest01 = "teste 01";

        int lengthTest01 = 4;

        boolean isWordOfLength4 = isOfLength.test(
            wordTest01, lengthTest01
        );

        System.out.printf(
            "The phrase \'%s\' has %d chars? %b%n",
            wordTest01, lengthTest01,
            isWordOfLength4
        );
    
        //
        List<String> immutableStrings = List.of(
            "one", "two", "three", "four", "five"
        );

        List<String> stringsTest01 = new ArrayList<>(immutableStrings);

        Predicate<String> isEvenLength = s -> s.length() % 2 == 0;

        stringsTest01.removeIf(isEvenLength);

        IO.println(
            "immutableStrings = " + immutableStrings +
            "\nstring = " + stringsTest01
        );

        //
        Function<String, Integer> toLength = s -> s.length();

        String wordTest02 = "Test string";

        int lengthTest02 = toLength.apply(wordTest02);

        System.out.printf(
            "The phrase \'%s\' has %d chars.%n",
            wordTest02, lengthTest02
        );

        //
        List<String> stringsTest02 = Arrays.asList(
            "one", "two", "three"
        );

        UnaryOperator<String> toUpperCase = wordInSide02 -> wordInSide02.toUpperCase();
        
        stringsTest02.replaceAll(toUpperCase);

        IO.println(
            "strings to upper case = " + stringsTest02
        );
        

        //
        BiFunction<String, String, Integer> findWordInSetence = (
            wordInSide03, setenceInSide
        ) -> setenceInSide.indexOf(wordInSide03);

        
    }
}
