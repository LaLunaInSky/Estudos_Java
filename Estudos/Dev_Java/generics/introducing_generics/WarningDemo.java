package introducing_generics;

public class WarningDemo {
    void main() {
        Box<Integer> bi;

        bi = createBox();
    }

    static Box createBox() {
        return new Box();
    }
}