package Estudos.Dev_Java.classes_objects.nested_classes;

public class TopLevelClass {
    void accessMembers(
        OuterClass outer
    ) {
        IO.println(
            outer.outerField
        );

        IO.println(
            OuterClass.staticOuterField
        );
    }
}
