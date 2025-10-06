package overriding_and_hiding_methods;

public class Mustang extends Horse implements Mammal {
    public static void main(
        String... args
    ) {
        Mustang myMystang = new Mustang();

        System.out.printf(
            "%n%s%n%n",
            myMystang.indentifyMySelf()
        );
    }
}
