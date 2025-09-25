package Estudos.Dev_Java.classes_objects.nested_classes;

public class DaysOfWeekDemo {
    public static void main(
        String... args
    ) {
        DaysOfWeek weekStart = DaysOfWeek.MONDAY; 

        if (
            weekStart == DaysOfWeek.MONDAY
        ) {
            IO.println(
                "The week starts on Monday."
            );
        }

        DaysOfWeek someDay = DaysOfWeek.FRIDAY;

        switch (
            someDay
        ) {
            case MONDAY -> IO.println(
                "The week just started."
            );
            case TUESDAY, WEDNESDAY, THURSDAY -> IO.println(
                "We are somewhere in the middle of the week."
            );
            case FRIDAY -> IO.println(
                "The weekend is near."
            );
            case SATURDAY, SUNDAY -> IO.println(
                "Weekend."
            );
            default -> throw new AssertionError(
                "Should not happen"
            );
        }

        // or

        String text = switch (
            someDay
        ) {
            case MONDAY -> "The week just started.";
            case TUESDAY, WEDNESDAY, THURSDAY -> "We are somewhere is the middle of the week";
            case FRIDAY -> "The weekend is near.";
            case SATURDAY, SUNDAY -> "Weekend";
        };

        IO.println(
            text
        );
    }
}