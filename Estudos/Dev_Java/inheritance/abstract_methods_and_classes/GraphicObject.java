package abstract_methods_and_classes;

abstract class GraphicObject {
    int x, y;

    void moveTo(
        int newX,
        int newY
    ) {
        // Implementation here
    }

    abstract void draw();
    abstract void resize();
}