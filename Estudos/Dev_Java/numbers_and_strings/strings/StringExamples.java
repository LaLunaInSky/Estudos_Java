package strings;

public class StringExamples {
    public static void main(
        String... args
    ) {
        char[] helloArray = {
            'h', 'e', 'l', 'l', 'o', '.'
        };

        String helloString = new String(
            helloArray
        );

        IO.println(
           "\n" + helloString
        );

        String palindrome = "Dot saw I was Tod";

        int lenPalindrome = palindrome.length();

        IO.println(
            "\nThe phrase \"" + palindrome + 
            "\", it has " + lenPalindrome +
            " letters.\n"
        );

        ReverseString reverseString = new ReverseString(
            palindrome
        );

        IO.println(
            "The phrase \"" + reverseString.getPhrase() + 
            "\" reverse is \"" + reverseString.getReversePhrase() + 
            "\".\n"
        );

        String stringConcat = "My name is ".concat(
            "Rumplestiltskin"
        );

        IO.println(
            stringConcat + "\n"
        );

        String string_1 = "saw I was";

        IO.println(
            "Dot " + string_1 + 
            " Tod.\n"
        );
    }
}
