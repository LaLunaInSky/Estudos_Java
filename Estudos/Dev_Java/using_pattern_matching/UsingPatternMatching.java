import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingPatternMatching {
    public void print(
        Object o
    ) {
        if (
            o instanceof String s && !s.isEmpty()
        ) {
            int length = s.length();


            System.out.printf(
                "This is objects is a non-empty string of length %d%n",
                length
            );
        } else {
            IO.println(
                "This object is not a string"
            );
        }

        if (
            !(o instanceof String s)
        ) {
            return;
        }

        System.out.printf(
            "This is a String of length %d%n",
            s.length()
        );
    }

    void main() {
        String sonnet = "From fairest creatures we desire increase,\n" + 
        "That thereby beauty's rose might never die,\n" + 
        "But as the riper should by time decease\n" + 
        "His tender heir might bear his memory:\n" +
        "But thou, contracted to thine own birght eyes,\n" + 
        "Feed'st thy light's flame with self-substantial fuel,\n" +
        "Making a famine where abundance lies,\n" + 
        "Thyself thy foe, to the sweet self too cruel.\n" + 
        "Thou that art now the world's fresh ornament,\n" + 
        "And only herald to the gaudy spring,\n" + 
        "Whiting thine own bud buriest thy content,\n" +
        "And, tender churl, mak'st waste in niggardly.\n" + 
        "Pity the world, or else this glutton be,\n" +
        "To eat the world's due, by the grave and thee.";

        Pattern pattern = Pattern.compile("\\bflame\\b");

        Matcher matcher = pattern.matcher(sonnet);

        while (matcher.find()) {
            String group = matcher.group();

            int start = matcher.start();

            int end = matcher.end();

            IO.println(
                group + " " + start + " " + end
            );
        }
    }
}
