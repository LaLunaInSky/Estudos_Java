package overriding_and_hiding_methods;

public interface AnimalInterface {
    default public String indentifyMySelf() {
        return "I am an animal.";
    }
}
