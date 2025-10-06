package overriding_and_hiding_methods;

public interface Mythical {
    default public String indentifyMySelf() {
        return "I am a mythical creature.";
    }
}
