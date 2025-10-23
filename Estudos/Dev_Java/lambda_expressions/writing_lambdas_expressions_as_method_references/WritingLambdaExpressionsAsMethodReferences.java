package writing_lambdas_expressions_as_method_references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class WritingLambdaExpressionsAsMethodReferences {
    
    void main() {
        // DoubleUnaryOperator sqrt = a -> Math.sqrt(a);

        DoubleUnaryOperator sqrt = Math::sqrt;

        // IntBinaryOperator max = (
        //     a, b
        // ) -> Integer.max(
        //     a, b
        // );

        IntBinaryOperator max = Integer::max;

        // Function<String, Integer> toLength = s -> s.length(); 

        Function<String, Integer> toLength = String::length;

        // BiFunction<String, String, Integer> indexOf = (
        //     setenceInSide01,
        //     wordInSide01
        // ) -> setenceInSide01.indexOf(wordInSide01);
    
        BiFunction<String, String, Integer> indexOf = String::indexOf;

        // Supplier<List<String>> newListOfStrings = () -> new ArrayList<>();

        Supplier<List<String>> newListOfStrings = ArrayList::new;
    }
}