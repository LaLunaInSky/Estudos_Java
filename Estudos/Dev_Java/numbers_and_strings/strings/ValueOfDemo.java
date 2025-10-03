package strings;

public class ValueOfDemo {
    public static void main(
        String... args
    ) {
        if (
            args.length == 2
        ) {
            // float argA = (
            //     Float.valueOf(
            //         args[0]
            //     )
            // ).floatValue();

            // float argB = (
            //     Float.valueOf(
            //         args[1]
            //     )
            // ).floatValue();

            // Or

            float argA = Float.parseFloat(
                args[0]
            );

            float argB = Float.parseFloat(
                args[1]
            );
            
            System.out.printf(
                "argA (%.1f) + argB (%.1f) = %.1f%n" +
                "argA (%.1f) - argB (%.1f) = %.1f%n" +
                "argA (%.1f) * argB (%.1f) = %.1f%n" +
                "argA (%.1f) / argB (%.1f) = %.1f%n",
                argA, argB, (argA + argB),
                argA, argB, (argA - argB),
                argA, argB, (argA * argB),
                argA, argB, (argA / argB)
            );

            IO.print(
                "argA (" + argA + 
                ") % argB (" + argB + 
                ") = " + (argA % argB) + "\n\n"
            );
        }
    }
}
