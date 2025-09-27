public class OuterClass {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    class InnerClass {

        void accessMembers() {
            IO.println(outerField);

            IO.println(staticOuterField);
        }
    }

    static class StaticNestedClass {

        void accessMembers(OuterClass outer) {
            IO.println(outer.outerField);

            IO.println(staticOuterField);
        }
    }
}
