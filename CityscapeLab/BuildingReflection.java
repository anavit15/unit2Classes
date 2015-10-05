import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Bulding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildingReflection extends Background
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Bulding
     */
    public BuildingReflection(int x, int y)
    {
        // initialise instance variables
        xLeft= x;
        yTop=y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Color color =new Color(140,140,140);//lighter black
        Rectangle buildingSquare=new Rectangle ( xLeft,yTop,75,430);
        g2.setColor(color);
        g2.fill(buildingSquare);
    }

}