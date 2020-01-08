import gui.Window;
import shape.*;
import shape.factories.ShapeFactory;
import shape.types.ShapeType;

public class App {

    public static void main(String[] args) {

        Window w = new Window("Shapes", 300, 300);
        w.show();

        Shape shape = ShapeFactory.newShape(ShapeType.SQUARE);

        w.drawShape(shape);
    }
}
