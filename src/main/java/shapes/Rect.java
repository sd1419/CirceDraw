package shapes;

import java.awt.*;

public class Rect extends Shape{


/**
 *  The shapes.Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */


    private int width;// AWT class Color
    private int height;



    public Rect( int initwidth,int initheight){ // The constructor
        super(new Point(10,10), Color.blue);

        width = initwidth;
        height = initheight;
    }

    public void draw(Graphics g) {	// A method that draws the rectangle in g
        g.setColor(super.col);
        g.fillRect(super.pos.x, super.pos.y,width,height);
    }
}
