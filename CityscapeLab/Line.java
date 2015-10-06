import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.*;
/**
 * Creates the center of the ferris wheel
 * 
 * Anavi Tekriwal 
 * October 5, 2015
 */
public class Line
{
    // instance variables - replace the example below with your own
   private int x1;
   private int y1;
   private int x2;
   private int y2;
   private float penWidth;
    /**
     * Constructor for objects of class FilledCircle
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        g2.setStroke(new BasicStroke(penWidth));
        Line2D.Float line=new Line2D.Float(x1, y1, x2, y2);
        g2.setColor(Color.BLACK);
        g2.draw(line);
        
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void rotate()
    {
        // put your code here
        Graphics2D g2d=(Graphics 2D) g2
    }

}

