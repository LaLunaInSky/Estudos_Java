import java.time.DayOfWeek;

public class SwitchDemo4 {
    public static void main(
        String[] args
    ) {
        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
        
        // Before
        //int len = 0;

        // switch (dayOfWeek) {
        //     case DayOfWeek.MONDAY:
        //     case DayOfWeek.FRIDAY:
        //     case DayOfWeek.SUNDAY:
        //         len = 6;
        //         break;
        //     case DayOfWeek.TUESDAY:
        //         len = 7;
        //         break;
        //     case DayOfWeek.THURSDAY:
        //     case DayOfWeek.SATURDAY:
        //         len = 8;
        //         break;
        //     case DayOfWeek.WEDNESDAY:
        //         len = 9;
        //         break;
        // }

        // After
        int len =
            switch (dayOfWeek) {
                case DayOfWeek.MONDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY -> 6;
                case DayOfWeek.TUESDAY -> 7;
                case DayOfWeek.THURSDAY, DayOfWeek.SATURDAY -> 8;
                case DayOfWeek.WEDNESDAY -> 9;
            };

        System.out.println(
            "len = " + len
        );
    }
}
