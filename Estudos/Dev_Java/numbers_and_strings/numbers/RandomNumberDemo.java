package numbers;
public class RandomNumberDemo {
    public static void main(
        String... args
    ) {
        int numberRandom = (int)(Math.random() * 10);

        IO.println(
            "\nnumberRandom is : " + numberRandom + "\n"
        );
    }
}
