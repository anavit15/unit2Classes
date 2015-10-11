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
public class Shadow
{
    // instance variables - replace the example below with your own
    /** Location of the top left x coordinate of the building */
    private int xLeft;
    /** Location of the top left y coordinate of the building */
    private int yTop;

    /**
     * Constructor for objects of class Moon
     */
    public Shadow(int x, int y)
    {
        // initialise instance variables
        this.xLeft= x;
        this.yTop=y;
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
        //Color color=new Color (217,217,230);
        Ellipse2D.Double shadow= new Ellipse2D.Double(this.xLeft,this.yTop,50,50);
        g2.setColor(Color.BLACK);
        g2.fill(shadow);
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void move()
    {
        // put your code here
        this.xLeft-=20;
        this.yTop-=10;
    }

}
