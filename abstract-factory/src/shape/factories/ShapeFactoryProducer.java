package shape.factories;

public class ShapeFactoryProducer {

    private ShapeFactoryProducer() {
    }

    public static ShapeAbstractFactory getFactory(boolean fill) {
        return fill ? FillShapeFactory.getInstance() : NotFillShapeFactory.getInstance();
    }
}
