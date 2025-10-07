package interfaces;

public interface GroupedInterface extends Interface1, Interface2, Interface3 {
    double E = 2.718282;

    void doSometthing(
        int i,
        double x
    );

    int doSomethingElse(
            String s
    );
}