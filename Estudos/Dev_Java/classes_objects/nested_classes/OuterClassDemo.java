package Estudos.Dev_Java.classes_objects.nested_classes;

import Estudos.Dev_Java.classes_objects.nested_classes.OuterClass.StaticNestedClass;

public class OuterClassDemo {
    public static void main(
        String... args
    ) {
        IO.println(
            "Inner class:\n" +
            "------------"
        );

        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
    
        innerObject.accessMembers();

        IO.println(
            "\nStatic nested class:\n" +
            "--------------------"
        );

        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(
            outerObject
        );

        IO.println(
            "\nTop-level class:\n" +
            "--------------------"
        );
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(
            outerObject
        );
    }
}
