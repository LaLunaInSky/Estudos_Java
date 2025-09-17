public class ContinueWithLabelDemo {
    public static void main(
        String[] args
    ) {
        String searchMe = "Look for a substring in me";
        
        String substring = "sub";

        boolean foundIt = false;

        int max = searchMe.length() - substring.length();

    test:
        for (
            int count = 0;
            count <= max;
            count++
        ) {
            int n = substring.length();
            
            int j = count;
            
            int k = 0;

            while (
                n-- != 0
            ) {
                if (
                    searchMe.charAt(j++) != substring.charAt(k++) 
                ) {
                    continue test;
                }
            }

            foundIt = true;
                break test;
        }

        System.out.println(
            foundIt ? "Found it" : "Didn't find it"
        );
    }
}
