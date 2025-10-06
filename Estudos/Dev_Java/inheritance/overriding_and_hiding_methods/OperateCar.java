package overriding_and_hiding_methods;

public interface OperateCar {
    default public int startEngine(
        EncryptedKey key
    ) {
        // Implementation
    }
}
