import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.*;
/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon
{
    // instance variables - replace the example below with your own
    /** Location of the top left x coordinate of the building */
    private int xLeft;
    /** Location of the top left y coordinate of the building */
    private int yTop;

    /**
     * Constructor for objects of class Moon
     */
    public Moon(int x, int y)
    {
        // initialise instance variables
        xLeft= x;
        yTop=y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
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
