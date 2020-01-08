import gui.Window;
import shape.*;

public class App {

    public static void main(String[] args) {

        Window w = new Window("Shapes", 300, 300);
        w.show();

        Shape shape = ShapeFactory.newShape(ShapeType.SQUARE);

        w.drawShape(shape);
    }
}
