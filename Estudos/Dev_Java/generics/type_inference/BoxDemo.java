package type_inference;

import java.util.List;
import java.util.ArrayList;
import introducing_generics.Box;

public class BoxDemo {
    public static <U> void addBox(
        U u,
        List<Box<U>> boxes
    ) {
        Box<U> box = new Box<>();

        box.set(
            u
        );

        boxes.add(
            box
        );
    }

    public static <U> void outputBoxes(
        List<Box<U>> boxes
    ) {
        int counter = 0;

        for (
            Box<U> box: boxes
        ) {
            U boxContents = box.get();

            System.out.printf(
                "Box #%d contains [%s]%n",
                counter,
                boxContents.toString()
            );

            counter++;
        }
    }

    void main() {
        ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();

        BoxDemo.<Integer>addBox(
            Integer.valueOf(
                10
            ), listOfIntegerBoxes
        );

        BoxDemo.addBox(
            Integer.valueOf(
                20
            ), listOfIntegerBoxes
        );

        BoxDemo.addBox(
            Integer.valueOf(
                30
            ), listOfIntegerBoxes
        );

        BoxDemo.outputBoxes(
            listOfIntegerBoxes
        );
    }
}