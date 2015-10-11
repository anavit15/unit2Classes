import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.GradientPaint;


/**
 * Will create the gradient background of the cityscape.
 * 
 * @author Anavi Tekriwal 
 * @version October 1, 2015
 */
public class Background
{
    /** width of the frame */
    private int  w;
    /** height of the frame */
    private int  h;
    /** variable that reprents the fraction 1/3 */
    private final float  ONE_THIRD=(float)1.0/3;
    /** variable that reprents the fraction 2/3 */
    private final float TWO_THIRD=(float)2.0/3;
    /** variable that reprents the fraction 3/4 */
    private final float THREE_FOURTH=(float)3.0/4;
    /**
     *Constructor for Background class that specifies the width and height of the rectangle that the background should fill
     */
    public Background()
    {
        // initialise instance variables
       this.w=1300;
       this.h=800;

       
    }

    /**
     * Draws the gradient background of the frame
     *
     *
     * @post    will draw the background
     * @param     provides graphics context
     *  
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Color color1= new Color(125,79,255);//dark purple
        Color color2= new Color(209,200,236);//light purple
        Color color3= new Color(255,235,214);//light orange
        Color color4= new Color(255,163,61);//dark orange
        Color color5= new Color(130,196,255);//blue water
        GradientPaint gp= new GradientPaint(
        0,0, color1,
        0,h*(this.ONE_THIRD), color2);
        g2.setPaint(gp);
        g2.fillRect(0,0,w,(int)(h*ONE_THIRD));
        GradientPaint gp2= new GradientPaint(
        0,h*ONE_THIRD, color2,
        0,(int)(h*.5), color3);
        g2.setPaint(gp2);
        g2.fillRect(0,(int)(h*ONE_THIRD),w,(int)(h*.5));
        /*GradientPaint gp3= new GradientPaint(
        0,(int)(h*.5), color3,
        0,(int)(h*.6), color3);
        g2.setPaint(gp3);
        g2.fillRect(0,(int)(h*.5),w,(int)(h*.6));*/
        
        //create the water
        GradientPaint gp4= new GradientPaint(
        0,(int)(h*.6), color5,
        0,(int)(h*.8), color3);
        g2.setPaint(gp4);
        g2.fillRect(0,(int)(h*.6),w,(int)(h));
    }

}
