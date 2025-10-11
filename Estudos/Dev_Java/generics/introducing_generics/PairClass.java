package introducing_generics;

public class PairClass<K, V> {
    private K key  ;
    private V value;

    public PairClass(
        K key,
        V value
    ) {
        this.key = key;
        this.value = value;
    }

    public void setKey(
        K key
    ) {
        this.key = key;
    }

    public void setValue(
        V value
    ) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    void main() {
        PairClass<Integer, String> p_01 = new PairClass<>(
            1,
            "apple"
        );

        PairClass<Integer, String> p_02 = new PairClass<>(
            2,
            "pear"
        );

        boolean same = Util.<Integer, String>compare(
            p_01,
            p_02
        );
    }
}