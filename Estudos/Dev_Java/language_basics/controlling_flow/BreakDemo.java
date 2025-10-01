package controlling_flow;

public class BreakDemo {
    public static void main(
        String[] args
    ) {
        int[] arrayOfInts = {
            32, 87, 3, 589,
            12, 1076, 2000,
            8, 622, 127
        };

        int searchFor = 12;

        int count;
        boolean foundIt = false;

        for (
            count = 0;
            count < arrayOfInts.length;
            count++
        ) {
            if (
                arrayOfInts[count] == searchFor
            ) {
                foundIt = true;

                break;
            }
        }

        if (
            foundIt
        ) {
            System.out.println(
                "Found " + searchFor +
                " at index " + count
            );
        } else {
            System.out.println(
                searchFor + " not in the array."
            );
        }
    }
}
