package overriding_and_hiding_methods;

public class Animal {
    public static void testClassMethod() {
        IO.println(
            "The static method in Animal"
        );
    }

    public void testInstanceMethod() {
        IO.println(
            "The instance method in Animal"
        );
    }
}
