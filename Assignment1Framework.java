
import javax.swing.*;

public class Assignment1Framework
{
    public static void main(String[] args)
    {
        new Assignment1Framework();
    }
    
    public Assignment1Framework()
    {        
        //Defining the geometric objects that represent the problem data
        RectPolygon[] polygons = new RectPolygon[3];
        
        Point p = new Point(5, 6);
        Point q = new Point(10, 370);
        RectPolygon turnpikePolygon  = new RectPolygon();
        turnpikePolygon.addVertex(p);
        turnpikePolygon.addVertex(q);
        polygons[0] = turnpikePolygon; //Florida Turnpike
        
        // p = new Point(10, 13);
        // q = new Point(420, 26);
        // polygons[1] = new Rectangle(p, q); //8th st.

        // p = new Point(421, 10);
        // q = new Point(430, 410);
        // polygons[2] = new Rectangle(p, q); //107th Ave.
        
        //graphing
        FrameDisplay frame = new FrameDisplay(450, 450, polygons);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
