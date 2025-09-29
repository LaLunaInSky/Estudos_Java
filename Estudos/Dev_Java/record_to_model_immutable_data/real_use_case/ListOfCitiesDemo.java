package real_use_case;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfCitiesDemo {
    public static void main(
        String... args
    ) {
        List<City> cities = List.of();

        Map<State, Long> numberOfCitiesPerState = cities.stream().collect(
            Collectors.groupingBy(
                City::state,
                Collectors.counting()
            )
        );

        // Map.Entry<State, Long> stateWithTheMostCities = numberOfCitiesPerState.entrySet().stream().max(
        //     Map.Entry.comparingByValue()
        // ).orElseThrow();

        // or 
        NumberOfCitiesPerState stateWithTheMostCities = numberOfCitiesPerState.entrySet().stream().map(
            NumberOfCitiesPerState::new
        ).max(
            NumberOfCitiesPerState.comparingByNumberOfCities()
        ).orElseThrow();

        IO.println(
            stateWithTheMostCities
        );
    }
}
