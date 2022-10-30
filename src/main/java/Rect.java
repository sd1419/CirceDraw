import java.awt.*;

public class Rect {


/**
 *  The Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */

    private int x;	// Fields
    private int y;	// AWT class Point
    private int width;// AWT class Color
    private int height;
    private Color col;

    public Rect(int initx,  int inity,  int initwidth,int initheight, Color initcol){ // The constructor
        x = initx;	// Initialize the fields of the object
        y= inity;
        width = initwidth;
        height = initheight;
        col = initcol;
    }

    public void draw(Graphics g) {	// A method that draws the rectangle in g
        g.setColor(col);
        g.fillRect(x, y,width,height);
    }
}
