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

        float floatVar = (float) 10.0;

        int intVar = 54;

        String stringVar = "Hello";

        String fs;

        // System.out.printf(
        //     "The value of the float variable is %f, while the value of the integer variable is %d, and the string is \"%s\".\n",
        //     floatVar, intVar, stringVar
        // );

        // Or

        fs = String.format(
            "The value of the float variable is %f, while the value of the integer variable is %d, and the string is \"%s\".\n",
            floatVar, intVar, stringVar
        );

        IO.println(
            fs
        );

        int i = 5;
        double d = 5.5;
        
        String s_1 = "" + i;

        // Or

        String s_2 = String.valueOf(
            i
        );

        // Or

        String s_3 = Integer.toString(
            i
        );

        String s_4 = Double.toString(
            d
        );

        System.out.printf(
            "%s\n%s\n%s\n%s\n\n",
            s_1,
            s_2,
            s_3,
            s_4
        );

        String anotherPalindrome = "Niagara. O roar again!";

        char aChar = anotherPalindrome.charAt(
            9
        );

        String roar = anotherPalindrome.substring(
            11, 
            15
        );

        System.out.printf(
            "The palindome \"%s\"\n" + 
            "Char in index 9 = %s\n" + 
            "Substring in index 11 at 15 = %s\n\n",
            anotherPalindrome,
            aChar,
            roar
        );
    }
}
