package numbers;
public class TrigonometricDemo {
    public static void main(
        String... args
    ) {
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.printf(
            "The value of \"pi\" is %.4f%n",
            Math.PI
        );

        System.out.printf(
            "The sine of %.1f degrees is %.4f%n",
            degrees, Math.sin(radians)
        );

        System.out.printf(
            "The cosine of %.1f degrees is %.4f%n",
            degrees, Math.cos(radians)
        );

        System.out.printf(
            "The tangent of %.1f degrees is %.4f%n",
            degrees, Math.tan(radians)
        );

        System.out.printf(
            "The arcsine of %.4f is %.4f degress %n",
            Math.sin(radians),
            Math.toDegrees(
                Math.asin(
                    Math.sin(
                        radians
                    )
                )
            )
        );

        System.out.printf(
            "The arccosine of %.4f is %.4f degrees %n",
            Math.cos(radians),
            Math.toDegrees(
                Math.acos(
                    Math.cos(
                        radians
                    )
                )
            )
        );

        System.out.printf(
            "The arctangent of %.4f is %.4f degrees %n",
            Math.tan(radians),
            Math.toDegrees(
                Math.atan(
                    Math.tan(
                        radians
                    )
                )
            )
        );
    }
}
