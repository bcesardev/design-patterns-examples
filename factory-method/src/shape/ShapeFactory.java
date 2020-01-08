package shape;

public class ShapeFactory {

    public static Shape newShape(ShapeType type) {
        try {
            return (Shape) type.getClazz().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
