package create_object;

public class CreateObjectDemo {
    public static void main(
        String... args
    ) {
        Point originOne = new Point(
            23, 
            94
        );

        Rectangle rectOne = new Rectangle(
            originOne, 
            100, 
            200
        );

        Rectangle rectTwo = new Rectangle(
            50, 
            100
        );

        // display reactOne's width, height and area
        IO.println(
            "Width of rectOne: " + rectOne.width
        );

        IO.println(
            "Height of rectOne: " + rectOne.height
        );

        IO.println(
            "Area of rectOne: " + rectOne.getArea()
        );

        // set reactTwo's position
        rectTwo.origin = originOne;

        // display rectTwo's position
        IO.println(
            "X Position of rectTwo: " + rectTwo.origin.getX()
        );

        IO.println(
            "Y Position of rectTwo: " + rectTwo.origin.getY()
        );

        // move rectTwo and display its new position
        rectTwo.move(
            40, 
            72
        );

        IO.println(
            "X Position of rectTwo: " + rectTwo.origin.getX()
        );

        IO.println(
            "Y Position of rectTwo: " + rectTwo.origin.getY()
        );
    }
}
