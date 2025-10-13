package wildcards;

import java.util.List;

public class WildcardFixed {
    void Foo(
        List<?> i
    ) {
        fooHelper(
            i
        );
    }

    private <T> void fooHelper(
        List<T> l
    ) {
        l.set(
            0,
            l.get(
                0
            )
        );
    }
}
