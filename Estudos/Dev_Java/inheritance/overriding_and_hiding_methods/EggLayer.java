package overriding_and_hiding_methods;

public interface EggLayer extends AnimalInterface {
    default public String indentifyMySelf() {
        return "I am able to lay eggs.";
    }
}
