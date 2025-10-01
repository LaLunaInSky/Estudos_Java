package strings;

public class ReverseString {
    private String phrase;
    private String reversePhrase;

    public ReverseString(
        String phrase
    ) {
        this.phrase = phrase;
    
        this.reversePhrase = ReversePalindrome();
    }

    private String ReversePalindrome() {
        int lenPalindrome = this.phrase.length();

        char[] tempCharArray = new char[lenPalindrome];
        char[] charArray = new char[lenPalindrome];

        // for (
        //     int i = 0;
        //     i < lenPalindrome;
        //     i++
        // ) {
        //     tempCharArray[i] = this.phrase.charAt(i);
        // }
        
        // Or

        this.phrase.getChars(
            0, 
            lenPalindrome,
            tempCharArray, 
            0
        );

        for (
            int j = 0;
            j < lenPalindrome;
            j++
        ) {
            charArray[j] = tempCharArray [
                lenPalindrome - 1 - j
            ];
        }

        String reversePalindrome = new String(
            charArray
        );

        return reversePalindrome;
    }

    public String getPhrase() {
        return this.phrase;
    }

    public String getReversePhrase() {
        return this.reversePhrase;
    }
}
