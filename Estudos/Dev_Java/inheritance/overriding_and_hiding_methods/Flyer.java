package overriding_and_hiding_methods;

public interface Flyer {
    default public String indentifyMySelf() {
        return "I am able to fly.";
    }
}
