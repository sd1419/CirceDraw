package shapes;

import java.awt.*;

public class Square extends Rect{

    private int l;
    public Square(int length){
        super(length, length);// The constructor
        l = length;
    }

    public void draw(Graphics g) {	// A method that draws the rectangle in g
        g.setColor(super.col);
        g.fillRect(super.pos.x, super.pos.y,l,l);
    }
}
