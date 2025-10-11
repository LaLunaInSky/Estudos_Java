package introducing_generics;

public class Util {
    public static <K, V> boolean compare(
        PairClass<K, V> p_01,
        PairClass<K, V> p_02
    ) {
        return p_01.getKey().equals(
            p_02.getKey()
        ) && p_01.getValue().equals(
            p_02.getValue()
        );
    }
}

