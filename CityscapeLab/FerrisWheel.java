

/**
 * Write a description of class FerrisWheel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FerrisWheel
{
    /** description of instance variable x (add comment for each instance variable) */
    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;
    private Building car1;
    private Building car2;
    private Building car3;
    private Building car4;
    private Building car5;
    private Building car6;
    private Building car7;
    private Building car8;
    private Boolean mode;

    /**
     * Default constructor for objects of class FerrisWheel
     */
    public FerrisWheel()
    {
        // initialise instance variables
        this.line1=new Line (1020, 70, 1020, 425, 7); 
        this.line2=new Line (845, 255, 1200, 255, 7);
        this.line3=new Line (1152, 130, 900, 375, 7);
        this.line4=new Line (890, 126, 1143, 378, 7);
        
        this.car1=new Building(1000,50,40,40); 
        this.car2=new Building(1000,405,40,40);   
        this. car3=new Building(825,235,40,40);
        this.car4=new Building(1180,235,40,40);
        this.car5=new Building(1132,110,40,40);
        this.car6=new Building(880,355,40,40);
        this.car7=new Building(870,106,40,40);
        this.car8=new Building(1123,358,40,40);
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
    public void draw (Graphics2D g2)
    {
        // put your code here
        LineReflection leftPillarReflection=new LineReflection (1020,745, 950, 475, 15);
        leftPillarReflection.draw(g2);
        LineReflection bottomPillarReflection=new LineReflection (950,475, 1090, 475, 15);
        bottomPillarReflection.draw(g2);
        LineReflection rightPillarReflection=new LineReflection (1020,745, 1090, 475, 15);
        rightPillarReflection.draw(g2);
        
        Line leftPillar=new Line (1020,265, 950, 475, 15);
        leftPillar.draw(g2);
        Line bottomPillar=new Line (950,475, 1090, 475, 15);
        bottomPillar.draw(g2);
        Line rightPillar=new Line (1020,265, 1090, 475, 15);
        rightPillar.draw(g2);
        
        LineReflection line1Reflection=new LineReflection (1020, 550, 1020, 905, 7);
        line1Reflection.draw(g2);
        LineReflection line2Reflection=new LineReflection (845, 735, 1200, 735, 7);
        line2Reflection.draw(g2);
        LineReflection line3Reflection=new LineReflection (1110, 850, 890, 610, 7);
        line3Reflection.draw(g2);
        LineReflection line4Reflection=new LineReflection (900, 840, 1168, 622, 7);
        line4Reflection.draw(g2);
        
    
        line1.draw(g2);
        line2.draw(g2);
        line3.draw(g2);
        line4.draw(g2);
        
        BuildingReflection car1Reflection=new BuildingReflection(1000,530,40,40);
        car1Reflection.draw(g2);
        BuildingReflection car2Reflection=new BuildingReflection(825,715,40,40);
        car2Reflection.draw(g2);
        BuildingReflection car3Reflection=new BuildingReflection(1180,715,40,40);
        car3Reflection.draw(g2);
        BuildingReflection car4Reflection=new BuildingReflection(870,590,40,40);
        car4Reflection.draw(g2);
        BuildingReflection car5Reflection=new BuildingReflection(1148,602,40,40);
        car5Reflection.draw(g2);
       
        car1.draw(g2);
        car2.draw(g2);
        car3.draw(g2);
        car4.draw(g2);
        car5.draw(g2);;
        car6.draw(g2);
        car7.draw(g2);
        car8.draw(g2);
    
    
    CircleReflection wheelCenterReflection=new CircleReflection(10,1000,720);
    wheelCenterReflection.draw(g2);
        
    Circle wheelCenter=new Circle(10,1000,240);
    wheelCenter.draw(g2);
    }

}
