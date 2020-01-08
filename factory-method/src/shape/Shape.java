package shape;

import java.awt.*;

public abstract class Shape {

    private Color color;

    public abstract void draw(Graphics g);

    public void setColor(int r, int g, int b){
        this.color = new Color(r,g,b);
    }

    public Color getColor() {
        return color;
    }
}
