package Estudos.Dev_Java.classes_objects.nested_classes;

public class ShadowTestDemo {
    public static void main(
        String... args
    ) {
        ShadowTest shadowTest = new ShadowTest();
        ShadowTest.FirstLevel firstLevel = shadowTest.new FirstLevel();

        firstLevel.methodFirstLevel(
            23
        );
    }
}
