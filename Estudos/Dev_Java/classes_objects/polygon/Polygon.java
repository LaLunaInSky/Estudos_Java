public class Polygon {
    // method goes here
}

public Polygon polygonFrom(
    Point... corners
) {
    int numberOfSides = corners.length;

    double squareOfSide_1, lengthOfSide_1;

    squareOfSide_1 = (
        corners[1].getX() - corners[0].getX()
    ) * (
        corners[1].getX() - corners[0].getX()
    ) + (
        corners[1].getY() - corners[0].getY()
    ) * (
        corners[1].getY() - corners[0].getY()
    );

    lengthOfSide_1 = Math.sqrt(squareOfSide_1);
}

void main() {
    IO.println("");
}