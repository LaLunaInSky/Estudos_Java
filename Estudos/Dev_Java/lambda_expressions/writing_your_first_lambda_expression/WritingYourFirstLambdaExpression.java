package writing_your_first_lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class WritingYourFirstLambdaExpression {
    List<String> retainStringsOfLength3(
        List<String> strings
    ) {
        Predicate<String> predicate = s -> s.length() == 3;

        List<String> stringsOfLength3 = new ArrayList<>();

        for (
            String s : strings
        ) {
            if (
                predicate.test(s)
            ) {
                stringsOfLength3.add(s);
            }
        }

        return stringsOfLength3;
    }

    List<String> filterWords(
        List<String> words,
        Predicate<String> predicate
    ) {
        List<String> result = new ArrayList<>();

        for (
            String word : words
        ) {
            if (
                predicate.test(word)
            ) {
                result.add(word);
            }
        }

        return result;
    }

    void processWords(
        List<String> words,
        Consumer<String> processor
    ) {
        for (
            String word : words
        ) {
            processor.accept(word);
        }
    }

    List<Integer> filterNumbers(
        List<Integer> numbers,
        Predicate<Integer> predicate
    ) {
        List<Integer> result = new ArrayList<>();

        for (
            Integer number : numbers
        ) {
            if (
                predicate.test(number)
            ) {
                result.add(number);
            }
        }

        return result;
    }

    void main() {
        Predicate<String> predicate = s -> s.length() == 3;

        List<String> words = new ArrayList<>();

        words.add("test");
        words.add("tes");
        words.add("cat");
        words.add("dog");
        words.add("elephant");

        IO.println(
            "\n=== Predicate Examples ==="
        );

        for (
            String word : words
        ) {
            System.out.printf(
                "\'%s\' has 3 chars: %b%n",
                word,
                predicate.test(word)
            );
        }

        Consumer<String> printer = s -> System.out.printf(
            "Message: %s%n", 
            s
        );

        IO.println("\n=== Consumer Examples ===");
        printer.accept("Hello Lambda!");
        printer.accept("This is fun!");

        Supplier<String> greeting = () -> "Welcome to Java!";

        System.out.printf(
            "\n=== Supplier Examples ===\n%s%n%s%n",
            greeting.get(),
            greeting.get()
        );

        Function<String, Integer> getLength = s -> s.length();

        IO.println(
            "\n=== Function Examples ==="
        );

        for (
            String word : words
        ) {
            System.out.printf(
                "Length of \'%s\': %d%n",
                word,
                getLength.apply(word)
            );
        }

        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.printf(
            "\n=== Your Turn ===\nIs 4 even? %b\nIs 7 even? %b%n",
            isEven.test(4),
            isEven.test(7)
        );

        Runnable runnable = () -> IO.println(
            "\nI am running"
        );

        runnable.run();

        // 
        List<String> words_02 = Arrays.asList(
            "cat", "dog", "elephant", "ant", "bee", "butterfly"
            );
            
        IO.println(
            "\nOriginal words: " + words_02
        );
                
        // Filter words with exactly 3 characters 
        List<String> threeCharWords = filterWords(
            words_02,
            s -> s.length() == 3
        );

        IO.println(
            "Words with 3 chars: " + threeCharWords
        );

        // Filter words starting with 'b'
        List<String> wordsStartingWithB = filterWords(
            words_02, 
            s -> s.startsWith(
                "b"
            )
        );

        IO.println(
            "\nWords starting with \'b\': " + wordsStartingWithB
        );

        // Print all words in uppercase
        IO.println(
            "\n=== Processing each word ==="
        );

        processWords(
            words_02,
            s -> IO.println(
                s.toUpperCase()
            )
        );

        // Create some numbers and test them
        List<Integer> numbers = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        List<Integer> evenNumbers = filterNumbers(
            numbers,
            n -> n % 2 == 0
        );

        IO.println(
            "\nEven numbers: " + evenNumbers
        );

        // Try your own predicates!
        List<Integer> bigNumbers = filterNumbers(
            numbers,
            n -> n > 5
        );
        
        IO.println(
            "\nNumbers > 5: " + bigNumbers
        );
    }
}
