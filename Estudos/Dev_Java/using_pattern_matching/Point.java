public class Point {
    private int x;
    private int y;

    public boolean equals(
        Object o
    ) {
        // if(!(
        //     o instanceof Point
        // )) {
        //     return false;
        // }

        // Point point = (Point) o;

        // return x == point.x && y == point.y;
    
        // Or
        return o instanceof Point point &&
            x == point.x &&
            y == point.y;
    }
}
