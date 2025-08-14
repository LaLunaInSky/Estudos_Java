public class ArithmeticDemo {
    public static void main(
        String[] args
    ) {
        int result = 1;
        int originalResult = result;

        // Example Additive
        result = result + 2;
        // result is now 3

        System.out.println(
            originalResult + " + 2 = " + result
        );
        
        originalResult = result;

        // Example Subtration
        result = result - 1;
        // result is now 2

        System.out.println(
            originalResult + " - 1 = " + result
        );

        originalResult = result;

        // Example Multiplication
        result = result * 2;
        // result is now 4

        System.out.println(
            originalResult + " * 2 = " + result
        );

        originalResult = result;

        // Example Division
        result = result / 2;
        // result is now 2

        System.out.println(
            originalResult + " / 2 = " + result
        );

        originalResult = result;

        // Example Remainder
        result = result % 2;
        // result is now 0

        System.out.println(
            originalResult + " % 2 = " + result
        );
    }
}
