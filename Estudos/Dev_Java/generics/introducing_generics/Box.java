package introducing_generics;

public class Box<T> {
    private T t;

    public void set(
        T t
    ) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(
        U u
    ) {
        IO.println(
            "\nT: " + t.getClass().getName() +
            "\nU: " + u.getClass().getName() +
            "\n"
        );
    }

    void main() {
        Box<Integer> integerBox = new Box<Integer>();

        integerBox.set(
            new Integer(
                10
            )
        );

        // Error
//        integerBox.inspect(
//            "some text"
//        );

        integerBox.inspect(
            8
        );
    }
}