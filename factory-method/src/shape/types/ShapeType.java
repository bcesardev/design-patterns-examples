package shape.types;

import shape.Circle;
import shape.Square;

public enum ShapeType {

    SQUARE(Square.class), CIRCLE(Circle.class);

    private final Class clazz;

    ShapeType(Class clazz) {
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }
}
