import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
   

    /**
     * Constructor for object of class Building1 that specify the location of the building
     */
    public CityscapeComponent()
    {
        // initialise instance variables
       
        
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
}
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        Background background=new Background ();
        background.draw(g2);
        
        BuildingReflection buildingReflection1=new BuildingReflection(50,410,75,250);
        buildingReflection1.draw(g2);
        
        Building building1=new Building(50,230,75,250);
        building1.draw(g2);
        
        BuildingReflection building2Part1Reflection=new BuildingReflection(125,410,25,300);
        building2Part1Reflection.draw(g2);
        BuildingReflection building2Part2Reflection=new BuildingReflection(150,410,150,320);
        building2Part2Reflection.draw(g2);
        BuildingReflection building2Part3Reflection=new BuildingReflection(300,410,25,300);
        building2Part3Reflection.draw(g2);
        
        Building building2Part1=new Building(125,180,25,300);
        building2Part1.draw(g2);
        Building building2Part2=new Building(150,160,150,320);
        building2Part2.draw(g2);
        Building building2Part3=new Building(300,180,25,300);
        building2Part3.draw(g2);
        
        BuildingReflection building3Reflection=new BuildingReflection(325,380,60,390);
        building3Reflection.draw(g2);
        TriangleReflection building3TriangleReflection=new TriangleReflection(325,770,60,60);
        building3TriangleReflection.draw(g);
        
        Building building3=new Building(325,90,60,390);
        building3.draw(g2);
        Triangle building3Triangle=new Triangle(325,90,60,60);
        building3Triangle.draw(g);
        
        BuildingReflection building4Reflection=new BuildingReflection(360,410,100, 280);
        building4Reflection.draw(g2);
        
        Building building4=new Building(360,200,100, 280);
        building4.draw(g2);
        
        BuildingReflection building5Part1Reflection=new BuildingReflection(460,410,180,230);
        building5Part1Reflection.draw(g2);
        BuildingReflection building5Part2Reflection=new BuildingReflection(479,640,140,120);
        building5Part2Reflection.draw(g2);
        BuildingReflection building5Part3Reflection=new BuildingReflection(510,760,80,80);
        building5Part3Reflection.draw(g2);
        BuildingReflection building5Part4Reflection=new BuildingReflection(530,900,10,50);
        building5Part4Reflection.draw(g2);
        BuildingReflection building5Part5Reflection=new BuildingReflection(555,900,10,50);
        building5Part5Reflection.draw(g2);
    
        Building building5Part1=new Building(460,250,180,230);
        building5Part1.draw(g2);
        Building building5Part2=new Building(475,130,140,120);
        building5Part2.draw(g2);
        Building building5Part3=new Building(507,50,80,80);
        building5Part3.draw(g2);
        Building building5Part4=new Building(530,0,10,50);
        building5Part4.draw(g2);
        Building building5Part5=new Building(555,0,10,50);
        building5Part5.draw(g2);
        
        BuildingReflection building6Part1Reflection=new BuildingReflection(640,410,180,170);
        building6Part1Reflection.draw(g2);
        BuildingReflection building6Part2Reflection=new BuildingReflection(675,580,120,120);
        building6Part2Reflection.draw(g2);
        BuildingReflection building6Part3Reflection=new BuildingReflection(690,700,90,70);
        building6Part3Reflection.draw(g2);
        
        Building building6Part1=new Building(640,310,180,170);
        building6Part1.draw(g2);
        Building building6Part2=new Building(665,190,120,120);
        building6Part2.draw(g2);
        Building building6Part3=new Building(680,120,90,70);
        building6Part3.draw(g2);
        
       
    
}
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
       // 
        //line1.rotate(mode);
        this.mode=line1.rotate(this.mode);
            if (this.mode==false){
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
    if (this.mode==true){
        
        this.line1=new Line (1136, 80, 1010, 450, 7); 
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
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        
    }

}
