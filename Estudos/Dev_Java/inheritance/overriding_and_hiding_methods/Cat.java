package overriding_and_hiding_methods;

public class Cat extends Animal {
    public static void testClassMethod() {
        IO.println(
            "The static method in Cat"
        );
    }

    public void testInstanceMethod() {
        IO.println(
            "The instance method in Cat"
        );
    }

    public static void main(
        String... args
    ) {
        Cat myCat = new Cat();

        Animal myAnimal = myCat;

        Animal.testClassMethod();

        myAnimal.testInstanceMethod();
    }
}
