package string_builders;

public class StringDemo {
    public static void main(
        String... args
    ) {
        String palindrome = "Dot saw I was Tod";

        // int lenPalindrome = palindrome.length();

        // char[] tempCharArray = new char[
        //     lenPalindrome
        // ];

        // char[] charArray = new char[
        //     lenPalindrome
        // ];

        // for (
        //     int i = 0;
        //     i < lenPalindrome;
        //     i++
        // ) {
        //     tempCharArray[i] = palindrome.charAt(
        //         i
        //     );
        // }

        // for (
        //     int j = 0;
        //     j < lenPalindrome;
        //     j++
        // ) {
        //     charArray[j] = tempCharArray[
        //         lenPalindrome - 1 - j
        //     ];
        // }

        // String reversePalindrome = new String(
        //     charArray
        // );

        // Or

        StringBuilder sB = new StringBuilder(
            palindrome
        );

        String reversePalindrome = sB.reverse().toString();

        System.out.printf(
            "%n%s%n%s%n%n",
            palindrome,
            reversePalindrome
        );
    }
}
