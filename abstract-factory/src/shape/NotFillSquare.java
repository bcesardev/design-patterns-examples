package shape;

import java.awt.*;

public class NotFillSquare extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect(0, 0, 50, 50);
    }
}
