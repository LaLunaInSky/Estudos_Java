package wildcards;

import java.util.List;
import java.util.ArrayList;

public class EvenNumber extends NaturalNumber {

    public EvenNumber(
        int i
    ) {
        super(
            i
        );
    }

    void main() {
        List<EvenNumber> le = new ArrayList<>();

        List<? extends NaturalNumber> ln = le;

        ln.add(
            new NaturalNumber(
                35
            );
        );
    }
}
