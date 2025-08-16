public class ContinueDemo {
    public static void main(
        String[] args
    ) {
        String searchMe = "peter piper pecked a " + "peck of pickled peppers";

        int max = searchMe.length();

        int numPs = 0;

        for (
            int count = 0;
            count < max;
            count++
        ) {
            if (
                searchMe.charAt(count) != 'p'
            ) {
                continue;
            }

            numPs++;
        }

        System.out.println(
            "Found " + numPs + " p's in the string."
        );
    }
}
