import gui.Window;
import shape.*;
import shape.Shape;

import java.awt.*;

public class App {

    public static void main(String[] args) {

        Window w = new Window("Shapes", 300, 300);
        w.show();

        Shape colorShape = new ColorShape(new Square(), Color.RED);
        Shape dashLineShape = new DashLineShape(new Square());
        Shape dashLineWithColor = new DashLineShape(new ColorShape(new Circle(), Color.CYAN));

        w.drawShape(dashLineWithColor);
    }
}
