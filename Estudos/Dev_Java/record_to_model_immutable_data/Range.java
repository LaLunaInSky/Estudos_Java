public record Range(
    int start,
    int end
) {

    // Canonical constructor
    public Range(
        int start,
        int end
    ) {
        if (
            end <= start
        ) {
            throw new IllegalArgumentException(
                "End cannot be lesses than start"
            );
        }

        if (
            start < 0
        ) {
            this.start = 0;
        } else {
            this.start = start;
        }

        if (
            end > 100
        ) {
            this.end = 10;
        } else {
            this.end = end;
        }
    }

    // Compact constructor
    // public Range {
    //     if (
    //         end <= start
    //     ) {
    //         throw new IllegalArgumentException(
    //             "End cannot be lesses than start"
    //         );
    //     }

    //     if (
    //         start < 0
    //     ) {
    //         start = 0;
    //     }

    //     if (
    //         end < 0
    //     ) {
    //         end = 0;
    //     }
    // }
}