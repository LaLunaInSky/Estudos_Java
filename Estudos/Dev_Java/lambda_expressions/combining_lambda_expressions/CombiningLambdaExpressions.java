package combining_lambda_expressions;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class CombiningLambdaExpressions {

    void main() {
        // Predicate<String> p = s -> (
        //     s != null
        // ) && !s.isEmpty() && s.length() < 5;

        // or

        // Predicate<String> nonNull = s -> s != null;
        // Predicate<String> nonEmpty = s -> !s.isEmpty();
        // Predicate<String> shorterThan5 = s -> s.length() < 5;

        // Predicate<String> p = nonNull.and(nonEmpty).and(shorterThan5);
    
        // or

        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
        Predicate<String> isNotNullNorEmpty = isNullOrEmpty.negate();
        Predicate<String> shorterThan5 = s -> s.length() < 5;

        Predicate<String> p = isNotNullNorEmpty.and(shorterThan5);

        //
        Predicate<String> isEqualToDuke = Predicate.isEqual(
            "Duke"
        );

        Predicate<Collection<String>> isEmpty02 = Collection::isEmpty;
        Predicate<Collection<String>> isNotEmpty = Predicate.not(isEmpty02);

        //
        Logger logger = Logger.getLogger(
            "MyApllicationLogger"
        );

        Consumer<String> log = message -> logger.info(message);

        Consumer<String> print = message -> IO.println(
            message
        );

        Consumer<String> longAndPrint = log.andThen(print);

        //
        Function<String, String> id = Function.identity();
    }
}