package shape.factories;

import shape.Shape;
import shape.types.ShapeType;

public class ShapeFactory {

    private ShapeFactory() {
    }

    public static Shape newShape(ShapeType type) {
        try {
            return (Shape) type.getClazz().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
