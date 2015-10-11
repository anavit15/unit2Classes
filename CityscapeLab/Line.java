import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.*;
/**
 * Creates a line
 * 
 * Anavi Tekriwal 
 * October 5, 2015
 */
public class Line
{
    // instance variables - replace the example below with your own
   /** X coordinate of the first point of the line */
   private int x1;
   /** Y coordinate of the first point of the line*/
   private int y1;
   /** X coordinate of the second point of the line */
   private int x2;
   /** Y coordinate of the second point of the line*/
   private int y2;
   /** width of the line*/
   private float penWidth;
   
   
 
    /**
     * Constructor for objects of class FilledCircle that specifies the coordinates of the two points that make up the line and the width of the line
     */
    public Line(int x1,int y1, int x2, int y2,int w)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.penWidth=w;
        
    }

    /**
     * Draws a line
     * 
     * @param    provides graphics context
     * @post     draws a line
     */
    public void draw(Graphics2D g2)
    {
        g2.setStroke(new BasicStroke(penWidth));
        Line2D.Float line=new Line2D.Float(x1, y1, x2, y2);
        g2.setColor(Color.BLACK);
        g2.draw(line);
        
        
    }
    
    

}

