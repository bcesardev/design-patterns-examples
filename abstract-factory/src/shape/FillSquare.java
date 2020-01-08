package shape;

import java.awt.*;

public class FillSquare extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(0, 0, 50, 50);
    }
}
