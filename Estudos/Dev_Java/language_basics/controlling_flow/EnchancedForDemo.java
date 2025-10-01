package controlling_flow;

public class EnchancedForDemo {
    public static void main(
        String[] args
    ) {
        int[] numbers;
        numbers = new int[10];

        for (
            int count = 1;
            count < 11;
            count++
        ) {
            numbers[count - 1] = count;
        }

        for (
            int number: numbers
        ) {
            System.out.println(
                "Number is: " + number
            );
        }
    }
}
