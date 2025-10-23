package using_lamdas_expressions_in_your_application;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class UsingLamdasExpressionsInYourApplication {
    void main() {
        Supplier<String> supplier = () -> "Hello Duke!";

        IO.println(
            supplier
        );

        //
        Random random = new Random(314L);

        IntSupplier newRandow = () -> random.nextInt(10);

        for (
            int index = 0;
            index < 5;
            index++
        ) {
            int nextRandom = newRandow.getAsInt();

            IO.println(
                "next random = " + nextRandom
            );
        }
    }
}
