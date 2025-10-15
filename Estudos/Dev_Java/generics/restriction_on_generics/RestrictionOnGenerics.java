package restriction_on_generics;

import java.util.ArrayList;
import java.util.List;

public class RestrictionOnGenerics {

    public static <E> void append(
        List<E> list,
        Class<E> cls
    ) throws Exception {

        E elem = cls.getDeclaredConstructor().newInstance();

        list.add(
            elem
        );
    }
    
    void main() throws Exception {

        Pair<Integer, Character> p = new Pair<>(
            8, 'a'
        );

        List<String> ls = new ArrayList<>();

        this.append(
            ls,
            String.class
        );
    }
}
