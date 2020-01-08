import gui.Window;
import shape.Shape;
import shape.factories.ShapeAbstractFactory;
import shape.factories.ShapeFactoryProducer;

public class App {

    public static void main(String[] args) {

        Window w = new Window("Shapes", 300, 300);
        w.show();

        ShapeAbstractFactory factory = ShapeFactoryProducer.getFactory(false);
        Shape shape = factory.newShape("square");

        w.drawShape(shape);
    }
}
