package nested_classes;

public class OuterClassDemo {

    public static void main(String... args) {
        IO.println("Inner class:\n" + "------------");

        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        innerObject.accessMembers();

        IO.println("\nStatic nested class:\n" + "--------------------");

        OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        IO.println("\nTop-level class:\n" + "--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);
    }
}
