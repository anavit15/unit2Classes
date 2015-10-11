import java.awt.Graphics2D;
import java.awt.Color;

/**
 * Draws a rotated ferris wheel
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FerrisWheelRotated
{
    /** description of instance variable x (add comment for each instance variable) */
    /** first line*/
   private Line line1;
   /** second line*/
   private Line line2;
   /** third line*/
   private Line line3;
   /** fourth line*/
    private Line line4;
   /** car 1 on the ferris wheel*/
   private Building car1;
   /** car 2 on the ferris wheel*/
   private Building car2; 
   /** car 3 on the ferris wheel*/
   private Building car3;
   /** car 4 on the ferris wheel*/
   private Building car4;
   /** car 5 on the ferris wheel*/
   private Building car5;
   /** car 6 on the ferris wheel*/
   private Building car6;
   /** car 7 on the ferris wheel*/
   private Building car7;
   /** car 8 on the ferris wheel*/
   private Building car8;
   /** describes which mode the ferris wheel is in (rotated or not)*/
    private Boolean mode;
    
    
    /**
     * Default constructor for objects of class FerrisWheelRotated that specifies where the lines and cars should be
     */
    public FerrisWheelRotated()
    {
        // initialise instance variables
        this.line1=new Line (1090, 80, 955, 410, 7); 
        this.line2=new Line (850, 195, 1185, 315, 7);
        this.line3=new Line (1175, 185, 875, 320, 7);
        this.line4=new Line (950, 95, 1083, 408, 7);
        
        this.car1=new Building(1070,60,40,40); 
        this.car2=new Building(935,390,40,40);   
        this.car3=new Building(830,175,40,40);
        this.car4=new Building(1165,295,40,40);
        this.car5=new Building(1165,165,40,40);
        this.car6=new Building(845,300,40,40);
        this.car7=new Building(930,65,40,40);
        this.car8=new Building(1063,398,40,40);
        
        
        
}
     /**
  * Draws the ferris wheel in its rotated mode using the Line and Building classes
    
     * @post    draws a rotated ferris wheel
     * @param    provides graphics context
   
     */
    public void draw (Graphics2D g2)
    {
        // put your code here
        
        
        /*LineReflection leftPillarReflection=new LineReflection (1020,745, 950, 475, 15);
        leftPillarReflection.draw(g2);
        LineReflection bottomPillarReflection=new LineReflection (950,475, 1090, 475, 15);
        bottomPillarReflection.draw(g2);
        LineReflection rightPillarReflection=new LineReflection (1020,745, 1090, 475, 15);
        rightPillarReflection.draw(g2);*/
        
        Line leftPillar=new Line (1020,265, 950, 475, 15);
        leftPillar.draw(g2);
        Line bottomPillar=new Line (950,475, 1090, 475, 15);
        bottomPillar.draw(g2);
        Line rightPillar=new Line (1020,265, 1090, 475, 15);
        rightPillar.draw(g2);
        
        /*LineReflection line1Reflection=new LineReflection (1020, 550, 1020, 905, 7);
        line1Reflection.draw(g2);
        LineReflection line2Reflection=new LineReflection (845, 735, 1200, 735, 7);
        line2Reflection.draw(g2);
        LineReflection line3Reflection=new LineReflection (1110, 850, 890, 610, 7);
        line3Reflection.draw(g2);
        LineReflection line4Reflection=new LineReflection (900, 840, 1168, 622, 7);
        line4Reflection.draw(g2);
        */
        
        line1.draw(g2);
        line2.draw(g2);
        line3.draw(g2);
        line4.draw(g2);
        
        /*BuildingReflection car1Reflection=new BuildingReflection(1000,530,40,40);
        car1Reflection.draw(g2);
        BuildingReflection car2Reflection=new BuildingReflection(825,715,40,40);
        car2Reflection.draw(g2);
        BuildingReflection car3Reflection=new BuildingReflection(1180,715,40,40);
        car3Reflection.draw(g2);
        BuildingReflection car4Reflection=new BuildingReflection(870,590,40,40);
        car4Reflection.draw(g2);
        BuildingReflection car5Reflection=new BuildingReflection(1148,602,40,40);
        car5Reflection.draw(g2);
       */
        car1.draw(g2);
        car2.draw(g2);
        car3.draw(g2);
        car4.draw(g2);
        car5.draw(g2);;
        car6.draw(g2);
        car7.draw(g2);
        car8.draw(g2);
    
    
       /* CircleReflection wheelCenterReflection=new CircleReflection(10,1000,720);
        wheelCenterReflection.draw(g2);*/
        
        Circle wheelCenter=new Circle(10,1000,240);
        wheelCenter.draw(g2);
    }

}
