package vars;

import java.nio.file.Path;
import java.util.List;

public class KeywordVar {
    public static void main(
        String[] args
    ) {
        // Before
        // String message = "Hello, World!";
        // Path path = Path.of("debug.log");
        // InputStream stream = Files.newInputStream(path);

        // After
        // var message = "Hello, World!";
        // var path = Path.of("debug.log");
        // var stream = Files.newInputStream(path);

        var list = List.of(
            "one", "two", "three", "four"
        );

        System.out.println();

        for (
            var element: list
        ) {
            System.out.println(element);
        }

        System.out.println();

        var path = Path.of("debug.log");

        // try (var stream = Files.newInputStream(path)) {
        //     // process the file
        // }

        
    }
}