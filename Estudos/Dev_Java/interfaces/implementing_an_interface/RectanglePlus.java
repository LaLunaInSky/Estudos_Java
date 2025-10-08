package implementing_an_interface;

public class RectanglePlus implements Relatable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // Four constructors
    public RectanglePlus() {
        this.origin = new Point(
            0, 0
        );
    }

    public RectanglePlus(
        Point point
    ) {
        this.origin = point;
    }

    public RectanglePlus(
        int width,
        int height
    ) {
        this.origin = new Point(
            0, 0
        );

        this.width = width;
        this.height = height;
    }

    public RectanglePlus(
        Point point,
        int width,
        int height
    ) {
        this.origin = point;
        this.width = width;
        this.height = height;
    }

    // A method for moving the rectangle
    public void move(
        int x,
        int y
    ) {
        this.origin.setX(
            x
        );

        this.origin.setY(
            y
        );
    }

    // A method for computing
    // the area of the rectangle
    public int getArea() {
        return this.width * this.height;
    }

    // A method required to implement
    // the Relatable interface
    public int isLargerThan(
        Relatable other
    ) {
        RectanglePlus otherRectangle = (
            RectanglePlus
        )other;

        if (
            this.getArea() <
            otherRectangle.getArea()
        ) {
            return -1;
        } else if (
            this.getArea() > otherRectangle.getArea()
        ) {
            return 1;
        } else {
            return 0;
        }
    }
}