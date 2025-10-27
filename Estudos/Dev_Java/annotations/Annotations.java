import java.lang.annotation.Documented;

public class Annotations {
    @ClassPreamble (
        author = "LaLunaInSky",
        date = "10/27/2025",
        currentRevision = 2,
        lastModified = "10/28/2025",
        lastModifiedBy = "LaLunaInSky",
        // Note array notation
        reviewers = {"Fulano de tal", "Fulaninho de tal"}
    )

    void main() {
        IO.println(
            "Main"
        );
    }
}

@Documented
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}