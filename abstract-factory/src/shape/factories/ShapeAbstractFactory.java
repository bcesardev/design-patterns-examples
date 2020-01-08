package shape.factories;

import shape.Shape;

public abstract class ShapeAbstractFactory {

    public abstract Shape newShape(String type);

}
