import introducing_generics.OrderedPair;

import java.util.List;
import java.util.ArrayList;


void main() {
//    List list = new ArrayList();
//
//    list.add("hello");
//
//    String s = (String) list.get(0);

    // Or generic

    List<String> list = new ArrayList<String>();

    list.add("hello");

    String s = list.get(0);

    //

//    Pair<String, Integer> p_01 = new OrderedPair<String, Integer>(
//        "Even",
//        8
//    );
//
//    Pair<String, String> p_02 = new OrderedPair<String, String>(
//        "hello",
//        "world"
//    );

    // Or
    OrderedPair<String, Integer> p_01 = new OrderedPair<>(
        "Even",
        8
    );

    OrderedPair<String, String> p_02 = new OrderedPair<>(
        "hello",
        "world"
    );
}
