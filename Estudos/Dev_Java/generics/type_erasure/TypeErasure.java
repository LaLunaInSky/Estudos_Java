package type_erasure;

public class TypeErasure {

    public static<T> int count(
        T[] anArray,
        T   elem
    ) {
        int cnt = 0;

        for (
            T e : anArray
        ) {
            if (
                e.equals(
                    elem
                )
            ) {
                ++cnt;
            }
        }
        
        return cnt;
    }

    // public static <T extends Shape> void draw(
    //     T shape
    // ) {
    //     /* ... */
    // }

    void main() {
        
        MyNode mn = new MyNode(
            5
        );

        NodeTwo n = (MyNode)mn;

        n.setData(
            "Hello"
        );

        Integer x = mn.getData();
    }
}
