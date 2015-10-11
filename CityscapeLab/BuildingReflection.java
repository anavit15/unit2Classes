import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Transparency;
/**
 * Creates a reflected building
 * 
 * @author Anavi Tekriwal
 * @version October 9,2015
 */
public class BuildingReflection extends Background
{
    /** Location of the top left x coordinate of the building */
    private int xLeft;
    /** Location of the top left y coordinate of the building */
    private int yTop;
    /** Width of the building */
    private int xWidth;
    /** Height of the Building */
    private int yHeight;
    /**
     * Constructor of class BuldingReflection that specifies the location and size of the building
     */
    public BuildingReflection(int x, int y,int w,int h)
    {
        // initialise instance variables
        xLeft= x;
        yTop=y;
        xWidth=w;
        yHeight=h;
    }
    

    /**
     * Draws a rectangle that is reflected on the water
     *
     * @pre        xLeft and yTop must be ints
     * @post        draws a rectangle
    
     * @param   provides graphics context
     */
    public void draw(Graphics2D g2)
    {
        
        Color color =new Color(140,140, 140, 100);//lighter black
        g2.setColor(color);
        Rectangle building=new Rectangle ( xLeft,yTop,xWidth,yHeight);
        g2.fill(building);
       
    }

}