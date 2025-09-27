public class TopLevelClass {

    void accessMembers(OuterClass outer) {
        IO.println(outer.outerField);

        IO.println(OuterClass.staticOuterField);
    }
}
