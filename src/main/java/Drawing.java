

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of AWT class Frame..
    private Frame f;

    private Circle c;
    private Rect r;
    // The constructor
    public Drawing(){
        Point initPoint=new Point(200,200);
        Color color=new Color(0x992266);//

        c = new Circle(initPoint,color,50);
        r = new Rect(10, 10 ,100, 100, color);
        f = new Frame("My window"); 	// Instantiates the Frame
        f.add(this);			// Adds the Canvas (ie this object) to the Frame
        f.setLayout(null);		// Stops the frame from trying to layout contents
        f.setSize(400, 400);		// Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE); 	// Sets the Canvas background
        setSize(400, 400);		// Sets the Canvas size to be the same as the frame
    }

    public void paint(Graphics g){
        c.draw(g);
        r.draw(g);
    }

}
