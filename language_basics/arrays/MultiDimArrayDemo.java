public class MultiDimArrayDemo {
    static void displayBidimensionalArray(
        String[][] strings
    ) {
        System.out.println();

        for (
            int arrayIndex = 0;
            arrayIndex < strings.length;
            arrayIndex++
        ) {
            for (
                int index = 0;
                index < strings[arrayIndex].length;
                index++
            ) {
                System.out.println(
                    strings[arrayIndex][index] + " "
                );
            }
        }


        System.out.println();
    }

    public static void main(
        String[] args
    ) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

        // Mr. Smith
        System.out.println(
            names[0][0] + names[1][0]
        );

        // Ms. Jones
        System.out.println(
            names[0][2] + names[1][1]
        );

        System.out.println(names.length);

        String[][] strings = {
            {"one"},
            {"Maria", "Jennifer", "Patricia"},
            {"James", "Michael"},
            {"Washington", "London", "Paris", "Berlin", "Tokyo"}
        };

        displayBidimensionalArray(strings);
    }
}