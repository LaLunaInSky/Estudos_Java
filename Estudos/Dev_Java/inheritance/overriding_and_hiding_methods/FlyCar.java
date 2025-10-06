package overriding_and_hiding_methods;

public interface FlyCar {
    default public int startEngine(
        EncryptedKey key
    ) {
        // Implementation
    }
}
