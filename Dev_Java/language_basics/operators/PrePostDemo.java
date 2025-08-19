public class PrePostDemo {
    public static void main(
        String[] args
    ) {
        int numberIncrement = 3;

        numberIncrement++;
        
        // prints 4
        System.out.println(
            numberIncrement
        );

        ++numberIncrement;

        // prints 5
        System.out.println(
            numberIncrement
        );

        // prints 6
        System.out.println(
            ++numberIncrement
        );

        // prints 6
        System.out.println(
            numberIncrement++
        );

        // prints 7
        System.out.println(
            numberIncrement
        );
    }
}
