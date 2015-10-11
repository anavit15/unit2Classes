import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.*;
/**
 * Draws a moon
 * 
 * @Anavi Tekriwal 
 * @October 9,2015
 */
public class Moon
{
    // instance variables - replace the example below with your own
    /** Location of the top left x coordinate of the building */
    private int xLeft;
    /** Location of the top left y coordinate of the building */
    private int yTop;

    /**
     * Constructor for objects of class Moon that specifies the location of the object
     */
    public Moon(int x, int y)
    {
        // initialise instance variables
        xLeft= x;
        yTop=y;
    }

    /**
     * Draws the moon
     * @param  provides graphics context
       * @post    draws a moon
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Color color=new Color (217,217,230);
        Ellipse2D.Double moon= new Ellipse2D.Double(xLeft,yTop,50,50);
        g2.setColor(color);
        g2.fill(moon);
    }
}
