package arrays;

public class ArrayCopyDemo {
    public static void main(
        String[] args
    ) {
        System.out.println();

        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"
        };

        String[] copyTo = new String[7];

        System.arraycopy(
            copyFrom, 2,
            copyTo, 0, 7
        );

        for (String coffee: copyFrom) {
            System.out.println(
                "coffee: " + coffee
            );
        }

        System.out.println();

        for (String coffee: copyTo) {
            System.out.println(
                "coffee: " + coffee
            );
        }

        System.out.println();
    }
}
