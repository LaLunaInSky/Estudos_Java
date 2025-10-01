public class CharDemo {
    public static void main(
        String... args
    ) {
        char ch = 'a';

        char uniChar = '\u03A9';

        char[] charArray = {
            'a', 'b', 'c', 'd', 'e'
        };

        IO.println(
            "\nch = " + ch +
            "\nuniChar = " + uniChar
        );

        IO.print(
            "charArray = "
        );

        for (
            char letra : charArray
        ) {
            IO.print(
                letra + " "
            );
        }

        IO.println(
            "\n"
        );
    }
}