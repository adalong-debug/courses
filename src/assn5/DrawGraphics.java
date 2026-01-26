package assn5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
  //add ArrayList boxes
    ArrayList<BouncingBox> myboxes = new ArrayList<BouncingBox>(3);

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(1,-2);
        //add new boxes
        myboxes.add(new BouncingBox(50, 50, Color.GREEN));
        myboxes.add(new BouncingBox(60, 60, Color.BLUE));
        myboxes.add(new BouncingBox(70, 70, Color.ORANGE));
        
        for(BouncingBox mybox: myboxes) {
        	mybox.setMovementVector(1,-2);
        }
    }

    /** Draw the contents of the window on surface.
        Called 20 times/second.*/
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(50, 50, 30, 10);
        surface.drawArc(30,100,50,50,0,200);
        int[] xPoints = {180, 200, 250, 180};
        int[] yPoints = {40, 60, 70, 120};
        surface.drawPolygon(xPoints, yPoints, 4);
        box.draw(surface);
        //draw boxes
        for(BouncingBox mybox: myboxes) {
        	mybox.draw(surface);
        }
    }
}
