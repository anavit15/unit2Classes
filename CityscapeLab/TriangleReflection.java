import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.*;
import java.applet.*;

/**
 * Creates a tiered rectangle building 
 * 
 * Anavi Tekriwal 
 * @October 5
 */
public class TriangleReflection 
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
     * Constructor for object of class TriangleReflection that specifies the size and location of the triangle
     */
    public TriangleReflection(int x, int y, int w, int h)
    {
        // initialise instance variables
        xLeft= x;
        yTop=y;
        xWidth=w;
        yHeight=h;
    }

    /**
     * Draws a reflected triangle
     *
     * @post        draws an upside down triangle that is less opaque
    
     * @param   provides graphics context

     */
    public void draw(Graphics g)
    {
       Color color =new Color(140,140, 140, 100);//lighter black
       g.setColor(color);
       int xs []={xLeft, xLeft+((int)(xWidth*.5)), xLeft+xWidth};
       int ys []= {yTop,yTop+yHeight, yTop};
       Polygon building3Part2Reflection= new Polygon (xs,ys, 3);
       g.fillPolygon(building3Part2Reflection);
        
        
    }

}
