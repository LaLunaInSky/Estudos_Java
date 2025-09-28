import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfWeekDemo {

    public void compareDaysOfWeek(DaysOfWeek daysOfWeek) {
        int comparison = daysOfWeek.compareTo(DaysOfWeek.WEDNESDAY);

        if (comparison < 0) {
            IO.println("It's before the middle of the work week.");
        } else if (comparison > 0) {
            IO.println("It's after the middle of the work week.");
        } else {
            IO.println("It's the middle of the work week");
        }
    }

    public static void main(String... args) {
        DaysOfWeek weekStart = DaysOfWeek.MONDAY;

        if (weekStart == DaysOfWeek.MONDAY) {
            IO.println("The week starts on Monday.");
        }

        DaysOfWeek someDay = DaysOfWeek.FRIDAY;

        switch (someDay) {
            case MONDAY -> IO.println("The week just started.");
            case TUESDAY, WEDNESDAY, THURSDAY -> IO.println(
                "We are somewhere in the middle of the week."
            );
            case FRIDAY -> IO.println("The weekend is near.");
            case SATURDAY, SUNDAY -> IO.println("Weekend.");
            default -> throw new AssertionError("Should not happen");
        }

        // or

        String text = switch (someDay) {
            case MONDAY -> "The week just started.";
            case
                TUESDAY,
                WEDNESDAY,
                THURSDAY -> "We are somewhere is the middle of the week";
            case FRIDAY -> "The weekend is near.";
            case SATURDAY, SUNDAY -> "Weekend";
        };

        IO.println(text);

        IO.println();

        IO.println(DaysOfWeek.MONDAY.name());

        IO.println(DaysOfWeek.MONDAY.ordinal());

        IO.println();

        DaysOfWeek[] days = DaysOfWeek.values();

        DaysOfWeek monday = DaysOfWeek.valueOf("MONDAY");

        IO.println(days);
        IO.println(monday);

        List<DaysOfWeek> days_2 = new ArrayList<>(
            List.of(DaysOfWeek.FRIDAY, DaysOfWeek.TUESDAY, DaysOfWeek.SATURDAY)
        );

        Collections.sort(days_2);

        IO.println(days_2);
    }
}
