package wildcards;

import java.util.List;

public class WildcardError {
    void Foo(
        List<?> i
    ) {
        i.set(
            0,
            i.get(
                0
            )
        );
    }
}
