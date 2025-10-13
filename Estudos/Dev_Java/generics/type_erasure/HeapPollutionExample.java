package type_erasure;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HeapPollutionExample {

    void main() {

        List<String> stringListA = new ArrayList<>();
    
        List<String> stringListB = new ArrayList<>();

        ArrayBuilder.addToList(
            stringListA, 
            "Seven",
            "Eight",
            "Nine"
        );

        ArrayBuilder.addToList(
            stringListB,
            "Ten",
            "Eleven",
            "Twelve"
        );

        List<List<String>> listOfStringLists = new ArrayList<List<String>>();

        ArrayBuilder.addToList(
            listOfStringLists,
            stringListA,
            stringListB
        );

        ArrayBuilder.faultyMethod(
            Arrays.asList(
                "Hello"
            ),
            Arrays.asList(
                "World!"
            )
        );
    }
}
