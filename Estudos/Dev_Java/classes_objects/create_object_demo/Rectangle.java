public class Rectangle {
    public PointArea origin;
    public int width = 0;
    public int height = 0;

    public Rectangle() {
        origin = new PointArea(0, 0);
    }

    public Rectangle(
        PointArea p
    ) {
        origin = p;
    }

    public Rectangle(
        int w, int h
    ) {
        origin = new PointArea(0, 0);

        width = w;

        height = h;
    }

    public Rectangle(
        PointArea p,
        int w, int h
    ) {
        origin = p;

        width = w;

        height = h;
    }

    public void move(
        int x, int y
    ) {
        origin.setX(x);

        origin.setY(y);
    }

    public int getArea() {
        return width * height;
    }
}
