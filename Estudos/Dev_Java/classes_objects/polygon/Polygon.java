public class Polygon {
    // method goes here
}

public Polygon polygonFrom(
    Point... corners
) {
    int numberOfSides = corners.length;

    double squareOfSide_1, lengthOfSide_1;

    squareOfSide_1 = (
        corners[1].x - corners[0].x
    ) * (
        corners[1].x - corners[0].x
    ) + (
        corners[1].y - corners[0].y
    ) * (
        corners[1].y - corners[0].y
    );

    lengthOfSide_1 = Math.sqrt(squareOfSide_1);
}