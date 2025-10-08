package implementing_an_interface;

public class TestSimpleTimeClient {
    void main() {
        TimeClient myTimeClient = new SimpleTimeClient();

        System.out.printf(
            "%n" +
            "Current time: %s\nTime in California: %s" +
            "%n%n",
            myTimeClient.toString(),
            myTimeClient.getZonedDateTime(
                "Blah blah"
            ).toString()
        );
    }
}