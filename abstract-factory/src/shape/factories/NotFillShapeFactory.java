package shape.factories;

import shape.NotFillCircle;
import shape.NotFillSquare;
import shape.Shape;

public class NotFillShapeFactory extends ShapeAbstractFactory {

    private static NotFillShapeFactory instance;

    private NotFillShapeFactory() {
    }

    public static NotFillShapeFactory getInstance() {
        if (instance == null) {
            instance = new NotFillShapeFactory();
        }
        return instance;
    }

    @Override
    public Shape newShape(String type) {
        if (type.equals("circle")) {
            return new NotFillCircle();
        } else if (type.equals("square")) {
            return new NotFillSquare();
        }

        return null;
    }
}
