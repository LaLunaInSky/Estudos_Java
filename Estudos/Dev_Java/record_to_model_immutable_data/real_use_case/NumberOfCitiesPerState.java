package real_use_case;

import java.util.Comparator;
import java.util.Map;

public record NumberOfCitiesPerState(
    State state,
    long numberOfCities
) {
    public NumberOfCitiesPerState(
        Map.Entry<State, Long> entry
    ) {
        this(
            entry.getKey(),
            entry.getValue()
        );
    }

    public static Comparator<NumberOfCitiesPerState> comparingByNumberOfCities() {
        return Comparator.comparing(
            NumberOfCitiesPerState::numberOfCities
        );
    }
}