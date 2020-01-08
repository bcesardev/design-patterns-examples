package shape.factories;

import shape.FillCircle;
import shape.FillSquare;
import shape.Shape;

public class FillShapeFactory extends ShapeAbstractFactory {

    private static FillShapeFactory instance;

    private FillShapeFactory() {
    }

    public static FillShapeFactory getInstance() {
        if (instance == null) {
            instance = new FillShapeFactory();
        }
        return instance;
    }

    @Override
    public Shape newShape(String type) {
        if (type.equals("circle")) {
            return new FillCircle();
        } else if (type.equals("square")) {
            return new FillSquare();
        }

        return null;
    }
}
