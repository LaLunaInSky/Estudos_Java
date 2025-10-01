package arrays;

public class ArrayCopyOfDemo {
    public static void main(
        String[] args
    ) {
        System.out.println();

        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"
        };

        String[] copyTo = java.util.Arrays.copyOfRange(
            copyFrom, 2, 9
        );

        // for (String coffee: copyFrom) {
        //     System.out.println(
        //         "coffee: " + coffee
        //     );
        // }

        // Or

        java.util.Arrays.stream(
            copyFrom
        ).map(
            coffee -> "coffee" + coffee
        ).forEach(
            System.out::println
        );

        System.out.println();

        // for (String coffee: copyTo) {
        //     System.out.println(
        //         "coffee: " + coffee
        //     );
        // }
        
        // Or

        java.util.Arrays.stream(
            copyTo
        ).map(
            coffee -> "coffee: " + coffee
        ).forEach(
            System.out::println
        );

        System.out.println();

        System.out.println(
            java.util.Arrays.toString(copyTo)
        );

        System.out.println();
    }
}
